package starter.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {

    public void toTheCarCheckerApplication() {
        openUrl("https://cartaxcheck.co.uk/");
    }
}