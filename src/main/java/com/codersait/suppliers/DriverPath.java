package com.codersait.suppliers;

import java.util.function.Supplier;

public class DriverPath {
    public static final Supplier<String> chromeDriverPath = () -> "/Users/sait/Documents/webdrivers/chromedriver";
    public static final Supplier<String> firefoxDriverPath = () -> "/Users/sait/Documents/webdrivers/geckodriver";
}
