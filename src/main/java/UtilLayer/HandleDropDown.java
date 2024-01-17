package UtilLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByVisibleText(WebElement wb,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wb1);
		sel.selectByVisibleText(value);	
		
	}
	public static void selectByValue(WebElement wb,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wb1);
		sel.selectByValue(value);	
		
	}
	public static void selectByIndex(WebElement wb,int index)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wb1);
		sel.selectByIndex(index);	
		
	}
	public static void getOptions(List<WebElement> wb,String value)
	{
		for(WebElement list:wb)
		{
			if(list.getText().equalsIgnoreCase(value)) {
					System.out.println(list.getText());
			}
		}
	}
}
