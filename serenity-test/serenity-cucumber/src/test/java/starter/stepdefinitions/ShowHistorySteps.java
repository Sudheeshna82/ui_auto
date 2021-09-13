package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.actions.HistoryActions;
import starter.Domain.RecordedOperation;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ShowHistorySteps {
    @DataTableType
    public RecordedOperation convert(Map<String,String> tableRow){
        return new RecordedOperation(
                tableRow.get("Expression"),
                tableRow.get("Result")
        );
    }

    @Steps
    HistoryActions historyActions;
    @Then("the calculation history should contain:")
    public void theCalculationHistoryShouldContain(List<RecordedOperation> expectedHistory) {
        assertThat(historyActions.history()).containsExactlyElementsOf(expectedHistory);
    }
}
