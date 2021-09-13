package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Domain.Details;
import starter.actions.CalculatorActions;
import starter.actions.HistoryActions;
import starter.actions.NavigateActions;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CarCheckerSteps {
    @Steps
    NavigateActions navigate;

    @Given("Matt has opened the application")
    public void mattHasOpenedTheApplication() {
        navigate.toTheCarCheckerApplication();
    }

    @Steps
    CalculatorActions calculator;

    @DataTableType
    public Details convert(Map<String, String> tableRow) {
        return new Details(
                tableRow.get("Registration No"),
                tableRow.get("Make"),
                tableRow.get("Model"),
                tableRow.get("Color"),
                tableRow.get("Year")
        );
    }

    @Steps
    HistoryActions historyActions;

    @Then("the details should contain:")
    public void theDetailsShouldContainRegistrationNoMakeModelColorAndYear(List<Details> carDetails) {
        assertThat(historyActions.carHistory()).containsExactlyElementsOf(carDetails);
    }

    @When("Matt enters the registration number {string}")
    public void mattEntersTheRegistrationNumber(String arg0) {
        calculator.entersRegNo(arg0);
    }
}