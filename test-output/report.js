$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kajetanmellerowicz/eclipse-workspace/CucumberBDD/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Norwegian Login Feature",
  "description": "",
  "id": "norwegian-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Norwegian Login Test Scenario",
  "description": "",
  "id": "norwegian-login-feature;norwegian-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page contains Mina resor",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and user enters password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_alread_on_login_page()"
});
formatter.result({
  "duration": 13396569600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_contains_Mina_resor_Norwegian()"
});
formatter.result({
  "duration": 3201033000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_user_enters_password()"
});
formatter.result({
  "duration": 237252900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3033984800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 65091000,
  "status": "passed"
});
});