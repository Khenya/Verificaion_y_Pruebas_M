package activities.clock;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SearchWorldClockScreen {
    public TextBox searchWorldClock = new TextBox(By.id("com.google.android.deskclock:id/search_src_text"));
    public Button firstOption = new Button(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.deskclock:id/search_results_view\"]/android.widget.LinearLayout[1]"));
}
