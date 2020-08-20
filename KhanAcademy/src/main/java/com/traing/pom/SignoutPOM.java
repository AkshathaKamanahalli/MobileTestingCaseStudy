package com.traing.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SignoutPOM {
public static AndroidDriver <AndroidElement> driver=null;
	
	private WebElement element;
	public SignoutPOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		
	}
	
	public void Settings() {
		element=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]"));
		element.click();
		}
	
	public void Signout() {
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Sign out\"]"));
		element.click();
		}
	public void NavigateBack() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		}
	
	
}
