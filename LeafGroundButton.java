package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {
	public static void main(String[] args) {
		//WDM Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		//Click Button
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//h5[@class=\"wp-categories-title\"]/following::img[@alt=\"Buttons\"]")).click();
		//Get the Location on Button
		System.out.println("Position of the button: "+driver.findElement(By.id("position")).getLocation());
		//To check the Color of the button
		WebElement buttonColor = driver.findElement(By.xpath("//label[text()='Find button color']/following-sibling::button"));
		String colorOfButton=buttonColor.getCssValue("background-color");
		System.out.println("RGB Value of the Button: "+colorOfButton);
		System.out.println("Size of the Button: "+driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize());
	}

}
