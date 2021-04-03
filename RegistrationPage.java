import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class RegistrationPage {

	public WebDriver driver;
	public void invokeBrowser() {
		try {
			 System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 
			//Implicit Wait
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
			 
		
		    } catch (Exception e) {
			e.printStackTrace();
			}
			
	}
	public void registration() throws InterruptedException {
		{
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب جديد')]")).click();
		    driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("sana");
		    driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("sayyed");
		    driver.findElement(By.xpath("//div/input[1][@name=\"reg_email__\"]")).sendKeys("sana.hatture@gmail.com");
		    driver.findElement(By.xpath("//*[@name=\"reg_email_confirmation__\"]")).sendKeys("sana.hatture@gmail.com");
		    driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]")).sendKeys("123456");
		    
		    //drop down
		    Select day=new Select(driver.findElement(By.id("day")));
		    day.selectByVisibleText("27");
		    Select month=new Select(driver.findElement(By.id("month")));
		    month.selectByVisibleText("فبراير");
		    Select year=new Select(driver.findElement(By.id("year")));
		    year.selectByVisibleText("1992");
		    
		    //Radio button
		    driver.findElement(By.xpath("//div[7]/span/span[1]/input[@value=\"1\"]")).click();
		    
		    //button click
		    driver.findElement(By.xpath("//*[@name=\"websubmit\"]")).click();
		    
		    
		
		/*check box
		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[1]”)).click();
		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[2]”)).click();
		driver.findElement(By.xpath(“//*[@id=\”pie_register\”]/li[3]/div/div/input[3]”)).click();*/
		//drop down
		
		Thread.sleep(5000);
		//clear the email field
		//driver.findElement(By.id(“email_1”)).clear();
		/*upload file
		WebElement upload=driver.findElement(By.id(“profile_pic_10”));
		upload.sendKeys(“C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg”);
		driver.findElement(By.name(“description”)).sendKeys(“xyz”);
		driver.findElement(By.id(“password_2”)).sendKeys(“12345678”);
		driver.findElement(By.id(“confirm_password_password_2”)).sendKeys(“12345678”);
		*/
		}
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RegistrationPage rp=new RegistrationPage();
		rp.invokeBrowser();
		rp.registration();
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Required Drivers\\drivers\\chromedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		/*  Internationalisation Testing
		options.addArguments("--lang="+"en");
		for localisation testing
		HashMap<String, Object> chrome_prefs = new HashMap<String, Object>();
		chrome_prefs.put("intl.accept_languages", "en");
		options.setExperimentalOption("prefs", chrome_prefs);
			
		
		WebDriver driver=new ChromeDriver(options);*/
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");*/
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		//WebDriverWait wait=new WebDriverWait(driver,10);
		
		//Maximize Chrome Window
		//driver.manage().window().maximize();
		
		//Locate User name and Password using xpath locator with id
		/*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Mohib");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Sayyed");*/
		
		
		//Wait using sleep method ---dont use
		//Thread.sleep(5000);
		
		//locate to login and create new account using xpath locator using name attribute and contains method
		//driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'إنشاء حساب جديد')]")).click();
		
		//Locate First name on create new acct page using Explicit Wait
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name=firstname]"))).sendKeys("sana");
		//next page ---create new account locate elements in first name and last name---here implicit or explicit waits are used for page load wait
		//driver.findElement(By.cssSelector("//*[@name=\"firstname\"]")).sendKeys("Sana");
		//driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Hatture");

	}
	

}
