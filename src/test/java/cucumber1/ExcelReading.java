package cucumber1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading 
{
	@Test
	public void test() throws InterruptedException 
		
	{
    WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C://Drivers//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");	
	driver.findElement(By.name("userName")).sendKeys("demo");
	driver.findElement(By.name("password")).sendKeys("demo");
	driver.findElement(By.name("login")).click();
//	driver.close();
	Thread.sleep(5000);
	String A_title =driver.getTitle();
	System.out.println(A_title);
	String E_tilte= "Find a Flight: Mercury Tours:";
	
	if(A_title.equals(E_tilte))
	{
		System.out.println("login success");
	}
	else
	{
		System.out.println("login failure");
	}
		
		
		
		
		
		
		
	
//	
//	System.out.println("driver.getTitle()");
//	driver.findElement(By.linkText("Cruises")).click();
//	List<WebElement> t_rows= driver.findElements(By.tagName("tr"));
//	System.out.println("number of rows" +t_rows.size());
//	for(WebElement row : t_rows)
//	{ 
//		List<WebElement> t_col= row.findElements(By.tagName("td"));
//		//System.out.println(row.getText());
//		for (WebElement col : t_col)
//			if(col.getText().equalsIgnoreCase("Sat"));
//		System.out.println(row.getText());
//		
//	}
}

}