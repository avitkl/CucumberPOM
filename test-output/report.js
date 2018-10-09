$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/JavaSeleniumFramework/CucumberWithPOM/src/test/java/com/qa/features/loginIntoFreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Free CRM Application",
  "description": "",
  "id": "login-into-free-crm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "login-into-free-crm-application;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user log into application",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page tile",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.user_opens_browser()"
});
formatter.result({
  "duration": 8862417164,
  "status": "passed"
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 27413930,
  "status": "passed"
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 4643581611,
  "status": "passed"
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.validate_home_page_tile()"
});
formatter.result({
  "duration": 10988631,
  "status": "passed"
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 84216864,
  "status": "passed"
});
formatter.match({
  "location": "LoginIntoFreeCRMSteps.close_the_browser()"
});
formatter.result({
  "duration": 654470686,
  "status": "passed"
});
});