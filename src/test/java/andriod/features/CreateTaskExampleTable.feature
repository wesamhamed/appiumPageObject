Feature: Create New Task

  Scenario Outline: The user can add new task
    Given Click add new task
    Given Enter "<taskName>" and "<taskDescription>"
    When  Click save
    Then  Task added successfully

    Examples:
      | taskName | taskDescription |
      | cucumber task 1 | task 1 details |
      | cucumber task 2 | task 2 details |
