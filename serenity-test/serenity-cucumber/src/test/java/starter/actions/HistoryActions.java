package starter.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.Domain.Details;
import starter.Domain.HistoryPanel;
import starter.Domain.RecordedOperation;

import java.util.List;

public class HistoryActions extends UIInteractionSteps {
    public List<RecordedOperation> history() {
        return findAll(HistoryPanel.HISTORY_ROWS)
                .map(this::extractRecordedOperationFrom);
    }

    private RecordedOperation extractRecordedOperationFrom(WebElementFacade row) {
        return new RecordedOperation(
                row.find(HistoryPanel.EXPRESSION).getText(),
                row.find(HistoryPanel.RESULT).getText()
        );
    }

    public List<Details> carHistory() {
        return findAll(HistoryPanel.CAR_ROWS)
                .map(this::extractDetailsFrom);
    }

    private  Details extractDetailsFrom(WebElementFacade row) {
        return new Details(
                row.find(HistoryPanel.REGISTRATION_NO).getText(),
                row.find(HistoryPanel.MAKE).getText(),
                row.find(HistoryPanel.MODEL).getText(),
                row.find(HistoryPanel.COLOR).getText(),
                row.find(HistoryPanel.YEAR).getText()
        );
    }
}
