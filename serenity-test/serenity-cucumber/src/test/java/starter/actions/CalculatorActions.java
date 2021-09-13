package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

import static starter.Domain.CalculatorForm.RESULT;
import static starter.Domain.CalculatorForm.SUBMIT_BTN;
import static starter.Domain.HistoryPanel.REGISTRATION_NO;

public class CalculatorActions extends UIInteractionSteps {

    public String result() {
        return $(RESULT).getText();
    }

    public void entersRegNo(String regNo) {
        $(REGISTRATION_NO).sendKeys(regNo);
        $(SUBMIT_BTN).click();
    }
}