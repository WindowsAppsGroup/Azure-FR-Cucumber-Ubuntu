package demo.web.test.fr.component;

import java.awt.Toolkit;
import java.io.File;
import java.util.concurrent.TimeUnit;

import com.google.common.base.*;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.opera.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoteWebDriverManager {
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_KEY="webdriver.gecko.driver";
	public static final String DRIVERPATH_CHROME_PROPERTY_KEY="webdriver.chrome.driver";	
	
	
	//firefox linux64 geckodriver:v0.20.0 download location: https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-linux64.tar.gz
	//chrome linux64 chrome driver:2.35 download location  http://chromedriver.storage.googleapis.com/2.35/chromedriver_linux64.zip
	
	public static final String DRIVERPATH_FIREFOX_PROPERTY_VAL=RemoteWebDriverManager.getAbsoluteFilePath("browserdrivers/firefox/geckodriver");
	public static final String DRIVERPATH_CHROME_PROPERTY_VAL=RemoteWebDriverManager.getAbsoluteFilePath("browserdrivers/chrome/chromedriver");
	
	
	public static String getAbsoluteFilePath(String filename){
		String retfilewithfullpath="";
		retfilewithfullpath=filename;
		Path pathfile = Paths.get(filename);
		Path path = Paths.get("");
	    Path effectivePath = path;
	    if (!pathfile.isAbsolute()) {
	        Path base = Paths.get("");
	        effectivePath = base.resolve(path).toAbsolutePath();
	        retfilewithfullpath=effectivePath.normalize().toString() + "/" + filename;
	    }
	    return retfilewithfullpath;
	}
	
	public static ChromeOptions getChromeOptions() {
		 ChromeOptions  options = new ChromeOptions();
		 System.setProperty(DRIVERPATH_CHROME_PROPERTY_KEY, DRIVERPATH_CHROME_PROPERTY_VAL);
		 return options;
	}
	public static FirefoxOptions getFirefoxOptions() {
		FirefoxOptions  options = new FirefoxOptions();
		 System.setProperty(DRIVERPATH_FIREFOX_PROPERTY_KEY, DRIVERPATH_FIREFOX_PROPERTY_VAL);
		 return options;
	}
	
	
}
