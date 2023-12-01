import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com");
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		

	}

}
