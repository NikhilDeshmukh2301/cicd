package loginhrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class password {

	@Test
	
	public void password() throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win32\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     
	     //open web page
	     driver.get("https://the-internet.herokuapp.com/forgot_password");
	     
	     //identify text box
	   
	     WebElement box= driver.findElement(By.xpath("//input[@id='email']"));
	     
	     //text box is displayed or not
	     boolean isdisplayed=box.isDisplayed();
	     System.out.println("is displayed:"+isdisplayed );
	     
	     //is enabled
	     boolean enablesatus = box.isEnabled();
	     System.out.println("is enabled:"+enablesatus );
	     
	     //enter value in text box
	     box.sendKeys("nik@gmail.com");
	     
	     //get email enter in text box
	     System.out.println(box.getText());
	     
	     Thread.sleep(3000);
	     
	     //clear text
	    
	}
}
