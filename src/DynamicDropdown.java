import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(1000);
for(int i=0;i<3;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

driver.findElement(By.id("btnclosepaxoption")).click();

//Departure
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXJ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table[1]")).click();
//Select Static drop down

Select sob=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
sob.selectByIndex(3);
System.out.println(sob.getFirstSelectedOption().getText());
sob.selectByValue("INR");
System.out.println(sob.getFirstSelectedOption().getText());
sob.selectByVisibleText("AED");
String ActVal=sob.getFirstSelectedOption().getText();
Assert.assertEquals(ActVal, "AED");
Thread.sleep(2000);
//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
