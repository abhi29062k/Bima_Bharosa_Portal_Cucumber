package com.BimaBharosa.base;

import com.BimaBharosa.enums.DriverType;
import com.BimaBharosa.enums.OperatingSystem;
import com.BimaBharosa.objectRepository.LoginPage;
import com.BimaBharosa.utilities.ReadProperty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public class Main {

    ReadProperty readPro = new ReadProperty();

    public String url = readPro.getURL();
    public String chromePath = readPro.getChromePath();
    public String edgePath = readPro.getEdgePath();
    public String firefoxPath = readPro.getFirefoxPath();
    public String iePath = readPro.getIEPath();
    public String chromePathLinuxMac = readPro.getChromePathLinuxMac();
    public String edgePathLinuxMac = readPro.getEdgePathLinuxMac();
    public String firefoxPathLinuxMac = readPro.getFirefoxPathLinuxMac();
    public DriverType browser = readPro.getBrowser();
    public OperatingSystem operatingSystem = readPro.getOperatingSystem();
    public long timeout = readPro.getTime();

    public static WebDriver driver;

    //Log4j implementation
    public static Logger logger = LogManager.getLogger(Main.class);

    LoginPage lp;


    public void selectBrowser() {

        if (operatingSystem.equals(OperatingSystem.WINDOWS)) {
            if (browser.equals(DriverType.CHROME)) {
                System.setProperty("webdriver.chrome.driver", chromePath);
                driver = new ChromeDriver();

            } else if (readPro.getBrowser().equals(DriverType.EDGE)) {
                System.setProperty("webdriver.edge.driver", edgePath);
                driver = new EdgeDriver();

            } else if (readPro.getBrowser().equals(DriverType.FIREFOX)) {
                System.setProperty("webdriver.gecko.driver", firefoxPath);
                driver = new FirefoxDriver();
            } else if (readPro.getBrowser().equals(DriverType.IE)) {
                System.setProperty("webdriver.ie.driver", iePath);
                driver = new InternetExplorerDriver();
            }

        } else if (operatingSystem.equals(OperatingSystem.Linux)) {
            if (browser.equals(DriverType.CHROME)) {
                System.setProperty("webdriver.chrome.driver", chromePathLinuxMac);
                driver = new ChromeDriver();

            } else if (browser.equals(DriverType.EDGE)) {
                System.setProperty("webdriver.edge.driver", edgePathLinuxMac);
                driver = new EdgeDriver();
            } else if (browser.equals(DriverType.FIREFOX)) {
                System.setProperty("webdriver.gecko.driver", firefoxPathLinuxMac);
                driver = new FirefoxDriver();
            }

        } else if (operatingSystem.equals(OperatingSystem.MAC)) {
            if (browser.equals(DriverType.CHROME)) {
                System.setProperty("webdriver.chrome.driver", chromePathLinuxMac);
                driver = new ChromeDriver();

            } else if (browser.equals(DriverType.EDGE)) {
                System.setProperty("webdriver.edge.driver", edgePathLinuxMac);
                driver = new EdgeDriver();

            } else if (browser.equals(DriverType.FIREFOX)) {
                System.setProperty("webdriver.gecko.driver", firefoxPathLinuxMac);
                driver = new FirefoxDriver();

            } else if (browser.equals(DriverType.SAFARI)) {
                driver = new SafariDriver();
            }
        }

        try {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(timeout, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
        } catch (
                Exception e) {
            e.printStackTrace();
        }

    }

    public static void backToSafety() {
        //handle unsecure warning pages
        try {
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id='details-button']")));

            JavascriptExecutor jse2 = (JavascriptExecutor) driver;
            jse2.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@id='proceed-link']")));

        } catch (NoSuchElementException e) {

        }
    }


    public void hitURl() {
        lp=new LoginPage(driver);
        driver.get(url);
    }

}
