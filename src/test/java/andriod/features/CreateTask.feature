Feature: Create New Task

  Scenario: The user can add new task
    Given Click add new task
    Given Enter taskName
    Given Enter taskDescription
    When  Click save
    Then  Task added successfully
