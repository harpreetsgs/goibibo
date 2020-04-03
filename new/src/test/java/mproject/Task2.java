package mproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2

{
	public static String search="//input[@class='textField_e79SD']";
	public static String submit ="(//button[@type='submit'])[1]";
	public static String ipad ="(//a[@class='autocompleteLink_2KP1Q'])[1]";
	public static String onlineonly="(//span[@class='productName_3Ikre'])[5]";
	public static String item="//*[@id='facetFilter-Online Only']";
	public static String addtocart ="(//button[@type='submit'])[2]";
	public static String viewcart ="(//span[@class='content_2t17U'])[1]";
	public static String continuetocheckout ="(//span[@class='content_2t17U'])[5]";
	public static String guest ="//a[@class='guest-continue-link']";
			
	public static String email="//input[@type='email']";
	public static String firstname ="//input[@id='firstName']";
	public static String address ="//input[@id='addressLine']";
	public static String lastname ="//input[@id='lastName']";
	public static String city ="//input[@id='city']";
	public static String phone ="//input[@id='phone']";
	public static String continueto ="(//span[@class='content_3dXxd'])[5]";
	public static String visa ="//input[@id='shownCardNumber']";
	public static String cvv ="//input[@id='cvv']";
	public static String error ="(/div[@class='error-msg'])[1]";
		
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","H:\\ch\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.ca");

		WebElement sendi=driver.findElement(By.xpath(search));
		//sendi.click();
		sendi.sendKeys("ipad");
		driver.findElement(By.xpath(submit)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(item)).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(addtocart)).click();

		driver.findElement(By.xpath(viewcart)).click();

		driver.findElement(By.xpath(continuetocheckout)).click();

		driver.findElement(By.xpath(guest)).click();

		driver.navigate().refresh();

		driver.findElement(By.xpath(email)).sendKeys("harryxperias@gmail.com");
		WebElement s1=driver.findElement(By.xpath(firstname));
		s1.sendKeys("harry");
		driver.findElement(By.xpath(address)).sendKeys("home");
		driver.findElement(By.xpath(lastname)).sendKeys("Singh");
		driver.findElement(By.xpath(firstname)).sendKeys("harry");
		driver.findElement(By.xpath(city)).sendKeys("torronto");
		driver.findElement(By.xpath(phone)).sendKeys("942210033");
		driver.findElement(By.xpath(continueto)).click();
		driver.findElement(By.xpath(visa)).sendKeys("942210033");
		driver.findElement(By.xpath(cvv)).sendKeys("356");
		String errormsg=driver.findElement(By.xpath(error)).getText();
		System.out.println(errormsg);
		driver.quit();
		
		
		
	}

}
