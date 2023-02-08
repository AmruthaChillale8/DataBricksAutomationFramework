Feature: Validating Databricks Automation

Scenario Outline: Verify if warehouse is being generating Successfully using CreateWarehouseAPI
Given Add warehouse payload
When user calls "CreateWarehouseAPI" with the "post" http request
Then API call is success with status code 200

When user calls "GetWarehouseAPI" with the "get" http request
 