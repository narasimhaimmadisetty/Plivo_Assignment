package com.quickfuse.modules.scripts;

import java.io.IOException;

import com.quickfuse.base.AppBase;
import com.quickfuse.modules.reusables.Messaging;

public class FuseCreateApp extends AppBase {
	public static Messaging messaging;

	public FuseCreateApp() throws IOException {
		super();
	}

	public static void setup() {
		messaging = new Messaging();
		initialization();
		Messaging.clickOnCreateAnAppButton();
		Messaging.creatNewPage();
		Messaging.sendEmail();

	}

	public static void exitApp() {
		driver.quit();
	}

	public static void main(String[] args) {
		System.out.println("**** Test Started .....");
		setup();
		exitApp();

	}

}
