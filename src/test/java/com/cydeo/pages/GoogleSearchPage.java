package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class GoogleSearchPage {
    // first create constructor
    public GoogleSearchPage() {
        // I have to initilaze driver
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // we can start locating web elements using @FindBy annotation
    @FindBy(name= "q")
    public WebElement searchBox;

}



