Feature: Test Search Suggestions Empty State

Scenario: Validate the Suggestions component show up

    Given User is on MainPage
    When ClickonSearchBar ""
    Then VerifySuggestionsComponents
