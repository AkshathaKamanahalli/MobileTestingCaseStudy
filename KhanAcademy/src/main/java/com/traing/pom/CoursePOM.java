package com.traing.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import com.training.waits.waitTypes;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CoursePOM {

public static AndroidDriver <AndroidElement> driver=null;
	
	private WebElement element;
	private waitTypes WaitTypes;
	public CoursePOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		this.WaitTypes=new waitTypes(driver);
	}
	
	
	
	public void SelectLanguage() {
		//WaitTypes.waitForElement(MobileBy.xpath("//android.widget.TextView[@text=\"Edit\"]"), 20);
		 element=driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"))");
	     element.click();   
		}
	
	public void EditCourse() {
		//WaitTypes.waitForElement(MobileBy.xpath("//android.widget.TextView[@text=\"Edit\"]"), 20);
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Edit\"]"));
		element.click();
		}
	
	public void selectCourse() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Class 6 math (India)\"]"));
	    element.click();
	}
	
	public void ClickDone() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Done\"]"));
	    element.click();
	}
	
	public void CompareNumbers() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Comparing numbers\"]"));
	    element.click();
	}
	
	
	public void PlayRecording() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Comparing multi-digit numbers\"]"));
	    element.click();
	}
	
	public void NavigateBack() {
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void ClickHome() {
		element=driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_home"));
	    element.click();
		}
}
