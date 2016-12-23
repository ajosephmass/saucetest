package com.yourcompany.Tests;

import com.yourcompany.Pages.*;
import org.junit.Test;
import org.openqa.selenium.InvalidElementStateException;

import static org.junit.Assert.*;

public class FollowLinkTest extends TestBase {

    public FollowLinkTest(String os,
                          String version, String browser, String deviceName, String deviceOrientation) {
            super(os, version, browser, deviceName, deviceOrientation);
    }

    /**
     * Runs a simple test verifying link can be followed.
     * @throws InvalidElementStateException
     */
    @Test
    public void verifyLinkTest() throws InvalidElementStateException {
        //driver.get("http://www.google.com");
        driver.get("https://www.massmutual.com/myaccount/rl/Login/login?type=Customer");
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("abcd");
        driver.findElement(By.xpath("//div[@id='continue-button']/input")).click();
        /*GuineaPigPage page = GuineaPigPage.visitPage(driver);

        page.followLink();
        */
        assertFalse(page.isOnPage());
       
    }
}
