package testtask.TestTask;

import org.openqa.selenium.WebDriver;

import webdriver.ChromeWebDriver;

public class webdrivertest {

	public static void main(String[] args) {
		ChromeWebDriver Chromedriver = new ChromeWebDriver();
		WebDriver driver = Chromedriver.getDriver();
		driver.get("http://bnm.md/");

	}

}
