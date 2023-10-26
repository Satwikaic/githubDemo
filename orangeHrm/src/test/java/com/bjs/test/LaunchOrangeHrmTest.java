package com.bjs.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.bjs.dev.Homepage;
import com.bjs.dev.Login;



public class LaunchOrangeHrmTest 
{
	@Test
	public void unknownMethod() 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login login = new Login(driver);
		login.typeUsername();
		login.typePassword();
		login.clickSubmitButton();
		
		Homepage homePage = new Homepage(driver);
		homePage.clickOrangeHrmInc();

	}

}
