package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		//Click on image to redirect home page
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//h5[text()=\"Image\"]/following::img[@alt=\"Images\"]")).click();
		//To check the broken Image
		boolean imagedisplayed=driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img")).isDisplayed();
		if(imagedisplayed) {
			System.out.println("Image Link Broken!!");
		}
		else {
			System.out.println("Image Visible!!");
		}
		//Click on the Keyboard image
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
