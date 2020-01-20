package com.quickfuse.modules.reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.quickfuse.base.AppBase;

public class CreatNewPage extends AppBase {

	@FindBy(xpath = "(//input[@name='name'])[3]")
	WebElement pageName;

	@FindBy(xpath = "//button[contains(text(), 'get started')]")
	WebElement getStartedButton;

	@FindBy(id = "add-page")
	WebElement addingNewPage;
	
	@FindBy(id = "link-create")
	WebElement newLink;
	
	@FindBy(xpath = ("(//button[text()='Create'])[2]"))
	WebElement createButton;
	
	@FindBy(linkText = ("Messaging"))
	WebElement messaging;
	//Need to add Messaging drag and drop code
	
	@FindBy(xpath = ("(//li[@class = 'module-item ui-widget-content ui-corner-all module-item-green ui-draggable'])[3]"))
	WebElement objsource;
	
	@FindBy(xpath = ("(//div[@class='syn-node ui-draggable syn-node-active'])[2]"))
	WebElement objstartnode;
	
	@FindBy(xpath = ("//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable']"))
	WebElement objsmsnode;
	
	@FindBy(xpath = ("//textarea[@class='syn-autoexpand syn-constant syn-autogrow']"))
	WebElement sms;
	
	@FindBy(xpath = ("//textarea[@class='syn-autoexpand syn-constant phone syn-autogrow']"))
	WebElement PHONE_NUMBER;
	
	@FindBy(xpath = ("(//li[@class = 'module-item ui-widget-content ui-corner-all module-item-green ui-draggable'])[2]"))
	WebElement objsource1;
	
	@FindBy(xpath = ("(//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[1]"))
	WebElement objconncetor1;
	
	@FindBy(xpath = ("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[2]"))
	WebElement objconncetor2;
	
	//Need to write drag and drop code for send sms
	@FindBy(xpath = ("(//input[@name='smtp_url'])"))
	WebElement hostUrl;
	
	@FindBy(xpath = ("(//input[@name='port'])"))
	WebElement portUrl;
	
	@FindBy(xpath = ("(//input[@name='ssl'])"))
	WebElement ssl;
	
	@FindBy(xpath = ("(//input[@name='username'])"))
	WebElement userName;
	
	@FindBy(xpath = ("(//input[@name='password'])"))
	WebElement pwd;
	
	@FindBy(xpath = ("(//textarea[@class='syn-autoexpand syn-constant syn-autogrow'])[2]"))
	WebElement emailFrom;
	
	@FindBy(xpath = ("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[2]/div[2]/div/textarea"))
	WebElement emailTo;
	
	@FindBy(xpath = ("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[2]/div[3]/div[2]/div/textarea"))
	WebElement subject;
	
	@FindBy(xpath = ("//*[@id=\"module-3\"]/div[1]/div[3]/div/div[3]/div/div/table/tbody/tr/td[1]/div/textarea"))
	WebElement smstext;
	
	@FindBy(xpath = ("(//span[@class='ui-icon ui-icon-triangle-1-e'])[5]"))
	WebElement basictab;
	
	@FindBy(xpath = ("//li[@class = 'module-item ui-widget-content ui-corner-all module-item-red ui-draggable']"))
	WebElement objsource2;
	
	@FindBy(xpath = ("(//div[@class='syn-node syn-node-attached-w ui-draggable syn-node-active'])[1]"))
	WebElement objconnect1;
	
	@FindBy(xpath = ("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[3]"))
	WebElement objconnect2;
	
	@FindBy(xpath = ("//li[@class = 'module-item ui-widget-content ui-corner-all module-item-red ui-draggable']"))
	WebElement objsource3;
	
	@FindBy(xpath = ("//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active']"))
	WebElement objconnect3;
	
	@FindBy(xpath = ("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[4]"))
	WebElement objconnect4;
	
	@FindBy(xpath = ("//li[@class = 'module-item ui-widget-content ui-corner-all module-item-red ui-draggable']"))
	WebElement objsource4;
	
	@FindBy(xpath = ("//div[@class='syn-node syn-node-attached-w ui-draggable syn-node-active']"))
	WebElement objconnect5;
	
	@FindBy(xpath = ("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[5]"))
	WebElement objconnect6;
	
	public CreatNewPage() {
		PageFactory.initElements(driver, this);
	}
}
