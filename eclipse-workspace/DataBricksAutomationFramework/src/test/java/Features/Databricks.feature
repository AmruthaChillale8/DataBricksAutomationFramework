Feature: Validating Databricks Automation

Scenario Outline: Verify if access token is being generating Successfully using CreateTokenAPI
Given Add token payload
When user calls "CreateTokenApi" with "post" http request
When user calls "DeleteToken" with "delete" http request
Then the API call is success with status code 200

      

   