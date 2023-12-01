import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAssignment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Name
		driver.findElement(By.name("name")).sendKeys("Akila");
		//Email
		driver.findElement(By.name("email")).sendKeys("A@gmail.com");
		//Password
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Blue");
		//Checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		//Gender
		Select ob=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		ob.selectByIndex(1);
		//radio button
		driver.findElement(By.id("inlineRadio1")).click();
		//DOB
		driver.findElement(By.name("bday")).sendKeys("23/12/1990");
		//submit
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		
		//Success! The Form has been submitted successfully!.
		

	}

}
