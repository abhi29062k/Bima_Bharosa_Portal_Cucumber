package com.BimaBharosa.Hooks;


import com.BimaBharosa.base.Main;
import com.BimaBharosa.objectRepository.LoginPage;
import io.cucumber.java.*;
import org.openqa.selenium.*;

import java.io.PrintWriter;
import java.io.StringWriter;


public class Hooks extends Main {

    private final SharedContext sharedContext;

    public Hooks(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }


    // ANSI escape codes
    private static final String RESET = "\033[0m";
    private static final String BOLD = "\033[1m";
    private static final String RED = "\033[31m";
    private static final String GREEN = "\033[32m";
    private static final String YELLOW = "\033[33m";
    private static final String ORANGE = "\033[38;5;208m";



    @Before
    public void openBrowser(Scenario scenario) {
        logger.info("<------------------------------------------------------------------>");
        logger.info("Scenario Started {} ", scenario.getName());
        logger.info("<------------------------------------------------------------------>");
        selectBrowser();
        hitURl();
        backToSafety();
    }


    @After(order = 0)
    public void afterScenario(Scenario scenario) {
        Status status = scenario.getStatus();

        switch (status) {
            case PASSED:
                logger.info("Scenario Passed: {}", scenario.getName());
                break;
            case FAILED:
                logger.error("Scenario failed: {}", scenario.getName());
                scenario.log("Scenario failed: " + scenario.getName());

                // Log the exception details if available
                Throwable throwable = sharedContext.getThrowable();
                if (throwable != null) {
                    StringWriter error = new StringWriter();
                    throwable.printStackTrace(new PrintWriter(error));
                    logger.error(error.toString());
                    scenario.log(error.toString());
                }
                break;
            case SKIPPED:
                logger.warn("Scenario skipped: {}", scenario.getName());
                break;
            case PENDING:
                logger.warn("Scenario pending: {}", scenario.getName());
                break;
            case UNDEFINED:
                logger.warn("Scenario undefined: {}", scenario.getName());
                break;
            case AMBIGUOUS:
                logger.warn("Scenario ambiguous: {}", scenario.getName());
                break;
            default:
                logger.info("Scenario status unknown: {}", scenario.getName());
                break;
        }


        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
        logger.info("==========================================================================");
        logger.info("================================Test {}===============================", scenario.getStatus().toString());
        logger.info("==========================================================================");

        if (driver != null) {
            driver.quit();
        }
    }

    @After(order = 1)
    public void logout() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.logOutSuccess();
    }


    @AfterStep
    public static void takeScreenShot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");
    }
}
