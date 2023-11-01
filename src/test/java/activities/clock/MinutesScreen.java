package activities.clock;

import control.Button;
import org.openqa.selenium.By;

public class MinutesScreen {
    public Button minutesButton = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]"));
    public Button okButton = new Button(By.id("android:id/button1"));
}
