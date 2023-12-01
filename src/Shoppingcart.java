import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppingcart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] listOfItems= {"Brocolli","Cauliflower","Potato"} ;
		List<String> arraylistOfItems=Arrays.asList(listOfItems);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> items =driver.findElements(By.cssSelector("h4.product-name"));
		//Thread.sleep(2000);
		for(int i=0;i<items.size();i++)
		{
			String[] cartText=items.get(i).getText().split("-");
			String formattedText=cartText[0].trim();
			int j=0;
			if(arraylistOfItems.contains(formattedText))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==listOfItems.length)
				{
					break;
				}
			}
		}
		
	}

}
