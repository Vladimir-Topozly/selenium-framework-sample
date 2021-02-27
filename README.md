# selenium-framework-sample

Sample Java Selenium project for test automation, covering UI and API testing of https://www.saucedemo.com/inventory.html demo web-page. 

# Concepts Included

* Dependency injection
* Page Object pattern
* Common web page interaction methods

## Tools

* Gradle
* TestNG
* Java SE 
* Selenium Webdriver
* REST Asssured

## Requirements

In order to utilise this project you need to have the following installed locally:

* Gradle 4.8.1
* TestNG 7.3.0
* Rest Assured 3.0.2
* Chrome and Chromedriver 88.0.4324.150 (UI tests use Chrome by default)
* Java 1.8

In order for the API tests to pass, you may need to set the VM property: -Dtestng.dtd.http=true


## UI tests list: 
`selenium-framework-sample/selenium-project /src/test/java/tests/UITests.java`
* SuccessfulLogInTest
* LogOutTest
* addItemToCartFromMainPageTest
* addItemToCartFromItemPageTest
* removeItemFromCartTest
* paceOrderTest

## API tests list:
`selenium-framework-sample/selenium-project /src/test/java/tests/APITests.java`
* makeSureThePageIsUp
* verifyURLContentType
* verifyInvalidURL


