package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLeadLeaftaps {

	public static void main(String[] args) {
        
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
		
		//Clicking Leads tab
		edge.findElement(By.linkText("Leads")).click();
		
		//Clicking create lead
		edge.findElement(By.linkText("Create Lead")).click();
		
		//Entering name in first name
		edge.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthi");
		
		//Entering name in last name
		edge.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		
		//Entering company name 
		 edge.findElement(By.id("createLeadForm_companyName")).sendKeys("ZOHO");
		 
		 //entering title
		 edge.findElement(By.name("generalProfTitle")).sendKeys("Mr");
		 
		//Clicking Create lead button
		edge.findElement(By.className("smallSubmit")).click();
		 
		 //getting the title & storing in variable
		 String title=edge.getTitle();
		 System.out.println(title);


		 //closing the window 
		 edge.close();
		 

	}

}
