package oopsConcepts;

import org.apache.poi.hslf.record.CurrentUserAtom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamillogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-804886076%3A1683183961097737&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Af_xneG6fioxnTwZmfIASq21xowg7HKzZupUn2h6kQNM7vNvJ5ROCgcdMVlc4iRd4AOtDmMGDs1M&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("identifierId")).sendKeys("grandhisarath257@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		driver.findElement(By.name("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[1]/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("Sarath@123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]")).click();
		String expval = "https://accounts.google.com/v3/signin/rejected?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&dsh=S-804886076%3A1683183961097737&epd=ARH0xVNgoKyp135zo8wq0edTQDY4D6mUDduQo7TkWURFXoHNMpBct9_WJQ&flowEntry=ServiceLogin&flowName=GlifWebSignIn&idnf=grandhisarath257%40gmail.com&ifkv=Af_xneG6fioxnTwZmfIASq21xowg7HKzZupUn2h6kQNM7vNvJ5ROCgcdMVlc4iRd4AOtDmMGDs1M&rhlk=le&rip=1&rrk=46&service=mail";
		
		if(expval.equalsIgnoreCase(driver.getCurrentUrl())) {
			driver.navigate().to("https://www.flipkart.com/");
		}
		else {
			System.out.println("login failed");
		}
		
		


	}

}
