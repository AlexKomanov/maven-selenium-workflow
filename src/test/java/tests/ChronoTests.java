package tests;

import org.testng.annotations.*;

import java.lang.reflect.Method;

public class ChronoTests {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }









    @Test
    public void test_1(Method method) {
        System.out.println(method.getName());
    }

    @Test
    public void test_2(Method method) {
        System.out.println(method.getName());
    }

    @Test
    public void test_3(Method method) {
        System.out.println(method.getName());
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

}
