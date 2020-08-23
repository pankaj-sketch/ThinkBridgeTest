package RegisterPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThinkRegister {
	WebDriver driver;
	@Test
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Seleniumdemos\\ThinkBridge\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		
	    }
 
	@Test
    public void SelectDropDown() {
		WebElement language_dd=driver.findElement(By.xpath("//*[@id=\"language\"]/div[1]/span/span[2]"));
		language_dd.click();
		
		List<WebElement> language=driver.findElements(By.xpath("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope']"));
		for(WebElement lang:language)
		{
			if(lang.getText().equals("English"))
			{
				lang.click();
			}
		}
    	
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pankaj Salunke");
		driver.findElement(By.xpath("//input[@name='orgName']")).sendKeys("Resonantia Technologies");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pankajsalunke60@gmail.com");
		driver.findElement(By.xpath("//span[@class='black-color ng-binding']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
    }
}
