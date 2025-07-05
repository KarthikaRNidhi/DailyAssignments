package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		edge.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthi");
		
		//Entering name in last name
		edge.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raj");
		
		//Entering company name 
		 edge.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ZOHO");
		 
		 //Entering name in first name local
		 edge.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Karthi");
		 
		 //enter dept
		 edge.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		 
		 //enter description
		 edge.findElement(By.id("createLeadForm_description")).sendKeys("Automatation tester");
		 
		 //enter email
		 edge.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthiravindran91@gmail.com");
		 
		 //select state/province
		WebElement state= edge.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectST=new Select(state);
		selectST.selectByVisibleText("New York");
		
		//Clicking Create lead button
		edge.findElement(By.className("smallSubmit")).click();
		
		//click edit CTA
		edge.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//clear description
		WebElement cleardes= edge.findElement(By.name("description"));
		cleardes.clear();
		
		//enter text in important note
		edge.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("editing lead");
		
		//click update
		edge.findElement(By.xpath("//input[@value='Update']")).click();
		
		//getting the title & storing in variable
		String title=edge.getTitle();
		System.out.println(title);

		//closing the window 
		//edge.close();
				 
		 
	}

}
