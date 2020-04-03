package mproject;

import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibibo {
	
	public static String bus="(//span[contains(@class,'iconText ')])[3]";
	public static String date1="(//div[contains(@class,'CheckInDateWrapDi')][1])";
public static String nextmonth ="//div[contains(@class,'MonthChangeRightArrowDiv')]";
		public static String date="(//span[contains(text(),'10')])[1]";

		public static String ndate="(//span[contains(text(),'29')])[1]";


public static String nights ="//div[contains(@class,'NightCountWrap-fity7j')]";
	public static String rooms="//input[(@type='text')]";
	public static String add="//span[contains(@class,'gv3w6r-7')][2]";
	public static String done="//button[contains(@class,'PaxWidgetstyles')]";
	public static String city="//input[contains(@class,'HomePageAutosuggeststyles')]";
	public static String submit="//button[contains(@class,'SearchButtonAutoSuggest')]";
	 public static String any="(//span[contains(@class,'dqxIKI')])[3]";
	 public static String hotelname="(//span[contains(@class,'HotelNameTextSpan-sc')])[1]";
	public static String hotelprice="(//span[contains(@class,'CurrentPrice-sc')])[1]";
		public static String ratings="(//span[contains(@class,'ReviewAndRatingsstyles')])[2]";

	public static String selectroom ="(//button[contains(@class,'RoomFlavor__ButtonWrapper-guj4pt-18 gQCOQU'])[8]";
	public static String sroom="(//button[contains(@class,'RoomFlavor')])[1]";
	public static String name="(//input[(@type='text')])[1]";
	public static String mname="(//input[(@type='text')])[2]";
	public static String email ="(//input[(@type='text')])[3]";
	public static String num="(//input[(@type='text')])[4]";

	public static String Submit1="(//button[contains(@class,'GuestDetailBlock')])[1]";
	

	
	public static void main(String[] args) throws Exception
	{ 
		System.setProperty("webdriver.chrome.driver","H:\\ch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(" https://www.goibibo.com");
		driver.findElement(By.xpath(bus)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(date1)).click();
		driver.findElement(By.xpath(nextmonth)).click();
		driver.findElement(By.xpath(nextmonth)).click();
		//driver.findElement(By.xpath(nextmonth)).click();

		driver.findElement(By.xpath(date)).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(ndate)).click();
		Thread.sleep(5000);

		String night= driver.findElement(By.xpath(nights)).getText();
		System.out.println(night);
		driver.findElement(By.xpath(rooms)).click();
		driver.findElement(By.xpath(add)).click();
		driver.findElement(By.xpath(done)).click();
		//driver.findElement(By.xpath(city)).click();;
		WebElement city1= driver.findElement(By.xpath(city));
		city1.sendKeys("Pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath(any)).click();
		driver.findElement(By.xpath(submit)).click();

		File newTextFile = new File("H:/ibibo.txt");

        FileWriter fw = new FileWriter(newTextFile);
        
		for (int i = 0; i < 3; i++)
	    {
	    	WebElement p=driver.findElement(By.xpath(hotelname.replace("replace"," ' +i '")));
	    	WebElement q=driver.findElement(By.xpath(hotelprice.replace("replace"," ' +i '")));
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

		

		driver.findElement(By.xpath(selectroom)).click();

		driver.findElement(By.xpath(sroom)).click();
		driver.findElement(By.xpath(name)).sendKeys("harry");

		driver.findElement(By.xpath(mname)).sendKeys("Singh");
		driver.findElement(By.xpath(email)).sendKeys("harryxperias@gmail.com");
		driver.findElement(By.xpath(num)).sendKeys("942210033");
		driver.findElement(By.xpath(submit)).click();

		
		
	}

}
