package starter.Domain;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;

public class CalculatorForm {
    public static final By LEFT_OPERAND = ByAngular.model("first");
    public static final By OPERATOR = ByAngular.model("operator");
    public static final By RIGHT_OPERAND = ByAngular.model("second");
    public static final By GO_BUTTON = By.id("gobutton");
    public static final By RESULT = By.tagName("h2");
    public static final By REGISTRATION_NO = By.xpath("//*[@id=\"vrm-input\"]") ;
    public static final By SUBMIT_BTN = By.xpath("//*[@id=\"m\"]/div[2]/div/div/div/div/form/button");
}
