package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropDown {

	public static void main(String[] args) throws InterruptedException {
         
		EdgeDriver edge = new EdgeDriver();
		String name="Rajhhhdhd";
		
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
		edge.findElement(By.id("accountName")).sendKeys(name);
		
		Thread.sleep(3000);
		
		//Entering value in description
		edge.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Thread.sleep(3000);
		
        //Select "ComputerSoftware" as the industry. 
		WebElement indusdd=edge.findElement(By.name("industryEnumId"));
		Select comp=new Select(indusdd);
		comp.selectByVisibleText("Computer Software");

		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership=edge.findElement(By.name("ownershipEnumId"));
		Select corpor=new Select(ownership);
		corpor.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue.
		WebElement sourceDD= edge.findElement(By.id("dataSourceId"));
		 Select source=new Select(sourceDD);
		 source.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectBy
		 WebElement marketting= edge.findElement(By.id("marketingCampaignId"));
		 Select ecom=new Select(marketting);
		 ecom.selectByIndex(6);
		 
		 //Select "Texas" as the state/province using SelectByValue. 
		 WebElement state= edge.findElement(By.id("generalStateProvinceGeoId"));
		 Select texas=new Select(state);
		 texas.selectByValue("TX");
		 
		 //creating account
		 edge.findElement(By.xpath("//input[@value='Create Account']")).click();
		 
		 //Verify that the account name is displayed correctly. 
		 String accName=edge.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		 System.out.println(accName);
		 
		 if(accName.contains(name))
		 {
			 System.out.println("The name is correct & verified");
		 }
		 else
		 {
			 System.out.println("The name is not correct & verified");
		 }
		 
		 edge.close();
		 
		 
		 
		 
	}

}
