package com.BimaBharosa.utilities;

import com.BimaBharosa.enums.DriverType;
import com.BimaBharosa.enums.OperatingSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

    public static Properties pro;

    public ReadProperty() {
        File src = new File("./src/main/resources/config.properties");

        try {
            FileInputStream file = new FileInputStream(src);
            pro = new Properties();
            pro.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getURL() {
        String url = pro.getProperty("baseURL");
        if (url != null)
            return url;
        else
            throw new RuntimeException("BaseURL not specified in the config file.");
    }

    public String getUsername() {
        String username = pro.getProperty("Username");
        if (username != null)
            return username;
        else
            throw new RuntimeException("Username not specified in the config file.");
    }

    public String getPassword() {
        String password = pro.getProperty("Password");
        if (password != null)
            return password;
        else
            throw new RuntimeException("Password not specified in the config file.");
    }

    public String getChromePath() {

        String chromepath = pro.getProperty("chromePath");
        if (chromepath != null)
            return chromepath;
        else
            throw new RuntimeException("ChromePath not specified in the config file.");
    }

    public String getEdgePath() {
        String edgePath = pro.getProperty("edgePath");
        if (edgePath != null)
            return edgePath;
        else
            throw new RuntimeException("EdgePath not specified in the config file.");
    }

    public String getFirefoxPath() {
        String firefoxPath = pro.getProperty("firefoxPath");
        if (firefoxPath != null)
            return firefoxPath;
        else
            throw new RuntimeException("FirefoxPath not specified in the config file.");
    }

    public String getIEPath(){
        String iePath = pro.getProperty("iePath");
        if (iePath != null)
            return iePath;
        else
            throw new RuntimeException("IEPath not specified in the config file.");
    }

    public String getChromePathLinuxMac(){
        String chromePathLinuxMac = pro.getProperty("chromePathLinuxMac");
        if (chromePathLinuxMac != null)
            return chromePathLinuxMac;
        else
            throw new RuntimeException("ChromePathLinuxMac not specified in the config file.");
    }

    public String getEdgePathLinuxMac(){
        String edgePathLinuxMac = pro.getProperty("edgePathLinuxMac");
        if (edgePathLinuxMac != null)
            return edgePathLinuxMac;
        else
            throw new RuntimeException("EdgePathLinuxMac not specified in the config file.");
    }

    public String getFirefoxPathLinuxMac(){
        String firefoxPathLinuxMac = pro.getProperty("firefoxPathLinuxMac");
        if (firefoxPathLinuxMac != null)
            return firefoxPathLinuxMac;
        else
            throw new RuntimeException("FirefoxPathLinuxMac not specified in the config file.");
    }

    public long getTime() {
        String timeout = pro.getProperty("timeout");

        if (timeout != null) {
            return Long.parseLong(timeout);
        } else {
            throw new RuntimeException("Timeout not specified in the config file.");
        }
    }

    public DriverType getBrowser() {
        String browserName = pro.getProperty("browser");

        switch (browserName) {
            case "chrome":
                return DriverType.CHROME;
            case "firefox":
                return DriverType.FIREFOX;
            case "edge":
                return DriverType.EDGE;
            case "safari":
                return DriverType.SAFARI;
            case "IE":
                    return DriverType.IE;
            default:
                throw new RuntimeException("Browser name key value in configuration file is not matched: " + browserName);
        }
    }

    public OperatingSystem getOperatingSystem() {
        String os = pro.getProperty("OS");

        switch (os) {
            case "Windows":
                return OperatingSystem.WINDOWS;
            case "Linux":
                return OperatingSystem.Linux;
            case "Mac":
                return OperatingSystem.MAC;

            default:
                throw new RuntimeException("Environment type key value in configuration file is not matched: " + os);

        }


    }
}
