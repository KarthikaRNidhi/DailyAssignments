package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAccDropDown {

	public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
		
		//opening the facebook webpage
		driver.get("https://en-gb.facebook.com/"); 
		
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//Entering firstname
		driver.findElement(By.name("firstname")).sendKeys("Karthi");
		
		//Entering lastname
		driver.findElement(By.name("lastname")).sendKeys("Rajesh");
		
		//Entering email
		driver.findElement(By.name("reg_email__")).sendKeys("karthiravindran91@gmail.com");
		
		//Entering password
		driver.findElement(By.id("password_step_input")).sendKeys("Rajesh2013");
		
		//Handling DOB 1st DD
		WebElement firstDD=driver.findElement(By.id("day"));
		Select day=new Select(firstDD);
		day.selectByIndex(27);
		
		//Handling DOB 2nd DD
		WebElement secondDD=driver.findElement(By.id("month"));
	    Select month=new Select(secondDD);
		month.selectByVisibleText("Jul");
		
		//Handling DOB 3rd DD
		WebElement thirdDD=driver.findElement(By.id("year"));
	    Select year=new Select(thirdDD);
		year.selectByValue("1997");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		//getting the title of webpage & printing
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
