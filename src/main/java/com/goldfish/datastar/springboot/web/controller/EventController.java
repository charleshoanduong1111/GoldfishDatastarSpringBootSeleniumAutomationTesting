package com.goldfish.datastar.springboot.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.goldfish.datastar.springboot.web.model.Event;
import com.goldfish.datastar.springboot.web.service.EventRepository;

@Controller
@SessionAttributes("name")
public class EventController {

	@Autowired
	EventRepository repository;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showEvents(ModelMap model) {
		if (!model.containsAttribute("name"))
			return "redirect:/login";

		String name = getLoggedInUserName(model);
		model.put("todos", repository.findByUserOrderByTargetDateAsc(name));
		// model.put("todos", service.retrieveEvents(name));
		return "list-todos";
	}

	private String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.GET)
	public String showAddEventPage(ModelMap model) {
		model.addAttribute("todo", new Event(0, getLoggedInUserName(model), "Default Desc", new Date(), false));
		return "todo";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteEvent(@RequestParam int id) {

		// if(id==1)
		// throw new RuntimeException("Something went wrong");
		repository.deleteById(id);
		// service.deleteEvent(id);
		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdateEventPage(@RequestParam int id, ModelMap model) {
		Event todo = repository.findById(id).get();
		// Event todo = service.retrieveEvent(id);
		model.put("todo", todo);
		return "todo";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateEvent(ModelMap model, @Validated Event todo, BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todo.setUser(getLoggedInUserName(model));

		repository.save(todo);
		// service.updateEvent(todo);

		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/add-todo", method = RequestMethod.POST)
	public String addEvent(ModelMap model, @Validated Event todo, BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todo.setUser(getLoggedInUserName(model));
		repository.save(todo);
		/*
		 * service.addEvent(getLoggedInUserName(model), todo.getDesc(),
		 * todo.getTargetDate(), false);
		 */
		return "redirect:/list-todos";
	}
}
