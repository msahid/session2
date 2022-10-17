package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
	public void init () {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void locateElements() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.navigate().back();
		//driver.findElement(By.partialLinkText("TF-API Product")).click();
		
		//file upload
		//if tag is input use .sendKeys(path)
		//if tag is other then input use Robot
		//driver.findElement(By.id("photo")).sendKeys("/Users/mohammedsahid/Downloads/2022-06-11--Session 2.pptx");
		
		//Thread.sleep(5000);
		
		//CSS
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-6']")).click();
		
		//Xpath
		driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("I hate absolute Xpath");
		
		//Xpath absolute is not good idea because it is based on the position and position can changed when modification is made
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@name='profession' and @id='profession-0']")).click();
		//driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'API Documentations' )]")).click();
		
		
		Thread.sleep(3000);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
