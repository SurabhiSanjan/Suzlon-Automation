package com.bridgelabz;
import com.bridgelabz.BaseClass;
import com.bridgelabz.SuzlonAutomate;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
public class TestSuzlon extends BaseClass{
    SuzlonAutomate page;
    @BeforeMethod
    public void initialization(){
        setUp();
        page = new SuzlonAutomate(driver);
    }
    @Test
    public void suzlonPageAutomation() throws InterruptedException, AWTException {
        page.automationOnSuzlonPage();
    }
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
