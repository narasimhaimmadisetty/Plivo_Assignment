# Plivo_Assignment_Explanation
Explantion:
Folder Structure : 
AppBase class path      : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\base\AppBase
Config file             : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\config\
CreatNewpage            : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\reusables
Messaging               : Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\reusables
FuseCreateApp(Main Class): Fuseapp-Workspace\quickfuse\fuseapp\src\com\quickfuse\modules\scripts
First I have create the Project folder called "fuseapp"

In that I have created the FuseCreate.Java(Main class) : Where it extends "AppBase" and also it has intialization , Messaging , CreateNewpage classes.
AppBase.java  : It has Config Properties file(Path) and Browser related details

CreatNewpage.java : It has all the locators written.

Config.Properties file where all the details like browser, url, test to be passed in tabs are written.

Messaging.Java : I created two classes called " CreatNewpage" and "Send Email" classes where it will perfom all page related operations.

In FuseCreateApp.java I created a class called "FuseCreateApp" where it has the following methods.

i . Intialization(): It will intialize the browser I used chrome driver for browser.

ii: Messaging(): In this where we create the new page and send email operations.

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
