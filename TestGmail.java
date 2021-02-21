package Testing;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.webElemet;
import org.openqa.selenium.chrome.chromeDriver;


public class TestGmail {
	static {
		System.setProperty("wedriver.chrome.driver","DriverPapali/chromedriver.exe");
	
	}
		public static void main(String[] args) throws  InterruptedException { 
		
		
		// TODO Auto-generated method stub
ChromeDriver driver= new ChromeDriver();
  ((Object) driver.manage()).Window().maximize();
  driver.get("https://www.gmail.com");
  ((Object) driver.manage()).timeouts().implicitlywait(10,TimeUnit.SECONDS);
  WebElement Username=driver.findElement(By.xpath("/Input[@type='email']"));
  Username.sendkeys("xzx19351@gmail.com");
  driver.findElement(By.Xpath("//span[@class='Rven snByac']")).click();
  WebElement pwd= driver.findElement(By.xpath("//input[@name='password'"));
  Thread.sleep( 1000);
  pwd.sendkeys("XyzPs19351");
  driver.findEkement(By.xpath("//span[.='Next']")).cick();
  Thread.sleep( 500);
  driver.findElement(By.xpath("//div[@class='T-I J-JS-Ji T-I-KE L3")).click();
  webElement to= driver.findElement (By.xpath("//textarea[@name='to']"));
  to.sendkeys("xzx19351@gmail.com");
 
  webElement txt = driver.findElement(By.xpath("//input[@name='subjectbox']"));
  sub.sendkeys("Hello");
  Object txt1 = driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
  txt1.sendKey("Hello Friends");
  txt1.sendkeys("This is my frist automated test mail");
  Thread.sleep(500);
  ((Object) driver.findElement(By.xpath("//div[@class='T-I J-JS-Ji aoO v7 T-I-atl L3']"))).click();
  Thread.sleep( 500);
  //driver.close();
  
  
  
	}

	}
