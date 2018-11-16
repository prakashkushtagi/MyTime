package MyTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MyTimeSchedule {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.manage().window().maximize();

		driver.get("https://mytime.thomsonreuters.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='USER']")).sendKeys("0167451");
		driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Second@Kst9876#$");

		driver.findElement(By.xpath("//button[@id='safeLoginbtn']")).click();

		driver.findElement(By.xpath("//a[@href='/mytime/WeeklyView.htm']/span")).click();
		
		//driver.findElement(By.xpath("//*[@id='date_prev_button']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='date_next_button']")).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='date_next_button']")).click();
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();			
		driver.findElement(By.xpath("//a[contains(text(),'Clear Maintenance - LTIO Support')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[0].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[0].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[3].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[4].hours']")).sendKeys("1.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[5].hours']")).sendKeys("0.5");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[6].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[7].hours']")).sendKeys("0.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();			
		driver.findElement(By.xpath("//a[contains(text(),'Cobalt Platform Maint')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[1].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[1].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[1].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[3].hours']")).sendKeys("3.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[4].hours']")).sendKeys("3.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[5].hours']")).sendKeys("4.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[6].hours']")).sendKeys("3.0");
		driver.findElement(By.xpath("//*[@id='timecards[1].days[7].hours']")).sendKeys("4.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Global Infrastructure Maintenance')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[2].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[2].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[2].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[3].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[4].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[5].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[6].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[2].days[7].hours']")).sendKeys("1.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Legal Cloud Platform Maintenance')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[3].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[3].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[3].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[3].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[4].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[5].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[6].hours']")).sendKeys("2.0");
		driver.findElement(By.xpath("//*[@id='timecards[3].days[7].hours']")).sendKeys("0.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Legal Small Systems Maintenance')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[4].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[4].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[4].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[3].hours']")).sendKeys("1.5");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[4].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[5].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[6].hours']")).sendKeys("1.0");
		driver.findElement(By.xpath("//*[@id='timecards[4].days[7].hours']")).sendKeys("0.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'Non-Project Time: Out of Office')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//*[@id='optionsDiv2']/p[10]/a")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Vacation')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[0].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[0].days[7].hours']")).clear();
		
		driver.findElement(By.xpath("//*[@id='timecards[0].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[3].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[4].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[5].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[6].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[0].days[7].hours']")).sendKeys("0.0");
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();		
		driver.findElement(By.xpath("//a[contains(text(),'WLN Maintenance/Support')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();		
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[6].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[6].days[7].hours']")).clear();
		                                                
		driver.findElement(By.xpath("//*[@id='timecards[6].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[3].hours']")).sendKeys("3.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[4].hours']")).sendKeys("4.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[5].hours']")).sendKeys("3.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[6].hours']")).sendKeys("2.0");
		driver.findElement(By.xpath("//*[@id='timecards[6].days[7].hours']")).sendKeys("3.0");		
		
		driver.findElement(By.xpath("//div[@id='sarea1']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'eDP Maintenance')]")).click();		
		driver.findElement(By.xpath("//div[@id='sarea2']/div[@class='right']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Project Work')]")).click();
		driver.findElement(By.xpath("//p[@onclick='dont_show_warning=true;']/img[@name='mythomsonlogo']")).click();
		
		driver.findElement(By.xpath("//*[@id='timecards[7].days[1].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[2].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[3].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[4].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[5].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[6].hours']")).clear();
		driver.findElement(By.xpath("//*[@id='timecards[7].days[7].hours']")).clear();
		                                                
		driver.findElement(By.xpath("//*[@id='timecards[7].days[1].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[2].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[3].hours']")).sendKeys("0.5");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[4].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[5].hours']")).sendKeys("0.5");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[6].hours']")).sendKeys("0.0");
		driver.findElement(By.xpath("//*[@id='timecards[7].days[7].hours']")).sendKeys("0.0");
	}
}
