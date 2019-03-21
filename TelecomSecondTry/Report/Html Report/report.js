$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feat/telecomGuru99.feature");
formatter.feature({
  "name": "Validate Scenarios from Guru99 demo Site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Purchase Product via Payment Gateway",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@paymentgateway"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on paymentGatewayHomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentStepDef.user_is_on_paymentGatewayHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects quantity and click on Buy Now Button",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentStepDef.user_selects_quantity_and_click_on_Buy_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on payment gateway page and user clicks on generate Card Num link",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentStepDef.user_lands_on_payment_gateway_page_and_user_clicks_on_generate_Card_Num_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user copies card details",
  "keyword": "And "
});
formatter.match({
  "location": "PaymentStepDef.user_copies_card_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the details payment page and clicks on pay button",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentStepDef.user_enters_the_details_payment_page_and_clicks_on_pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user notes Order Id and track it down",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentStepDef.user_notes_Order_Id_and_track_it_down()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});