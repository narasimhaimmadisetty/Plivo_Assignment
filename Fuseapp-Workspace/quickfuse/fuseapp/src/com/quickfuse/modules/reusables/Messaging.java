package com.quickfuse.modules.reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.quickfuse.base.AppBase;
public class Messaging extends AppBase {

	public static CreatNewPage objCreatNewPage;
	

	public static void clickOnCreateAnAppButton() {
		try {
			objCreatNewPage = new CreatNewPage();
			// creation of new link
			objCreatNewPage.newLink.click();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void creatNewPage() {
		try {
			
			// Clicking on the "Lets get started"
			objCreatNewPage.getStartedButton.click();
			// adding new page
			objCreatNewPage.addingNewPage.click();
			// entering the text for new page.. so that page will be created with this name
			objCreatNewPage.pageName.sendKeys(configProp.getProperty("NEW_PAGE_NAME"));

			// clicking on the create button.. so that page will be created
			
			objCreatNewPage.createButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendEmail() {
		try {
			// clicking on the messaging tab
			
			
			objCreatNewPage.messaging.click();
			// selecting the "send a SMS" to perform the drag and drop operation
			Actions a = new Actions(driver);
			
			WebElement source =	objCreatNewPage.objsource;
			
			//objCreatNewPage.messagingDrag;
			Thread.sleep(4000);
			a.dragAndDropBy(source, 610, 70).build().perform();
			// connecting the node start to send a sms.. start point(dragabble)
			
			WebElement startnode =	objCreatNewPage.objstartnode;
			Thread.sleep(4000);
			// connecting the node start to send a sms.. end point(dropable)
			
			WebElement smsnode =objCreatNewPage.objsmsnode;

			Actions act = new Actions(driver);
			act.dragAndDrop(startnode, smsnode).build().perform();
			// Passing the parameters in send a sms
			
			
			objCreatNewPage.PHONE_NUMBER.sendKeys(configProp.getProperty("PHONE_NUMBER"));
			// Passing the parameters in send a sms
			
			objCreatNewPage.sms.sendKeys(configProp.getProperty("SMS_MESSAGE_TEXT"));

			
			
			WebElement source1 = objCreatNewPage.objsource1;
			
			// selecting the "send a Email" to perform the drag and drop operation
			Thread.sleep(4000);
			a.dragAndDropBy(source1, 920, 210).build().perform();
			
			
			WebElement conncetor1 = objCreatNewPage.objconncetor1;

			Thread.sleep(5000);
			// connecting the node "send a sms" to "send a email".. start point(dropable)
			
			
			WebElement connector2 = objCreatNewPage.objconncetor2;

			act.dragAndDrop(conncetor1, connector2).build().perform();
			Thread.sleep(2000);
			
			
			objCreatNewPage.hostUrl.sendKeys(configProp.getProperty("SMTP_HOSTURL"));
			// Passing the parameters in send a email
			
			objCreatNewPage.portUrl.sendKeys(configProp.getProperty("PORT"));
			// Passing the parameters in send a email
			
			objCreatNewPage.ssl.click();
			// Passing the parameters in send a email
			
			
			objCreatNewPage.userName.sendKeys(configProp.getProperty("USERNAME"));
			// Passing the parameters in send a email
			
			
			objCreatNewPage.pwd.sendKeys(configProp.getProperty("PASSWORD"));
			// Passing the parameters in send a email
			
			
			objCreatNewPage.emailFrom.sendKeys(configProp.getProperty("FROM"));
			// Passing the parameters in send a email
			
			objCreatNewPage.emailTo.sendKeys(configProp.getProperty("TO"));
			// Passing the parameters in send a email
			
			objCreatNewPage.subject.sendKeys(configProp.getProperty("SUBJECT"));
			// Passing the parameters in send a email
			
			objCreatNewPage.smstext.sendKeys(configProp.getProperty("EMAIL_SMS_MESSAGE_TEXT"));
			// Passing the parameters in send a email
			
			Thread.sleep(2000);
			
			// clicking on the Basic side tab
			objCreatNewPage.basictab.click();
			
						
			WebElement source2 = objCreatNewPage.objsource2;
			// selected the Exit tab and performed the drag and drop operation
			a.dragAndDropBy(source2, 470, 270).build().perform();
			Thread.sleep(2000);
			
			
			WebElement connect1 = objCreatNewPage.objconnect1;
			
			// connecting the node "send a sms" to "exit app".. start point(dragabble)
			Thread.sleep(2000);
			
			
			WebElement connect2 = objCreatNewPage.objconnect2;
			
			// connecting the node "send a sms" to "exit app".. start point(dropable)
			act.dragAndDrop(connect1, connect2).build().perform();
			Thread.sleep(3000);

			
			
			WebElement source3 = objCreatNewPage.objsource3;
			// selected the Exit tab and performed the drag and drop operation
			
			a.dragAndDropBy(source3, 1200, 360).build().perform();
			Thread.sleep(2000);
			
			
			
			WebElement connect3 = objCreatNewPage.objconnect3;
			// connecting the node "send a email"[one side] to "exit app".. start
			// point(dragabble)
			Thread.sleep(2000);
			
			
			WebElement connect4  = objCreatNewPage.objconnect4;
			// connecting the node "send a email"[one side] to "exit app".. start
			// point(dropable)
			act.dragAndDrop(connect3, connect4).build().perform();
			Thread.sleep(2000);
			//WebElement source4 = driver.findElement(By.xpath(
					//"//li[@class = 'module-item ui-widget-content ui-corner-all module-item-red ui-draggable']"));
			
			WebElement source4 = objCreatNewPage.objsource4;
			// selected the Exit tab and performed the drag and drop operation
			a.dragAndDropBy(source4, 600, 360).build().perform();
			
			
			WebElement connect5 = objCreatNewPage.objconnect5;
			
			// connecting the node "send a email"[one side] to "exit app".. start
			// point(dragabble)
			Thread.sleep(2000);
			
			
			WebElement connect6 = objCreatNewPage.objconnect6;
			// connecting the node "send a email"[other side] to "exit app".. start
			// point(dropable)
			act.dragAndDrop(connect5, connect6).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
