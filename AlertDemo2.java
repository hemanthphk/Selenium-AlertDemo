package com.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\gokul\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//confirm alert
	    driver.findElement(By.id("confirmBox")).click();
		Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		Thread.sleep(2000);
		confirmationAlert.dismiss();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.close();
		
	}

}
