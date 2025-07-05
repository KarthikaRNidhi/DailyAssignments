package week2.day1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithCheckBox {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://leafground.com/checkbox.xhtml ");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.manage().window().maximize();
		 
		 // Click on the "Basic Checkbox.”
		 driver.findElement(By.xpath("//span[text()='Basic']")).click();
		 
		 //Click on the "Notification Checkbox." 
		 driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		 
		 //Verify that the expected message is displayed.
		  boolean isMsgVisible = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).isDisplayed();
	      System.out.println(isMsgVisible);
		 
		 //Click on your favorite language
		 driver.findElement(By.xpath("//label[text()='Java']")).click();
		 
		 //Click on the "Tri-State Checkbox." 
		 driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		 
		 //Verify which tri-state option has been chosen.
		 boolean enabled = driver.findElement(By.xpath("//input[contains(@id,'ajaxTriState_input')]")).isEnabled();
		 System.out.println("Tristate option is," +enabled);
		 
		//Click on the "Toggle Switch." 
		 driver.findElement(By.className("ui-toggleswitch-slider")).click();
		 
		Thread.sleep(5000);
		 
		//Verify that the expected message is displayed. 
		 boolean ismsgDisplayed=driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).isDisplayed();
		 System.out.println(ismsgDisplayed);
		 
		// Verify if the Checkbox is disable
		 boolean isEnabledornot = driver.findElement(By.xpath("//span[text()='Disabled']")).isSelected();
	     System.out.println(isEnabledornot);
	     
	     //verify any country in multiple options
	     driver.findElement(By.xpath("//div[@role='combobox']")).click();
	     driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("London");
	     
	    //select london
	     driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
	     
	     //close dropdown
	     driver.findElement(By.xpath("//a[@aria-label='Close']/span")).click();
	     
	     //driver.close();
		 
		 

	}
}
