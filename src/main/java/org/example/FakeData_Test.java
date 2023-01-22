package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class FakeData_Test extends RegisterPage_Elements{
    Faker_Data fakerData=new Faker_Data();

    @Test
    public void Test001(){

        Actions actions=new Actions(My_CD.driver);

        actions.click(RegisterPage_Elements.firstname_item)
                .sendKeys(fakerData.firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(RegisterPage_Elements.lastname_item, fakerData.lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(RegisterPage_Elements.nickname_item, fakerData.username)
                .sendKeys(Keys.TAB)
                .sendKeys(RegisterPage_Elements.password_item, fakerData.password)
                .perform();
        System.out.println(fakerData.firstname);
        System.out.println(fakerData.lastname);
        System.out.println(fakerData.username);



        captcha.click();
        register_btn.click();

        My_CD.closeDriver();

    }
}