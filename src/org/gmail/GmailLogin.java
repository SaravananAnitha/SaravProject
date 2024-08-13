package org.gmail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface GmailLogin {
	public static void main(String[]args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		
	driver.manage().window().maximize();
	
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File file=screenshot.getScreenshotAs(OutputType.FILE);
	System.out.println(file);
	
	File desfile=new File("C:\\Users\\Saravana\\Gmail\\screenshot//gmail.png");
	FileUtils.copyFile(file, desfile);
	
	
		
		
	}
	

}
	
		
