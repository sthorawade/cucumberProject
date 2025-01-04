package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Environment {

	public static String ENVIRONMENT;
	public static String DATABASE_SCHEMA_C;
	public static String DATABASE_NAME;
	public static String PARIS3_URL;
	
	
	@Test
	public static void initializeEnvironment() throws InterruptedException {
		
			  WebDriver driver = new ChromeDriver();
		 
			  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			  driver.get("http://www.google.com/"); 
			  Thread.sleep(5000);  // Let the user actually see something!
			  WebElement searchBox = driver.findElement(By.name("q"));
			  searchBox.sendKeys("ChromeDriver");
			  searchBox.submit(); 
			  Thread.sleep(5000);  // Let the user actually see something!
			  driver.quit();  
			 }
			
	
	
//	public static void setTestEnvironment() {
//		ENVIRONMENT="TEST";
//		DATABASE_SCHEMA_C="DBSYSTC";
//		DATABASE_NAME="DIVRDIVT";
//		PARIS3_URL="http://paris3.com";
//						
//	}
//	
//	public static void setRegressionEnvironment() {
//		ENVIRONMENT="Regression";
//		DATABASE_SCHEMA_C="DBSYSTC";
//		DATABASE_NAME="DIVRDIVT";
//		PARIS3_URL="https://www.amazon.in/";
//	}

}
