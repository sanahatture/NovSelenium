import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/v4/index.php");
		WebElement username=driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
		username.sendKeys("sana");
		pass.sendKeys("123456");
		Thread.sleep(1000);
		
		//for click
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",login);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//for custom alert message
		js.executeScript("alert('welcome to utkarhsa');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		String DomainName=js.executeScript("return document.domain;").toString();
		System.out.println("Domain name of the site="+DomainName);
		
		//fetching url of the site toString() change object to name
		String url=js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site="+url);
		
		//Method document.title fetch the Title name of the site.toString() change object to name
		String TitleName=js.executeScript("return document.title;").toString();
		System.out.println("Title of the page="+TitleName);
		js.executeScript("window.location='https://www.toolsqa.com/'");
		js.executeScript("window.scrollBy(0,600)");
		
		//login.click();
	}

}
