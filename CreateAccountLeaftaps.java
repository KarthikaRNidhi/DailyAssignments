package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccountLeaftaps {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver edge = new EdgeDriver();
		
		//opening theLeaftaps webpage
        edge.get("http://leaftaps.com/opentaps/control/main");
        
        //maximize the window
		edge.manage().window().maximize();
		
		//Entering username & password
		edge.findElement(By.id("username")).sendKeys("demosalesmanager");
		edge.findElement(By.id("password")).sendKeys("crmsfa");
		
		// clicking submit button
		edge.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking CRM hyperlink
		edge.findElement(By.partialLinkText("CRM")).click();
		
		//Clicking Account tab
		edge.findElement(By.linkText("Accounts")).click();
		
		//Clicking create account
		edge.findElement(By.linkText("Create Account")).click();
		
		//entering name in the accname 
		edge.findElement(By.id("accountName")).sendKeys("Karthika");
		
		Thread.sleep(3000);
		
		//Entering value in description
		edge.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Thread.sleep(3000);
		
		//entering value in Number of employees
		edge.findElement(By.id("numberEmployees")).sendKeys("12");
		
		Thread.sleep(3000);
		
		//Entering the value in Site name
		edge.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		
		Thread.sleep(3000);
		
		//Clicking Create button
		edge.findElement(By.className("smallSubmit")).click();
		
		//getting the title & storing in variable
		String title=edge.getTitle();
		System.out.println(title);


        //closing the window 
		edge.close();
		
		

	}

}
