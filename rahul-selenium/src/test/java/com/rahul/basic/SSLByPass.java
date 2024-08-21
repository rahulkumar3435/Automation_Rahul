package com.rahul.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLByPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    ChromeOptions option = new ChromeOptions();
		    option.setAcceptInsecureCerts(true);
		    
			WebDriver driver = new ChromeDriver(option);
			
			driver.navigate().to("https://expired.badssl.com/");
			
			System.out.println(driver.getTitle());
			
			driver.quit();
			
			// for more capabilities method visit https://developer.chrome.com/docs/chromedriver/capabilities
			//But below four are most commonly used
			
			
			// Add the WebDriver proxy capability.
		/*	Proxy proxy = new Proxy();
			proxy.setHttpProxy("myhttpproxy:3337");
			options.setCapability("proxy", proxy);
			
			*/
			
			
			// Add a ChromeDriver-specific capability.for ading extension
		/*	options.addExtensions(new File("/path/to/extension.crx"));
			ChromeDriver driver = new ChromeDriver(options);
			*/
			
			// to block popups
		/*	ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
			     
         */
			
			
			// to download file to different location
		/*	ChromeOptions options = new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", "/directory/path");
			options.setExperimentalOption("prefs", prefs);
			
			*/
			

	}

}
