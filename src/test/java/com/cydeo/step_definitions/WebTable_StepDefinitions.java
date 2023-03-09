package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDefinitions {


    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    // page de location yaptıktan sonra bunu yapman gerekir

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {

        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
        //Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
        // Driver.getDriver().get("web-table-2.cydeo.com/login"); //url adresini de yazabilirim
        // -get() içine configuration.properties'e yazdığım url i configuration reader dan  alabilirim
    }


    @When("user enter username {string}")
    public void user_enter_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);

    }

    @When("user enter password {string}")
    public void user_enter_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTableLoginPage.loginButton.click();
    }


    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyURLContains("orders");
    }


    @When("user enter username {string} password {string} and logins")
    public void userEnterUsernamePasswordAndLogins(String username, String password) {
        webTableLoginPage.login(username, password);
    }


    @When("User enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
       // webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
       // webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
       // webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));


    }
}
