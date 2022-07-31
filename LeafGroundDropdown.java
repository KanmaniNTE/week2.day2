package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {

	public static void main(String[] args) {
		//WebDriverManager Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//Select dropdown value by index
		WebElement selectByInd = driver.findElement(By.id("dropdown1"));
		Select selectByIndex=new Select(selectByInd);
		selectByIndex.selectByIndex(2);
		//Select dropdown value by Text
		WebElement selByTxt = driver.findElement(By.name("dropdown2"));
		Select selectByText=new Select(selByTxt);
		selectByText.selectByVisibleText("Selenium");
		//Select dropdown value by Value
		WebElement selByVal = driver.findElement(By.id("dropdown3"));
		Select selectByValue = new Select(selByVal);
		selectByValue.selectByValue("3");
		//Select dropdown value by search and select
		driver.findElement(By.xpath("(//div[@class=\"example\"])[5]//select")).sendKeys("Sele");
		//Get Number of dropdown from list
		Select findcount = new Select(driver.findElement(By.xpath("//div[@class=\"example\"][4]//select")));
		java.util.List<WebElement> countoptions = findcount.getOptions();
		int l=countoptions.size();
		System.out.println("Number of dropdown options: "+l);
		//Select Multiple element in list
		WebElement multiSel = driver.findElement(By.xpath("//div[@class=\"example\"][6]//select"));
		Select multiSelect = new Select(multiSel);
		if(multiSelect.isMultiple()) {
			multiSelect.selectByIndex(2);
			multiSelect.selectByIndex(3);
		}

	}

}
