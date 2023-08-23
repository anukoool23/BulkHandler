package PProduct;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crosscheck {

	public static void main(String[] args) {
		
		String UserName="anukool";
		String Password="Anukool@321";
		
		String ChDriver="D:\\\\Selinium\\\\chromedriver_win32\\\\chromedriver.exe";
		String Url="https://ct01-mm-billing-gui.u614.gcp.de.pri.o2.com/aax3/login.jsf";
		
		WebDriver dr=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", ChDriver);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.get(Url);
		dr.findElement(By.id("details-button")).click();
		dr.findElement(By.id("proceed-link")).click();
		dr.findElement(By.id("input_loginForm:username")).sendKeys(UserName);
		dr.findElement(By.id("input_loginForm:password")).sendKeys(Password);
		dr.findElement(By.id("loginForm:loginButton")).click();
		dr.findElement(By.xpath("//button[@id='navigationForm:menu']")).click();
		dr.findElement(By.xpath("//a[@id='dtLmenuForm:parent-salesMenu']")).click();
		dr.findElement(By.xpath("//a[normalize-space()='Product catalogue']")).click();
		

	}

}
