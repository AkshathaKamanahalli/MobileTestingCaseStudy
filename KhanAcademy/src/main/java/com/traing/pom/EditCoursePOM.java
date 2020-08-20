package com.traing.pom;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EditCoursePOM {
public static AndroidDriver <AndroidElement> driver=null;
	
	private WebElement element;
	public EditCoursePOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		
	}
	
	public void EditCourse() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Edit\"]"));
		element.click();
		}
	
	public void selectCourse() {
		element=driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(text(\"Personal finance\").instance(0))"));
		TouchAction t=new TouchAction(driver);
		t.tap(tapOptions().withElement(element(element))).perform();
		
	}
}
