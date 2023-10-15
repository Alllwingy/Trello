package tests;

import manager.LoginHelper;
import models.UserDTOLombok;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends TestBase implements LoginHelper {

    @BeforeClass
    public void beforeClass() {

        clickButtonLogin();
    }

    @Test
    public void positiveLoginTest() {

        UserDTOLombok user = UserDTOLombok.builder()
                .email("alexmedqwerty@gmail.com")
                .password("AlexMed123!")
                .build();

        typeLogin(user.getEmail());
        clickButtonContinue();
        typePassword(user.getPassword());
        clickButtonLoginForm();
        clickButtonAccount();

        Assert.assertEquals(isTextInElementPresent_emailAccount(), user.getEmail());
    }

    @Test
    public void negativeLoginTest_wrongEmail_WO_dot() {

        UserDTOLombok user = UserDTOLombok.builder()
                .email("alexmedqwerty@gmailcom")
                .password("AlexMed123!")
                .build();

        typeLogin(user.getEmail());
        clickButtonContinue();

        Assert.assertTrue(isElementPresent_buttonSignUpForm());
    }

    @AfterMethod
    public void afterMethod() {

        if (isElementPresent_buttonAlreadyHaveAccount())
            clickButtonAlreadyHaveAccount();
    }
}