package batch13;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializations
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		//For connecting driver with webpage
		driver.get("https://www.saucedemo.com/");
		//for opening a window
		driver.manage().window().maximize();
		//locator or indentifier
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//url Check
		String ExpectedURL=("https://www.saucedemo.com/inventory.html");
		String ActualURL= driver.getCurrentUrl();
		System.out.println(ActualURL);
		// Compare the current URL with the expected URL
        if (ActualURL.equals(ExpectedURL)) 
        {
            System.out.println("URL matched!");
        } else {
            System.out.println("URL did not match!");
        }


	}

}
