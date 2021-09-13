Feature: Display Car details

  Background: Matt wants to check history of car registration before making any decision for the purchase
    Given Matt has opened the application

  @car
  Scenario Outline: The Car details must appear on entering car registration
    When Matt enters the registration number "<Registration>"

    Then the details should contain:
      | Registration No  | Make   | Model   | Color   | Year   |
      | <Registration No> | <Make> | <Model> | <Color> | <Year> |
    Examples:
      | Registration | Registration No | Make       | Model                      | Color | Year |
      | SG18HTN      | SG18HTN         | Volkswagen | Golf Se Navigation Tsi Evo | White | 2018 |
      | DN09HRM      | DN09HRM         | BMW        | 320D Se                    | Black | 2009 |
      |BW57BOF       | BW57BOF         |Toyota      |Yaris T2                    |Black  |2010  |
