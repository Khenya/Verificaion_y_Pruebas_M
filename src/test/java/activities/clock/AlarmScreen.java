package activities.clock;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class AlarmScreen {
    public Button addButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label newAlarm = new Label(By.xpath("//android.widget.Switch[@resource-id=\"com.google.android.deskclock:id/onoff\" and @text=\"ON\"]"));
    public Label settingsAlarmLabel = new Label(By.xpath("(//android.view.ViewGroup[@content-desc=\" Alarm\"])[2]"));
    public Button trashButton = new Button(By.id("com.google.android.deskclock:id/delete"));


}
