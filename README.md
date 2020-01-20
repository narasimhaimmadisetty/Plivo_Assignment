# Plivo_Assignment_Explanation
Explantion:
Folder Structure : 
AppBase class path      : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\base\AppBase
Config file             : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\config\
CreatNewpage            : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\reusables
Messaging               : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\reusables
FuseCreateApp(Main Class): Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\scripts


First I have create the Project folder called "fuseapp"
AppBase.java  : It is the base class for the project whete it has Configured Properties file(Path) and Driver/Browser related details

I have created the FuseCreateApp.Java(Main class) : To execute the project ,Where it extends "AppBase" and also it has intialization , Messaging , CreateNewpage classes.

Config.Properties file where all the details like browser, url, test data to be passed in different functionalities are written(For Demo purpose I kept test dat ain properties file but it should be in data driven where we should call test data from excel).

There are two types of packages one is "reusable package" and another one is "Scripts Package"
Under Reusable package I created,
CreatNewpage.java : It has all the Page locators written.

Messaging.Java : I created reusable class where I written two methods " CreatNewpage" and "Send Email"  where it will perfom all page related operations or functionalities.
Under Scripts Package I created a class called 
FuseCreateApp.java  where it has the following methods.

i . FuseCreateApp Constructor 
Where it configured property file. Then
Intialization(): It will intialize the browser(I used chrome driver)  and driver for rest of all calling functionalities 

ii: Messaging(): In this we are calling all the functions(Execution methods)

A. After opening the browser I opened quickfuseapp page by using the URL

B.Created the class name called creatNewpage to perform below operations.
      : Clicking on Create an App button b. clicking on click “Lets’ get started c. Create a new page and giving the page name.
      
C.Created the class called send email to perform below operations.
     C.a : Click on “Messaging” group appearing on the left pane under MODULES C.b. Drag component “Send an SMS” to the main app page & join the line from start acting as connector C.c: Fill the details of Phone Number and Message text.
     
D.Drag component “Send an email” from the left module and join line from “Not sent” output port and  fill all the details of the mail.

E: Click on component “Basic” on left Module and drag “Exit App” joining to “Sent” output port of Sent an sms box.

F: Similarly, Join all the open output ports of “Send an Email” to Exit app by dragging

G : Similarly, Join all the open output ports of “Send an Email” to Exit app by dragging(Sms not sent)

H: Finally created exitapp() in FuseCreateApp.Java to quit the browser.


Note : Need to run the code from FuseCreateApp.java(Main Class).
