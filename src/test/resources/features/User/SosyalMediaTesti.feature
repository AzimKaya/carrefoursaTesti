Feature:As a user, I want to reach the pages I want by using the social media redirect icons of the site I shop on...

  Scenario:The user accesses the relevant pages through redirect icons.
    Given Go to "url"
    When Clicks the Login buttonLink on the home page
    And Login by entering valid "customerEmail" and "password" on the SignIn page.
    Then The page scrolls down until the social media icons.
    Then Verify that the body redirect buttons "Facebook ","YouTube","Twitter","Linkedin","Instagram",are working.

