package UtilLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{

	public static int time=40;
	public static WebElement visibilityStatus(WebElement wb)
	{
	
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOf(wb));
	}
	public static List<WebElement> visibilityofAllStatus(WebElement wb)
	{
	
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfAllElements(wb));
	}
	public static Alert alertIsPresent()
	{
		return new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.alertIsPresent());
	}
	public static void sendKeys(WebElement wb,String value)
	{
		visibilityStatus(wb).sendKeys(value);
	}
	public static void click(WebElement wb)
	{
		visibilityStatus(wb).click();
	}
	public static void clear(WebElement wb)
	{
			visibilityStatus(wb).clear();
	}
		
	
		
		
		
	
}
