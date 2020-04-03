package mproject;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import kotlin.ReplaceWith;
	

public class Scrapping {
	
	WebDriver driver;
	public static String search="//input[@class='LM6RPg']";
	public static String searchbutton="//button[@class='vh79eN']";
	public static String mobilename ="(//div[@class='_3wU53n'])['replace']";
	public static String ratings="(//div[@class='hGSR34'])['replace']";
	public static String price ="(//div[contains(@class,'NK')])['replace']";
	public static String close ="//button[contains(@class,'H8')]";
	
	
		public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(close)).click();
		driver.findElement(By.xpath(search)).sendKeys("mobile");
		driver.findElement(By.xpath(searchbutton)).click();
		
		List<WebElement> namestore = driver.findElements(By.xpath(mobilename)); 
		File newTextFile = new File("H:/kc.txt");

        FileWriter fw = new FileWriter(newTextFile);
        
		for (int i = 0; i < namestore.size(); i++)
	    {
	    	WebElement p=driver.findElement(By.xpath(mobilename.replace("replace"," ' +i '")));
	    	WebElement q=driver.findElement(By.xpath(price.replace("replace"," ' +i '")));
	    	WebElement r=driver.findElement(By.xpath(ratings.replace("replace"," '+i '")));
	    	
	    	String mname=p.getText();
	    	System.out.println(mname);
	    	String mprice=q.getText();
	    	System.out.println(mprice);

	    	String mratings=r.getText();
	    	System.out.println(mratings);
	    
	    	fw.write(mname);
	    	fw.write(mprice);
	    	fw.write(mratings);

	    	

	    }
        fw.close();

		

		
		
		
		
		
		
		
		
		
	}

}
