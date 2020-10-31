package automationFramework;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    //DriverChrome 
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGecko\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.autohero.com/");
		 driver.manage().window().maximize();
		 //--------------Elements
		 WebElement trovaAuto = driver.findElement(By.xpath ("//*[@id=\"app\"]/div/main/div/div[1]/div/div/div/a"));
		 
		 //--------------Actions
		 trovaAuto.click();
		 
		 	WebElement immatricolazione = driver.findElement(By.xpath("//*[@id=\"firstRegistrationFilter\"]/span"));
		 	immatricolazione.click();
		 
		 	WebElement immatricolazioneStartDate = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div/div[3]/div/div/div/div[1]/select"));
		 	immatricolazioneStartDate.click();
		 		 	Thread.sleep(3000);
		 
		 	Select immatricolazioneStartDate2015 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div/div[3]/div/div/div/div[1]/select")));
		 	immatricolazioneStartDate2015.selectByIndex(6);
		 			Thread.sleep(1000);
		 	 	
		   WebElement chilometraggio = driver.findElement(By.xpath ("//*[@id=\"kilometersFilter\"]/span"));
		   chilometraggio.click();
		   Select chilometraggioEnd = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[1]/div[4]/div/div/div/div[3]/select")));
		   chilometraggioEnd.selectByIndex(1);
		   			Thread.sleep(1000);
		   
		   WebElement piuRecenti = driver.findElement(By.xpath ("//*[@id=\"sortBy\"]"));
		   piuRecenti.click();
		   Select piuRecenti1 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[1]/div[1]/select")));
		   piuRecenti1.selectByIndex(2);
		   			Thread.sleep(5000);
		   			
		   		//*[@id="app"]/div/main/div/div[2]/div/div[2]/a/div[2]/ul/li[1]
		   			///html/body/div[1]/div/main/div/div[2]/div/div[2]/a/div[2]/ul/li[1]
		   List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + "2015" + "')]"));
		  // list.
		   //Assert.assertFalse(true);("Text not found!", list.size() > 0);
		  // Assert.assertEquals(actual, expected);
		// driver.quit();
		 System.out.println("Execution complete");
	}

}
