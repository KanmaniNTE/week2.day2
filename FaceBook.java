package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		//driver.findElement(By.xpath("//a[@id='u_0_0_nC']")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		//driver.findElement(By.id("u_0_b_pN")).sendKeys("Makinthan");
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _58mg')]")).sendKeys("Makinthan");
		// Step 8: Enter the last name
		//driver.findElement(By.id("u_0_d_dD")).sendKeys("SK");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")).sendKeys("SK");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("978724590");
		// Step 10: Enterthe password
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Kanmani@31");
		// Step 11: Handle all the three drop downs
		WebElement birthdayday = driver.findElement(By.name("birthday_day")); 
		new Select(birthdayday).selectByValue("9"); 
		WebElement birthdaymonth = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[2]")); 
		new Select(birthdaymonth).selectByVisibleText("Aug"); 
		WebElement birthdayyear = driver.findElement(By.xpath("(//select[contains(@class,'_9407 _5dba')])[3]")); 
		new Select(birthdayyear).selectByVisibleText("2010"); 
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		          //  ( A normal click will do for this step) 

	}

}
