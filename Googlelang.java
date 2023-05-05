package oopsConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelang {
	WebDriver driver;
	public void Initializebrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void langclick(String myLang) throws InterruptedException {
		driver.findElement(By.linkText(myLang)).click();
		Thread.sleep(5000);
	}
	public void teardown() {
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Googlelang gl=new Googlelang();
		gl.Initializebrowser();
		gl.langclick("తెలుగు");
		gl.langclick("मराठी");
		gl.langclick("தமிழ்");
		gl.langclick("हिन्दी");
		gl.langclick("English");
		gl.teardown();
	}

}
