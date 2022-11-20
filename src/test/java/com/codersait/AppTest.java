package com.codersait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import com.codersait.suppliers.WebDrivers;

public class AppTest {
    private WebDriver driver;

    @Before
    public void setup() {
        // driver = WebDrivers.chromeDriver.get();
        // driver = WebDrivers.firefoxDriver.get();
        driver = WebDrivers.safariDriver.get();

    }

    @Test
    public void test() {
        driver.get("https://www.selenium.dev/");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
