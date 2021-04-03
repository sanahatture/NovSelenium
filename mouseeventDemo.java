import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseeventDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		WebElement DoubleClick=driver.findElement(By.id("doubleClickBtn"));
		WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
		//WebElement DynamicClick=driver.findElement(By.id("i0t7R"));
		
		Actions action=new Actions(driver);
		action.doubleClick(DoubleClick).build().perform();
		action.contextClick(RightClick).build().perform();
		//action.click(DynamicClick).build().perform();
		

	}

}
