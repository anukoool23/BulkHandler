package EPC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewProduct {

	public static void main(String[] args) throws InterruptedException {
		
		String ChDriver="D:\\\\Selinium\\\\chromedriver_win32\\\\chromedriver.exe";
		String Url="https://catalog-ui-ict1-cn.high-1.raitmm02-test.aws.de.pri.o2.com/#/Instances";
		String Username="NQ10042106";
		String Password="TechM@268";


		WebDriver dr=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",ChDriver );
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.manage().window().maximize();
		dr.get(Url);
		dr.findElement(By.id("idToken1")).sendKeys(Username);
		dr.findElement(By.id("idToken2")).sendKeys(Password);
		dr.findElement(By.id("loginButton_0")).click();
		Thread.sleep(60000);
		dr.findElement(By.xpath("//td[normalize-space()='Main']")).click();
		dr.findElement(By.xpath("//input[@value='Close']")).click();
	}

}
