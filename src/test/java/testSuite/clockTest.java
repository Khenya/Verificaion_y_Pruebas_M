package testSuite;

import activities.clock.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;


public class clockTest {
    AlarmScreen alarmScreen = new AlarmScreen();
    HoursScreen hoursScreen = new HoursScreen();
    MainScreen mainScreen = new MainScreen();
    MinutesScreen minutesScreen = new MinutesScreen();
    SearchWorldClockScreen searchWorldClockScreen = new SearchWorldClockScreen();
    @Test
    public void verifyCreateAlarm(){
        mainScreen.alarmSeccion.click();

        alarmScreen.addButton.click();
        hoursScreen.hoursButton.click();
        minutesScreen.minutesButton.click();
        minutesScreen.okButton.click();
        Assertions.assertNotNull(alarmScreen.newAlarm, "ERROR no se creo la alrma");
    }

    @Test
    public void verifyDelateAlarm(){
        mainScreen.alarmSeccion.click();
        alarmScreen.settingsAlarmLabel.click();
        alarmScreen.trashButton.click();
        Assertions.assertFalse( alarmScreen.settingsAlarmLabel.isControlDisplayed(),
                "ERROR ! no se borro la segunda alarma");
    }

    @Test
    public void verifyCreateNewHours(){
        mainScreen.addWorldClock.click();
        searchWorldClockScreen.searchWorldClock.setText("New York");
        searchWorldClockScreen.firstOption.click();
        Assertions.assertTrue( mainScreen.newclock.isControlDisplayed(),
                "ERROR ! no se creo un nuevo reloj mundial");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}
