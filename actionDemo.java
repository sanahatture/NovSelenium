import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/newtours/");
		
		WebElement Link_Home=driver.findElement(By.linkText("Home"));
		WebElement td_Home=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Actions builder=new Actions(driver);
		Action action=builder.moveToElement(Link_Home).build();
		String bgcolor=td_Home.getCssValue("BACKGROUND");
		
		System.out.println("Before hover:"+bgcolor);
		action.perform();
		bgcolor=td_Home.getCssValue("BACKGROUND");
		System.out.println("After hover:"+bgcolor);
		
		

	}

}
