package com.traing.pom;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPOM {

	public static AndroidDriver <AndroidElement> driver=null;
	
	private WebElement element;
	public LoginPOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
		
	}
	
	public void Dismiss() {
		element=driver.findElement(By.className("android.widget.Button"));
		element.click();
		}
	
	public void DismissCovid() {
		//element=driver.findElement(By.xpath("//*[text()='Dismiss']"));
		element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Dismiss\"]"));
		element.click();
		}
	public void Signin() {
		element=driver.findElement(By.className("android.widget.Button"));
		element.click();
		}
	
	public void clickSignin() {
        element= driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Sign in\"]"));
        element.click();
    }
	
	public void continueWithGoogle() {
        element =driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"Continue with Google\"]"));
        element.click();
	}
	
	 public void chooseAccount() {
	        
	     element=driver.findElement(MobileBy.xpath("//android.widget.TextView[@text=\"akshatha kamanahalli\"]"));
	     element.click();
	 }
	 

}
