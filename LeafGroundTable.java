package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTable {

	public static void main(String[] args) {
		//Launch Browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//Launch Browser
				driver.manage().window().maximize();
				driver.get("http://www.leafground.com/pages/table.html");
				//Print Number columns
				List<WebElement> col= driver.findElements(By.tagName("th")); 
				int totalColumns=col.size();
				System.out.println("Number of columns in table: " + totalColumns);
				//Print Number of Rows
				List<WebElement> row= driver.findElements(By.tagName("tr")); 
				int totalRow=row.size();
				System.out.println("Number of rows in table including Header: " + totalRow);
				
				
				//Checks  least completed progress.
				driver.findElement(By.xpath("(//font[contains(text(),'20%')]/following::input[@name=\"vital\"])[1]")).click();

	}

}
