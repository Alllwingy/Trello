package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface HelperBase extends AppleManager {

    default void pause(int seconds) {

        try {

            Thread.sleep(seconds * 1_000L);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    default WebElement findElementBy(By locator) {

        return driver.findElement(locator);
    }

    default List<WebElement> findElementsBy(By locator) {

        return driver.findElements(locator);
    }

    default void clickWithMouse(By locator) {

        findElementBy(locator).click();
    }

    default void type(By locator, String text) {

        WebElement element = driver.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    default String isTextInElementPresent(By locator) {

        return findElementBy(locator).getText();
    }

    default boolean isElementPresent(By locator) {

        return !findElementsBy(locator).isEmpty();
    }
}
