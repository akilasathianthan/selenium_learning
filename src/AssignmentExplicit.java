import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicit {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		WebDriverWait ob =new WebDriverWait(driver,Duration.ofSeconds(5));
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement deopdown=driver.findElement(By.xpath("//div[@class='form-group']/select"));
		
		Select ob1=new Select(deopdown);
		ob1.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		ob.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-info")));
		List<WebElement> add =driver.findElements(By.cssSelector("button.btn.btn-info"));
		for(int i=0;i<add.size();i++)
		{
			add.get(i).click();
		}
	}

}
