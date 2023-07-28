package com.initiate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserInitiateThings {
	public static WebDriver driver = null;

	public static void initialize() {
		if (driver == null) {
			if (Constants.browsername.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(Constants.browsername.equals("gecko")){
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new geckodriver();
				driver.manage().window().maximize();
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);
	}
	public static void quiting() {
		driver.quit();
		driver=null;
	}
	public static void closing() {
		driver.close();
		driver=null;
	}

}
