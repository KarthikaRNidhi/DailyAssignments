package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String verify="You pressed OK!";
		//launching url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//getting into frame
		driver.switchTo().frame("iframeResult");
		
		//clicking tryit
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//handling alert
		Alert alert = driver.switchTo().alert();
		
		//accepting ok
		alert.accept();
		
		//getting text
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		//printing text
		System.out.println(text);
		
		if(text.equals(verify))
		{
			System.out.println("Text displayed in webpage are matching");
		}
		
		

	}

}
