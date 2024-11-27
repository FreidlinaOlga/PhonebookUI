package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if(!app.getHome().isHomeComponentPresent()){
            app.getHome().clickOnHomeLink();
        }
    }
    @Test
    public void istHomeComponentPresentTest() {
//        driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
        Assert.assertTrue(app.getHome().isHomeComponentPresent());
    }
}
