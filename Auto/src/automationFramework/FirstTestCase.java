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
		  
		  //Verify Year			
		  if(driver.getPageSource().contains("2015")&driver.getPageSource().contains("2016")&driver.getPageSource().contains("2017")&driver.getPageSource().contains("2018")&driver.getPageSource().contains("2019")&driver.getPageSource().contains("2020")) {
		   		System.out.println("Verifica Anno Passed");
		   		}else{
		   		System.out.println("Verifica Anno Failed");		
		   		}
		  //Verify Price Range
		// scrape price elements
/*		  List<WebElement> price = driver.findElements(By.xpath("//span[@class='find_prices']"));

		  // extract the prices from the price elements and store in a List
		  List<String> prices = new ArrayList<String>();
		  for (WebElement e : price)
		  {
		      prices.add(e.getText());
		  }

		  // make a copy of the list
		  List<String> sortedPrices = new ArrayList<String>(prices);

		  // sort the list
		  Collections.sort(sortedPrices);

		  // true if the prices are sorted
		  System.out.println(sortedPrices.equals(prices));*/
		  
		 driver.quit();
		 System.out.println("Execution complete");
	}

}
