package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")//(xpath = "//input[@type='text']")
    public WebElement inputUsername;

    @FindBy(name = "password")  //(xpath = "//input[@type='password']")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

// below 3 methods
    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    /**
     *This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        loginButton.click();
    }



}
