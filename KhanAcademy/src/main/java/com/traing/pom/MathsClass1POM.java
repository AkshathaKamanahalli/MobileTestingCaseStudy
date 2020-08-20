package com.traing.pom;



import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MathsClass1POM {
public static AndroidDriver <AndroidElement> driver=null;
	
	private WebElement element;
	public MathsClass1POM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		
	}
	
	public void Class1() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Class 1 math (India)\"]"));
		element.click();
		}
	
	public void CourseChallange() { 
		 element=driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(text(\"Take Course Challenge\").instance(0))"));
		 //element.click();
		
}
	public void GetTextCourseChallange() { 
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Take Course Challenge\"]"));
		String actual=element.getText().toString();
		System.out.println(actual);
		Assert.assertEquals(actual, "Take Course Challenge");  
		//element.click();
	}
		 public void ClickCourseChallange() { 
		 element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Take Course Challenge\"]"));
		 element.click();
		 

}
}
