package part7;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Robot;

public class VrlBusBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.vrlbus.in/#/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//Robot robot = new Robot();
		
		Thread.sleep(500);
		//Object keyEvent;
		//robot.keyPress(keyEvent.VK_E);
		
		//driver.findElement(By.className("btn-close")).click();
		
		
		WebElement FromCity = driver.findElement(By.xpath("//input[@id='FromCity']"));
		
		Thread.sleep(500);
		FromCity.click();
		//fromCity.clear();
		
		
		FromCity.sendKeys("Bengalore");
		
		//Thread.sleep(2000);
		// WebElement ToCity = 
		 driver.findElement(By.id("ToCity")).click();
		 driver.findElement(By.id("ToCity")).sendKeys("Belagavi");
		  //ToCity.sendKeys("Belagavi");
		 
		  Thread.sleep(2000);
		  
		  WebElement dateField = driver.findElement(By.id("txtFromDate"));
		  dateField.click();
		  WebElement selectDate = driver.findElement(By.xpath("//td[@class='active day']"));
		  selectDate.click();
		  
		  WebElement searchButton = driver.findElement(By.className("searchbtn"));
          searchButton.click();
          Thread.sleep(3000);
		  
		  
		  
		 
		
		

	}

}
