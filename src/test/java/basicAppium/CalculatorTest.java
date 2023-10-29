package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import  java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
    AppiumDriver phone;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","adnrod11");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("appPackage","com.dencreak.dlcalculator");
        capabilities.setCapability("appActivity","com.dencreak.dlcalculator.DLCalculatorActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        phone = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

    @Test
    public void verifyCalculatorTest() throws InterruptedException {
//          con id
// click  9
//        phone.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_c")).click();
//        // click +
//        phone.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_d_d")).click();
//        // click 7
//        phone.findElement(By.id("com.dencreak.dlcalculator:id/pad_btn_b_a")).click();
//        // click  =
//        phone.findElement(By.id("com.dencreak.dlcalculator:id/pad_img_e_d")).click();
//        // verification  expectedResult 12 = actualResult 12
//        Thread.sleep(5000);
//        String expectedResult="16";
//        String actualResult= phone.findElement(By.id("com.dencreak.dlcalculator:id/lay_normal_body_val")).getText();
//        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");

        // con xpath
        // click  9
        phone.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.dencreak.dlcalculator:id/pad_btn_b_c\"]")).click();
        // click +
        phone.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.dencreak.dlcalculator:id/pad_img_d_d\"]")).click();
        // click 7
        phone.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.dencreak.dlcalculator:id/pad_btn_b_a\"]")).click();
        // click  =
        phone.findElement(By.xpath("//android.widget.ImageButton[@resource-id=\"com.dencreak.dlcalculator:id/pad_img_e_d\"]")).click();
        // verification  expectedResult 12 = actualResult 12
        Thread.sleep(5000);
        String expectedResult="16";
        String actualResult= phone.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.dencreak.dlcalculator:id/lay_normal_body_val\"]")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");
    }

}
