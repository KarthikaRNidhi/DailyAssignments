package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAssignment {

	public static void main(String[] args) {

       ChromeDriver driver=new ChromeDriver();
       //loading url
       driver.get("https://www.leafground.com/alert.xhtml");
       
       //maximising screen
       driver.manage().window().maximize();
       
       //implicit wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       //clicking prompt alert 
       driver.findElement(By.xpath("(//h5[text()=' Alert (Prompt Dialog)']/following::span)[1]")).click();
       
       //handling alert
       Alert alert = driver.switchTo().alert();
       
       //storing the text
       String text="Handling prompt alert";
       
       //sending text to type in textbox
       alert.sendKeys(text);
       
       //accepting alert
       alert.accept();
       
       //dismissing alert
       //alert.dismiss();
       
       //getting text from field
       String text1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
       
       //printing text
       System.out.println(text);
       
       //comparing user input text with displayed text in webpage
       if(text.equals(text1))
       {
    	   System.out.println("Text are same");
       }
       else
       {
    	   System.out.println("Text are not same since user input text is printing with default text");
       }
       
       
	}

}
