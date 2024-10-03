package com.testproject;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class JavaProject {
	@Test
	public void Sum() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();            /** Maximize window**/
//	    driver.manage().deleteAllCookies();             /** Delete all cookies**/
//	    driver.get("https://www.google.com/");
//	    driver.quit();
		
		int a,b,sum;
		a=10;
		b=15;
		sum=a+b;
		System.out.println("Sum of A and B is:-----------------------"+sum);
	}

}
