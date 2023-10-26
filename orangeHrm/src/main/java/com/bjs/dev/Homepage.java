package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage 
{
	ChromeDriver driver;
	By clickOHrmInc = By.xpath("//a[text() = 'OrangeHRM, Inc']");
	
	public Homepage(ChromeDriver driver) 
	{
		this.driver = driver;
	}

	public void clickOrangeHrmInc()
	{
		driver.findElement(clickOHrmInc).click();
	}
}
