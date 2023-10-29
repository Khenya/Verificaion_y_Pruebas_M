package activities.calculator;

import control.Button;
import control.Label;
import org.openqa.selenium.By;
public class MainCalculator {
    public Button nineButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.dencreak.dlcalculator:id/pad_btn_b_c\"]"));
    public Button sevenButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.dencreak.dlcalculator:id/pad_btn_b_a\"]"));
    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id=\"com.dencreak.dlcalculator:id/pad_img_d_d\"]"));
    public Button equalButton = new Button(By.xpath("//android.widget.ImageButton[@resource-id=\"com.dencreak.dlcalculator:id/pad_img_e_d\"]"));

    public Label resultLabel = new Label(By.xpath("//android.widget.EditText[@resource-id=\"com.dencreak.dlcalculator:id/lay_normal_body_val\"]"));

}
