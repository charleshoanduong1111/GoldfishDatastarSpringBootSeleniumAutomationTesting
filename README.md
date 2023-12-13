# selenium.automation.test.junit

Tools:
Eclipse forJava: Eclipse IDE for Java Developers - 2023-12 (eclipse-inst-jre-win64.exe)
Maven: C:\Program Files\maven\apache-maven-3.9.5\bin
JDK: C:\Program Files\Java\jdk1.8.0_231_TEST\bin
ChromeDriver: ./chromedriver-version-120/chromedriver.exe
System.setProperty("webdriver.chrome.driver", "./chromedriver-version-120/chromedriver.exe");
JUnit4
Selenium JAR

https://docs.github.com/en/enterprise-server@3.9/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens

Creating a personal access token
In the upper-right corner of any page, click your profile photo, then click Settings.
Screenshot of a user's account menu on GitHub. The menu item "Settings" is outlined in dark orange.
In the left sidebar, click  Developer settings.
In the left sidebar, click Personal access tokens.
Click Generate new token.
In the "Note" field, give your token a descriptive name.
To give your token an expiration, select Expiration, then choose a default option or click Custom to enter a date.
Select the scopes you'd like to grant this token. To use your token to access repositories from the command line, select repo. A token with no assigned scopes can only access public information. For more information, see "Scopes for OAuth apps."
Click Generate token.
Optionally, to copy the new token to your clipboard, click copy-icon to copy token.

Authentication:
Example: 
User: Use UserID instead Email
Password: Use generated token, i.g: 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

https://medium.com/@AlexanderObregon/getting-started-with-version-control-in-eclipse-ide-git-and-github-integration-a0cca7b15126

Eclipse | GitHub

How to push Eclipse Project to GitHub | Share Eclipse Project to GitHub
Video: https://www.youtube.com/watch?v=B2N1AKIQfnY

Introduction
Version control is an essential tool for developers working on projects, both individually and collaboratively. Git is a widely-used version control system that allows you to track changes in your code and collaborate with other developers. GitHub is a popular web-based hosting service for Git repositories that simplifies collaboration and project management.
In this blog post, we will cover the basics of integrating Git and GitHub into your Eclipse IDE workflow, making it easier to manage your code and collaborate with others.
Prerequisites:
Eclipse IDE installed on your computer.
Git installed on your computer.
A GitHub account.
Step 1: Installing the EGit plugin in Eclipse
Open Eclipse IDE.
Click on “Help” in the top menu and select “Install New Software.”
In the “Work with” field, type 
“http://download.eclipse.org/egit/updates” or 
“https://download.eclipse.org/egit/updates-nightly/”
and press Enter.
Select “Eclipse Git Team Provider” and any additional plugins you’d like to install (e.g., “GitHub Mylyn Connector”).
Click “Next” and follow the installation prompts.
Restart Eclipse when prompted.
Step 2: Configuring Git in Eclipse
In Eclipse, go to “Window” > “Preferences” in the top menu.
In the Preferences window, expand “Team” and select “Git.”
Configure your Git settings, including your user name and email address. These settings will be used for your Git commits.
Click “Apply and Close.”
Step 3: Importing an existing Git repository
In Eclipse, go to “File” > “Import” in the top menu.
In the Import window, expand “Git” and select “Projects from Git.”
Click “Next” and choose “Clone URI” to import a remote repository or “Existing local repository” to import a local repository.
Follow the prompts to provide the necessary repository information (e.g., URI, local destination, branch).
After the repository is cloned or imported, select the desired project(s) and click “Finish.”
Step 4: Creating a new Git repository
In Eclipse, go to “File” > “New” > “Other” in the top menu.
In the New window, expand “Git” and select “Git Repository.”
Click “Next” and choose the location for your new repository.
Click “Finish.”
Step 5: Connecting Eclipse to GitHub
In Eclipse, right-click on your project in the Project Explorer and select “Team” > “Share Project.”
Choose “Git” and click “Next.”
If your project is not already in a Git repository, follow the prompts to create a new one.
Click “Finish.”
Right-click on your project again and select “Team” > “Remote” > “Push.”
In the Push window, enter your GitHub repository URL in the “URI” field.
Provide your GitHub credentials and click “Next.”
Select the branches you want to push and click “Next.”
Review the push settings and click “Finish.”
