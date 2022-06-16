# brick
this is a repo for solving technical test from Brick.

I use java combined with cucumber and selenium to create the automation test.

Here's the steps to run the automation :
Preconditions:
Java installed
IDE installed (here I'm using Intellij as IDE)

Steps:
1. Clone the repository
2. Open it through Intellij
3. Create project from existing sources
4. Finish the remaining steps 
5. Add new configuration
6. Select Cucumber Java
Main Class : io.cucumber.core.cli.Main
Glue : StepDefinitions
Feature or folder path : <Location you put this repository>/brick/src/test/java/Features/registerLogin.feature
Program Arguments :  --plugin org.jetbrains.plugins.cucumber.java.run.CucumberJvm5SMFormatter --name "^Login using registered account$"
6. Click build project
7. Click Run
