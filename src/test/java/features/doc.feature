Feature: Automate leafTaps Application

@smoke
Scenario: TC001_LoginLogout

Given launch chromeBrowser and load url
And enter userName as DemoSalesManager
And enter password as crmsfa
When click the login button
Then it is navigated homepage
And click the logout button
And close browser

@wip
Scenario: TC002_LoginLogout for Failure

Given launch chromeBrowser and load url
And enter userName as Mamun
And enter password as crmsfa
When click the login button
Then it is navigated samepage
But verify error massage