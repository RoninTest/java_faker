package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage_Elements {
    public RegisterPage_Elements() {
        PageFactory.initElements(My_CD.getDriver(),this);
    }

    @FindBy(id = "firstname")
    public static WebElement firstname_item;

    @FindBy (id="lastname")
    public static WebElement lastname_item;

    @FindBy (id = "userName")
    public static WebElement nickname_item;

    @FindBy (id="password")
    public static WebElement password_item;

    @FindBy (id = "g-recaptcha")
    public static WebElement captcha;


    @FindBy (id = "register")
    public static WebElement register_btn;
}
