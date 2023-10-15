package manager;

import org.openqa.selenium.By;

public interface LoginHelper extends HelperBase {

    By buttonLogin = By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']");

    By buttonContinue = By.id("login-submit");

    By buttonLoginForm = By.id("login-submit");

    By buttonAccount = By.xpath("//button[@data-testid='header-member-menu-button']");

    By buttonSignUpForm = By.id("signup-submit");

    By buttonAlreadyHaveAccount = By.id("already-have-an-account");

    By inputFieldLogin = By.id("username");

    By inputFieldPassword = By.id("password");

    By emailAccount = By.xpath("//div[@data-testid='account-menu-account-section']//div[@class='AS8ZlkEoqFiwD_']");



    default void clickButtonLogin() {

        clickWithMouse(buttonLogin);
    }

    default void typeLogin(String text) {

        type(inputFieldLogin, text);
    }

    default void clickButtonContinue() {

        clickWithMouse(buttonContinue);
    }

    default void typePassword(String password) {

        type(inputFieldPassword, password);
    }

    default void clickButtonLoginForm() {

        clickWithMouse(buttonLoginForm);
    }

    default void clickButtonAccount() {

        clickWithMouse(buttonAccount);
    }

    default String isTextInElementPresent_emailAccount() {

        return isTextInElementPresent(emailAccount);
    }

    default boolean isElementPresent_buttonSignUpForm() {

        return isElementPresent(buttonSignUpForm);
    }

    default void clickButtonAlreadyHaveAccount() {

        clickWithMouse(buttonAlreadyHaveAccount);
    }

    default boolean isElementPresent_buttonAlreadyHaveAccount() {

        return isElementPresent(buttonAlreadyHaveAccount);
    }
}
