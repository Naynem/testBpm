package webdriver;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bnm.Leu;

public class ChromeWebDriver {
	
	private WebDriver driver;
	private Leu sleu;
	
	public ChromeWebDriver(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaYN\\workspace\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		sleu = new Leu();
	}
	public WebDriver getDriver(){
		System.out.println("im here");
		return driver;
	}
	public Leu checkLeu(String website, String xpath, String date){
		driver.get(website);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        WebElement textbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"exchange-form-ajax-input\"]")));

        textbox.click();
        textbox.clear();textbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"exchange-form-ajax-input\"]")));
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        textbox.click();
        textbox.sendKeys(date);
        WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        String[] s = we.getText().trim().split("\n");
       
        for(int i = 0; i<s.length ; i++ ){
        	System.out.print(s[i]+" ");
        	if(i%2 != 0 ){
        		switch (s[i-1]){
        		case "USD" : sleu.setUsd(new BigDecimal(s[i]));System.out.print("Created\n");break;
        		case "EUR" : sleu.setEur(new BigDecimal(s[i]));System.out.print("Created\n");break;
        		case "RON" : sleu.setRon(new BigDecimal(s[i]));System.out.print("Created\n");break;
        		case "UAH" : sleu.setUah(new BigDecimal(s[i]));System.out.print("Created\n");break;
        		case "RUB" : sleu.setRub(new BigDecimal(s[i]));System.out.print("Created\n");break;
        		}
        		
        	}
        }return sleu;
	}
}
