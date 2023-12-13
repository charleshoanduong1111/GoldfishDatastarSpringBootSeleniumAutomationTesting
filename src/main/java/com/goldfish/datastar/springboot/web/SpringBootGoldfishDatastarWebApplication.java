package com.goldfish.datastar.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.goldfish.datastar.springboot.web")
public class SpringBootGoldfishDatastarWebApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootGoldfishDatastarWebApplication.class, args);
		
		System.out.println("===> To start the Server Online, please on Browser type LOCALHOST URL as below:");
		System.out.println("===> http://localhost:8080");
		System.out.println("===> To Open H2 Database on Browser type URL  as below:");
		System.out.println("===> http://localhost:8080/h2-console/");
		System.err.println("===> To kill: Web server failed to start. Port 8080 was already in use.");
		System.err.println("===> On Terminal Run: netstat -ano | findstr :8080");
		System.err.println("===> Take note of PID Process-ID, e.g: PID is 6436 >> TCP [::]:8080 [::]:0 LISTENING 6436");
		System.err.println("===> On Terminal Run: taskkill /PID 6436 /F");	

	} 
}
