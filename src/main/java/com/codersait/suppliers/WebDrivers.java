package com.codersait.suppliers;

import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDrivers {
    public static final Supplier<WebDriver> chromeDriver = () -> {
        System.setProperty(DriverType.chromeDriver.get(), DriverPath.chromeDriverPath.get());
        return new ChromeDriver();
    };
    public static final Supplier<WebDriver> firefoxDriver = () -> {
        System.setProperty(DriverType.firefoxDriver.get(), DriverPath.firefoxDriverPath.get());
        return new FirefoxDriver();
    };
    public static final Supplier<WebDriver> safariDriver = () -> {
        return new SafariDriver();
    };
}
