package tests;

import manager.AppleManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase implements AppleManager {

    @BeforeSuite
    public void beforeSuit() {

        setUp();
    }

    @AfterSuite
    public void afterSuite() {

//        tearDown();
    }
}
