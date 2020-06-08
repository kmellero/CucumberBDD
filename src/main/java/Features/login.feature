Feature: Norwegian Login Feature

Scenario: Norwegian Login Test Scenario

Given User is already on Login Page
When title of login page contains Mina resor
Then user enters username and user enters password
Then user clicks on login button
Then user is on home page
