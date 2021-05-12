# Author: Khalid Mahmood
# Date: 11th May 2021
# Description:
      # 1. Reads given input file: car_input.txt
      # 2. Extracts vehicle registration numbers based on pattern(s).
      # 3. Each number extracted from input file is fed to https://cartaxcheck.co.uk/ (Perform Free Car Check)
      # 4. Compare the output returned by https://cartaxcheck.co.uk/ with given car_output.txt
      # 5. Highlight/fail the test for any mismatches.

Feature: Test Car Tax Check Functionality

  Scenario: Validate Vehicle Registration Details
    Given I read the vehicle registration details from input text file
    When I search a registration number on Car Tax Check website
    And I read the vehicle details from the output text file
    Then Details on website should match the details in output text file
