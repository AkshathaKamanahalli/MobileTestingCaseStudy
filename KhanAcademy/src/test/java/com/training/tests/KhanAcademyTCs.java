package com.training.tests;

import static com.training.util.Sleep.*;
import org.testng.annotations.Test;

import com.traing.pom.CoursePOM;
import com.traing.pom.EditCoursePOM;
import com.traing.pom.LoginPOM;
import com.traing.pom.MathsClass1POM;
import com.traing.pom.SignoutPOM;
import com.training.util.Capability;
import com.training.util.CaptureScreenShot;
import com.training.util.Sleep;
import com.training.waits.waitTypes;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class KhanAcademyTCs extends Capability{
	
	private AndroidDriver<AndroidElement> driver;
	private LoginPOM loginPOM;
	private CoursePOM coursePOM;
	private CaptureScreenShot screenShot;
	private waitTypes WaitTypes;
	private MathsClass1POM mathsClass;
	private EditCoursePOM editcoursePOM;
	private SignoutPOM signoutPOM;
	
	 @BeforeTest
	  public void beforeTest() throws IOException {
		  driver =Capability.capability(appActivity,appPackage,deviceName,chromeDriver);	
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			loginPOM=new LoginPOM(driver);
			coursePOM=new CoursePOM(driver);
			screenShot=new CaptureScreenShot(driver);
			WaitTypes=new waitTypes(driver);
			mathsClass=new MathsClass1POM(driver);
			editcoursePOM=new EditCoursePOM(driver);
			signoutPOM=new SignoutPOM(driver);
	  }
	
 @Test(priority=0)
  public void LoginTC01() throws InterruptedException {
	  sleepSecounds(20);
	  loginPOM.Dismiss();
	  sleepSecounds(5);
	  screenShot.screenshot("first");
	  loginPOM.DismissCovid();
	  loginPOM.Signin();
	  loginPOM.clickSignin();
	  loginPOM.continueWithGoogle();
	  sleepSecounds(5);
	  loginPOM.chooseAccount();
	  
	  
  }
  
  @Test(priority=1,dependsOnMethods = "LoginTC01")
  
  public void SelectCourseTC02() throws InterruptedException{
	//sleepSecounds(10);
	//coursePOM.SelectLanguage();
	sleepSecounds(10);
	coursePOM.EditCourse();  
	coursePOM.selectCourse();
	sleepSecounds(2);
	coursePOM.ClickDone();
	sleepSecounds(10);
	coursePOM.selectCourse();
	coursePOM.CompareNumbers();
	sleepSecounds(5);
	coursePOM.PlayRecording();
	sleepSecounds(2);
	coursePOM.NavigateBack();
	coursePOM.ClickHome();
	screenShot.screenshot("Second");
	 }
  
  @Test(priority=2,dependsOnMethods = "LoginTC01")
  public void CourseChallangeTC03() throws InterruptedException{
	  sleepSecounds(5);
	  mathsClass.Class1();
	  sleepSecounds(10);
	  mathsClass.CourseChallange();
	  mathsClass.GetTextCourseChallange();
	  mathsClass.ClickCourseChallange();
	  coursePOM.NavigateBack();
	  coursePOM.ClickHome();
	  screenShot.screenshot("Second");
  }
  
  
  @Test(priority=3,dependsOnMethods = "LoginTC01")
  public void EditCourseTC04() throws InterruptedException{
	  sleepSecounds(10);
	  editcoursePOM.EditCourse();
	  sleepSecounds(2);
	  editcoursePOM.selectCourse();
	  sleepSecounds(2);
	  coursePOM.ClickDone();
  }
  
  @Test(priority=4,dependsOnMethods = "LoginTC01")
  public void SignoutTC05() throws InterruptedException{
	  sleepSecounds(10);
	  signoutPOM.Settings();
	  sleepSecounds(2);
	  signoutPOM.Signout();
	  sleepSecounds(5);
	  signoutPOM.NavigateBack();
  }
	 
	  
  @AfterTest
  public void afterTest() {
	  
	  System.out.println("-----------AfterTest----------");
	 
  }

}
