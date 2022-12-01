package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-v0.32.0-win64\\geckodriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com");
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("http://google.com");
//		driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.quit();
		
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("donjiji20");
		
		WebElement pWord = driver.findElement(By.id("password"));
		pWord.sendKeys("donjiji@1234");
		
		 //Click n the register link by class
//        driver.findElement(By.cssSelector(".login_register")).click();
        
        //Click n the login button link by tag and id
        driver.findElement(By.cssSelector("input#login")).click();
        
        //Click n the login button link by tag and class
        //driver.findElement(By.cssSelector("input.login_button")).click();
        
        //Click n the login button link by tag and name attribute
        //driver.findElement(By.cssSelector("input[name=login]")).click();



       //Click n the login button link by tag and class and 'type' attribute
        //driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
        
        //Click n the login button link by tag and class and 'value' attribute
        //driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();	
		
		//Forget Password
//		driver.findElement(By.cssSelector("a:contains('Forgot Password?')")).click();
		
//		new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
//		new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
        
        new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");
        
        new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByValue("Hotel Sunshine");
        
        new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
        
        driver.findElement(By.id("Submit")).click();
        
      //Radio next page
        driver.findElement(By.id("radiobutton_0")).click();
        
      //Click on any hyperlink above
        driver.findElement(By.linkText("Booked Itinerary")).click();
        
        driver.findElement(By.linkText("Search Hotel")).click();
        
        driver.findElement(By.partialLinkText("Search")).click();
        
        
        
        

        
		
//		driver.close();
	}

}
