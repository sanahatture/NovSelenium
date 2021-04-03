import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	

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
		driver.get("https://kite.zerodha.com/");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("hatture");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");

	}

}
