import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//Internationalisation Testing
		//options.addArguments("--lang="+"en");
		//for localisation testing
		/*HashMap<String, Object> chrome_prefs = new HashMap<String, Object>();
		chrome_prefs.put("intl.accept_languages", "en");
		options.setExperimentalOption("prefs", chrome_prefs);*/
			
		
		//WebDriver driver=new ChromeDriver(options);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		//Maximize Chrome Window
		driver.manage().window().maximize();
		
		//Locate User name and Password using xpath locator with id
		//driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("hatture");
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Mohib");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Sayyed");
		
		//Wait using sleep method ---dont use
		//Thread.sleep(5000);
		
		//locate to login and create new account using xpath locator using name attribute and contains method
		//driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب جديد')]")).click();
		
		//Locate First name on create new acct page using Explicit Wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=firstname]"))).sendKeys("sana");
		//next page ---create new account locate elements in first name and last name---here implicit or explicit waits are used for page load wait
		//driver.findElement(By.cssSelector("//*[@name=\"firstname\"]")).sendKeys("Sana");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Hatture");

	}


}
