package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FirefoxBrowser { 

	static void takescreenshot(String url) throws IOException {
	//Set a property of Firefox Webdriver, and specifying the path where the exe file of Firefox Driver is located  
	System.setProperty("webdriver.gecko.driver", "d:\\geckodriver.exe");
	
	//Create a driver object.
	WebDriver driver  = new FirefoxDriver();  
	
	//Open the url in the browser, specified by the user.
	try
	{
	    driver.get(url);
	} 
	catch(Exception e) 
	{
	    System.out.println("Invalid URL. Please Enter a correct URL");
	    driver.quit();			 //Close Browser
	    System.exit(1);			//Stops the execution further script if the url is invalid
	}
	
	
	//Maximize the Browser Window
	driver.manage().window().maximize();
	
	//Create an AShot object, call the shootingStrategy() method to take screenshot of page bigger then size, then call a method takeScreenshot() passing the driver
	Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	System.out.println("Screenshot captured");
	
	//Get the image from the screenshot and write it to the file. You can provide the file type as jpg, png, etc
	//It causes IOException, so for handling exception we have to use a throws declaration or surround it with try catch block.
	ImageIO.write(screenshot.getImage(), "jpg", new File("d:\\Fullscreenshot.jpg"));
	
	System.out.println("Screenshot written in file successfully..!!");
	
	driver.quit();		//Close Browser
	

}

public static void main(String[] args) throws IOException{
	
	Scanner sc = new Scanner(System.in);
	
	//Take user input to take screenshot of a url
	System.out.println("Enter the URL of a page to take a full screenshot: ");
	String url =sc.nextLine();
	sc.close();
	
	//Call the function takescreenshot and pass url
	takescreenshot(url);	

}


}
