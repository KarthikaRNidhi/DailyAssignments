package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaseStudyAmazon {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver amazon=new ChromeDriver(options);
		
		//passing url
		amazon.get("https://www.amazon.in/");
		
		//maxmizing thw window
		amazon.manage().window().maximize();
		
		//clicking cont. shopping
		//amazon.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		String zerocart=amazon.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
		
		//navigating to search box & search Watch
		amazon.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
		
		//clicking search
		amazon.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//clicking add to cart
		WebElement addtocart=amazon.findElement(By.xpath("//button[@id='a-autoid-5-announce']"));
		addtocart.click();
		
		//checking add to cart
		amazon.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		
		
		String prodcart=amazon.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();

		if(zerocart==prodcart)
		{
			System.out.println("Cart has no product");
		}
		else
		{
			System.out.println("Cart has product");
		}
		
		

	}

}
