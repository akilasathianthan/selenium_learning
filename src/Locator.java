import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ob=new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ob.get("https://rahulshettyacademy.com/locatorspractice/");
		ob.findElement(By.id("inputUsername")).sendKeys("Akila");
		ob.findElement(By.name("inputPassword")).sendKeys("Jaaa");
		ob.findElement(By.className("signInBtn")).click();
		System.out.println(ob.findElement(By.xpath("//form/p")).getText());
		ob.findElement(By.linkText("Forgot your password?")).click();
		ob.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("AAA");
		ob.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("AA.gmail.com");
		ob.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		ob.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("antony@gmail.com");
		ob.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("2222222252");
		ob.findElement(By.xpath("//div/button[2]")).click();
		String info=ob.findElement(By.className("infoMsg")).getText();
		Assert.assertEquals(info, "Please use temporary password 'rahulshettyacademy' to Login.");
		String[] splitArray=info.split("'");
		String password=splitArray[1].split("'")[0];
		ob.findElement(By.className("go-to-login-btn")).click();
		String userName="Akila";
		Thread.sleep(2000);
		ob.findElement(By.id("inputUsername")).sendKeys(userName);
		ob.findElement(By.name("inputPassword")).sendKeys(password);
	
		ob.findElement(By.id("chkboxOne")).click();
		ob.findElement(By.id("chkboxTwo")).click();
		ob.findElement(By.cssSelector("button[class*=submit]")).click();
		String getText=ob.findElement(By.xpath("//div/h2")).getText();
		Assert.assertEquals(getText, "Hello "+userName+",");
		ob.findElement(By.xpath("//button[text()='Log Out']")).click();
		ob.close();
		
		
	}

}
