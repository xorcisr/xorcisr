Feature: Minimum properties of a "bug"
  Scenario: A basic bug
    Given a new bug
    Then I should see a "summary" property
    And I should see a "description" property 

