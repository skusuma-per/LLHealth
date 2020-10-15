Feature: Test Search Suggestions Empty State

Scenario: Validate recent searches

    Given User is on MainPage
    When ClickonSearchBar ""
    Then ValidateSuggestions "based on recent searches"
