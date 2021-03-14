package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());
    protected static MyDriver driver= MyDriver.getMyDriver();


    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
