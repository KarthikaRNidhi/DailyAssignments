package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

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
		
		//Clicking Leads tab
		edge.findElement(By.linkText("Leads")).click();
		
		//Clicking find lead
		edge.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//click phone icon
		edge.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//enter ph number
		//edge.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		
		//enter first name
		//edge.findElement(By.name("firstName")).sendKeys("hari");
		
		//click find leads
		//edge.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		//capture 1st lead ID
		String leadIDcapture = edge.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
				
		//clicking 1st lead Id
		edge.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(5000);
		
		//Clicking delete cta
		edge.findElement(By.xpath("//a[text()='Delete']")).click();
		
		Thread.sleep(5000);
		
		//click find leads again
		//edge.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//(//ul[@class='shortcuts']/li)[3]
		
		//Clicking find lead
		edge.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//entering lead id
		edge.findElement(By.xpath("//input[@name='id']")).sendKeys("10699");
		
		//click find leads
		edge.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List.
		String verifyMsg= edge.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div")).getText();
		System.out.println(verifyMsg);
		
		//edge.close();
		
		
	}

}
