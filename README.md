# Exercise 4

The aim of this exercise is to create a percentage wheel containing:

  - **A Label** to indicate the percentage value
  - **An interactive PieChart** to modify and visualize the percentage
  - **A Slider** to manipulate and visualize the percentage value

<p align="center"><img src="/img/PercentageWheel.png" width="150"></p>


1. Import this project in Eclipse *To import this project in eclipse, you should open Eclipse and follow these steps:*
   1. *Go to File \> Import...*
   2. *Select Git \> Projects from Git*
   3. *Select Clone URI*
   4. *Fill the URI box with `https://github.com/IntroductionProgIS/Exercise4.git` (All the other parts should be automatically filled)*
   5. *Click on "Next", "Next" and "Finish"*

> *To see the tasks that you need to do in a project: Go to Eclipse and select Window \> Show View \> Tasks*

2. Setup the project properties to add the .jar from javafx to the project and make sure your JRE is in the classpath.

3. Create a run configuration for this project, inside Run As \> Run Configurations, with Main.java as the main class. Inside Arguments for this configuration, add inside the VM arguments : "--add-module=javafx.controls --add-module=javafx.fxml".

4. Understand the construction of the project by looking at the classes in controller, model, view and event packages.

5. Complete the View classes (TODO 1 - 2).

6. Add the views in the application (TODO 3).

7. Complete the model (TODO 4).

8. Complete the controller to make every component reactive to value change (TODO 5).
 

