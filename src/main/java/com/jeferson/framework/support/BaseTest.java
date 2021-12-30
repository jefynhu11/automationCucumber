package com.jeferson.framework.support;

import com.jeferson.framework.webdrives.DriverFactory;
import com.jeferson.framework.webdrives.DriverManager;
import com.jeferson.framework.webdrives.Drivers;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest extends DriverFactory {

    @BeforeClass
    public static void setUp() {
        System.out.println("Iniciou");
        driver = getBrowser(Drivers.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        System.out.println("Finalizou");
//        Thread.sleep(3000);
//        driver.quit();
    }

}
