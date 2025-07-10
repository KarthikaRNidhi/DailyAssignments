package week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTestcase1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 //maximizing the window
		 driver.manage().window().maximize();
		 
		 //loading url
		 driver.get("https://www.amazon.in/");
		 
		 //implicitlyWait
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     
	     //navigating to search box & search Watch
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
			
		 //clicking search
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		
		//print the total results
		String totalResults = driver.findElement(By.xpath("//span[text()='1-48 of over 30,000 results for']")).getText();
		System.out.println("The total results are " +totalResults);
		
		//choose american tourister
		driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='American Tourister']")).click();
       driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Safari']")).click();
		
		//click new arrivals
       Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();

		String bagName=driver.findElement(By.xpath("(//span[text()='Safari'])[1]")).getText();
		System.out.println(bagName);
		
		//
		String bagPrice=driver.findElement(By.xpath("(//span[text()='1,499'])[1]")).getText();
		System.out.println(bagPrice);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		//driver.close();
	}

}
