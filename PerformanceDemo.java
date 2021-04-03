import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Date;
//browser launching ways and navigation commands
public class PerformanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//First way
		driver.get("https://www.toolsqa.com");
		WebElement SeleniumTraining=driver.findElement(By.xpath("//ul[@id='primary-menu']/li[3]/a/span/span"));
		SeleniumTraining.click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//Second way
		driver.navigate().to("https://www.google.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Third way
		js.executeScript("window.location='https://demo.guru99.com/'");
		
		
		
		
		/*To calculate page load time...Performance
		Long startTime=System.currentTimeMillis();
		driver.get("https://www.flipkart.com/");
		long diff=System.currentTimeMillis()-startTime;
		System.out.println("load time was:"+diff);*/
		

	}

}
