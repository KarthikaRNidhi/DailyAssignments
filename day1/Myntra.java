package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//search bag
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags", Keys.ENTER);
		
		//select men
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		
		//select 'Rucksacks'
		driver.findElement(By.xpath("//label[text()='Rucksacks']")).click();
		
		//item count
		Thread.sleep(5000);
		String countResults = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("The total results found" +countResults);
		
		//brand name
		List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		for (WebElement each : elements) {
			
			String text = each.getText();
			System.out.println(text);	
	}
		//bag name
		List<WebElement> elements2 = driver.findElements(By.xpath("//h4[@class='product-product']"));
		for (WebElement each : elements2) {
			
			String text1 = each.getText();
			System.out.println(text1);	
	}

	}

}
