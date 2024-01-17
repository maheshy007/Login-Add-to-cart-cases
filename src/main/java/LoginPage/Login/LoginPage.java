package LoginPage.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koolm\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		// alternative of above in case if have to do in using cssSelector
		// driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();   

		// Thread.sleep(2000);
		// WebDriverWait w =new WebDriverWait(driver,5);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(7000));

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));


		 driver.findElement(By.id("okayBtn")).click();
		// driver.switchTo().alert().dismiss();
		//	Thread.sleep(2000);

		 WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select dropdown = new Select(staticDropdown);
		 dropdown.selectByVisibleText("Consultant");
		//	dropdown.selectByIndex(1);	

		 
		 driver.findElement(By.name("terms")).click();
		 driver.findElement(By.id("signInBtn")).click();
		 
		 // (//button[@class='btn btn-info'])
		// Thread.sleep(4000); 
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-info'])")));

		

        List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

        for(int i =0;i<products.size();i++)

         {

         products.get(i).click();

         }
    	//	driver.findElement(By.xpath("(//button[@class='btn btn-info'])")).click();
		
	    //	driver.findElement(By.xpath("(//button[@class='btn btn-info'][normalize-space()='Add'])[2]")).click();

        //		driver.findElement(By.xpath("(//button[@class='btn btn-info'][normalize-space()='Add'])[3]")).click();

	   //	driver.findElement(By.xpath("(//button[@class='btn btn-info'][normalize-space()='Add'])[4]")).click();
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		// 	alternative of above in case if have to do in using cssSelector
		// driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
