$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test1_and_3.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: name:Rajalakshmi date:06-Nov-2018"
    }
  ],
  "line": 3,
  "name": "Clear score Task handle",
  "description": "",
  "id": "clear-score-task-handle",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11233372762,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check the clear score Cookies notification status",
  "description": "",
  "id": "clear-score-task-handle;check-the-clear-score-cookies-notification-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Cookies_Notification"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open webpage \"https://www.clearscore.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I check notification is present",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I hit the dismiss button of notification",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I check notification does not reappear after being dismissed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.clearscore.com/",
      "offset": 16
    }
  ],
  "location": "Test1_and_Test3_Steps.i_open_webpage(String)"
});
formatter.result({
  "duration": 171300321,
  "status": "passed"
});
formatter.match({
  "location": "Test1_and_Test3_Steps.i_check_notification_is_present()"
});
formatter.result({
  "duration": 37795,
  "status": "passed"
});
formatter.match({
  "location": "Test1_and_Test3_Steps.i_hit_the_dismiss_button_of_notification()"
});
formatter.result({
  "duration": 46661,
  "status": "passed"
});
formatter.match({
  "location": "Test1_and_Test3_Steps.i_check_notification_does_not_reappear_after_being_dismissed()"
});
formatter.result({
  "duration": 34529,
  "status": "passed"
});
formatter.after({
  "duration": 323278856,
  "status": "passed"
});
formatter.before({
  "duration": 7771443103,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Check the clear score calculator",
  "description": "",
  "id": "clear-score-task-handle;check-the-clear-score-calculator",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Clearscore_Saving_Calculator"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I Navigate to webpage\"https://www.clearscore.com/savings-calculator\"",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I update current score to 50 and score goal to 680",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I check current score interest rate cost and cords available are 3.",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I check score goal interest rate cost and cords available are",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I check potential saving are",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.clearscore.com/savings-calculator",
      "offset": 22
    }
  ],
  "location": "Test1_and_Test3_Steps.i_Navigate_to_webpage(String)"
});
formatter.result({
  "duration": 146049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 26
    },
    {
      "val": "680",
      "offset": 47
    }
  ],
  "location": "Test1_and_Test3_Steps.i_update_current_score_to_and_score_goal_to(int,int)"
});
formatter.result({
  "duration": 1436688,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 65
    }
  ],
  "location": "Test1_and_Test3_Steps.i_check_current_score_interest_rate_cost_and_cords_available_are(int)"
});
formatter.result({
  "duration": 133450,
  "status": "passed"
});
formatter.match({
  "location": "Test1_and_Test3_Steps.i_check_score_goal_interest_rate_cost_and_cords_available_are()"
});
formatter.result({
  "duration": 43395,
  "status": "passed"
});
formatter.match({
  "location": "Test1_and_Test3_Steps.i_check_potential_saving_are()"
});
formatter.result({
  "duration": 29863,
  "status": "passed"
});
formatter.after({
  "duration": 2118092971,
  "status": "passed"
});
});