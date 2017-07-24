package testtask.TestTask;

import bnm.Compare;
import htmlrequest.HtmlRequest;
import webdriver.ChromeWebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	String date = "24.07.2017";
    	Compare compare = new Compare();
    	compare.setSeleu(new ChromeWebDriver().checkLeu("http:bnm.md", "//*[@id=\"ajax-wrapper-list\"]",date));
    	System.out.println(compare.getSeleu().toString());
    	compare.setSoleu(new HtmlRequest().check(date,"176.221.42.213", 3130));//please insert a valid online proxy
    	System.out.println(compare.getSoleu().toString());
    	if(compare.compare())System.out.println("for "+date+" tables are equal");
        
    }
}
