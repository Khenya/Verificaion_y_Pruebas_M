package activities.clock;

import control.Button;
import org.openqa.selenium.By;

public class HoursScreen {
    public Button hoursButton = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]"));
}
