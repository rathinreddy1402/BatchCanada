package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {


	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	System.out.println("Browser Launched");
	}

}
