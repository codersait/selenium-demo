package com.codersait.suppliers;

import java.util.function.Supplier;

public class DriverType {
    public static final Supplier<String> chromeDriver = () -> "webdriver.chrome.driver";
    public static final Supplier<String> firefoxDriver = () -> "webdriver.gecko.driver";
}
