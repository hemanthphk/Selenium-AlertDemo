package com.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\gokul\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
			    
		promptAlert.sendKeys("Hemanth");
			    
	    promptAlert.accept();
			    
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.close();

	}

}
