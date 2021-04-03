import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		//Explicit Wait
		//WebDriverWait wait=new WebDriverWait(driver,10);
				
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mohib");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب جديد')]")).click();
		
		//Locate First name on create new acct page using Explicit Wait
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=firstname]"))).sendKeys("sana");
		//next page ---create new account locate elements in first name and last name---here implicit or explicit waits are used for page load wait
		//driver.findElement(By.cssSelector("//*[@name=\"firstname\"]")).sendKeys("Sana");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Hatture");
       
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(40,TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		WebElement firstname=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver)
			{
				//return driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
				return driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));

			}
			
		});
		firstname.sendKeys("sana");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("hatture");
	}

}
