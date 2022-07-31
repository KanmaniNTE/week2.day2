package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		//WebDriverManager Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Go to home page
		driver.findElement(By.linkText("Go to Home Page")).click();
		//Get Home page title
		String title = driver.getTitle();
		if(title.contains("TestLeaf - Selenium Playground")) {
			System.out.println("Home Page is verified");
		}else {
			System.out.println("Home Page is verified");
		}
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
        //Find where am supposed to go without clicking me?
		//WebElement element = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String attribute = driver.findElement(By.xpath("(//div[@class=\"large-6 small-12 columns\"])[2]/a")).getAttribute("href");
		System.out.println(attribute);
		//Verify am I broken?
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title2=driver.getTitle();
		String pageTitle ="404 Not Found";
		if(title2.equals(pageTitle)) {
			System.out.println("The link is broken");
		}else {
			System.out.println("The link is broken");
		}
		driver.navigate().back();
		//Go to Home Page (Interact with same link name)
		String Homepage1 = driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).getAttribute("href");
		String Homepage2 = driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).getAttribute("href");
		if(Homepage1.equals(Homepage2)) {
			driver.navigate().to(Homepage1);
			System.out.println("Both Links are same and clicked first link");
		}else {
			System.out.println("Both Links are not same");
		}
		driver.navigate().back();
		//How many links are available in this page?
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		int size= findElements.size();
		System.out.println("Links "+ size);
	}

}
