package week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver pvr=new ChromeDriver();
		  pvr.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		 
		 //maximizing the window
		 pvr.manage().window().maximize();
		 
		 //loading url
		 pvr.get("https://www.pvrcinemas.com/");
		 
		 //clicking chennai
		// pvr.findElement(By.xpath("//h6[text()='Chennai']")).click();
		  
		 //clicking cinemas
		 pvr.findElement(By.xpath("(//p[text()='Quick Book']/following::span)[2]")).click();
		 
		 //selecting cinema
		 pvr.findElement(By.xpath("//div[@id='cinema']/span")).click();
		 
		 Thread.sleep(3000);
		 
		 //selecting cinema location
		 pvr.findElement(By.xpath("(//ul[@role='listbox']/li)[3]")).click();
		 
		 //select date
		 Thread.sleep(3000);
		 //pvr.findElement(By.xpath("//div[@id='date']")).click();
		 pvr.findElement(By.xpath("(//ul[@role='listbox']/li)[2]")).click();
		 
		 //select movie 
		 Thread.sleep(3000);
		 pvr.findElement(By.xpath("(//span[text()='PARANTHU PO'])[2]")).click();
		 
		 //select time
		 pvr.findElement(By.xpath("//span[text()='01:10 PM']")).click();
		 
		 //click book cta
		 pvr.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(3000);
		 //click Accept
		 pvr.findElement(By.xpath("//button[text()='Accept']")).click();
		 
		 Thread.sleep(3000);
		 //select seat
		 pvr.findElement(By.xpath("//span[@id='CL.CLUB|H:15']")).click();
		 
		 //click proceed button
		 pvr.findElement(By.xpath("//button[text()='Proceed']")).click();
		 
		 //print seat number
		 Thread.sleep(3000);
		 String seatNo = pvr.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		 System.out.println("My seat number is" +seatNo);
		 
		 //print grand total
		 String grantTotal=pvr.findElement(By.xpath("(//div[@class='grand-tota col-md-3']/h6)[2]")).getText();
		 System.out.println("Money paid is "+grantTotal);
		 
		 //click continue 
		 pvr.findElement(By.xpath("//button[text()='Continue']")).click();
		 
		 //click close icon
		 Thread.sleep(5000);
		 pvr.findElement(By.xpath("(//div[@class='cross-icon mx-2']/span)[2]")).click();
		 
		String title= pvr.getTitle();
		System.out.println(title);
		 
		 //pvr.close();
		 

	}

}
