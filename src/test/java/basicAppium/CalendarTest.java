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
public class CalendarTest {
    AppiumDriver phone;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy Tab S7 de brenda khenya");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("appPackage","com.samsung.android.calendar");
        capabilities.setCapability("appActivity","com.samsung.android.app.calendar.activity.MainActivity");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        phone = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

    @Test
    public void verifyCalendarTest() throws InterruptedException {
        String evento = "holi :D";

        //click +
        phone.findElement(By.id("com.samsung.android.calendar:id/swipe_touch_layout")).click();
        // set evento
        phone.findElement(By.id("com.samsung.android.calendar:id/quick_add_activity_edit_text")).sendKeys(evento);
        // click save
        phone.findElement(By.id("com.samsung.android.calendar:id/lottieView")).click();

        // v
        phone.findElement(By.xpath("//android.view.View[@content-desc=\" \" and @text=\"2023-10-30\"]")).click();

        Assertions.assertTrue( phone.findElements(By.xpath("//android.widget.TextView[@text='"+evento+"']")).size() >= 1,
                "ERROR ! no se creo la tarea");


    }
}
