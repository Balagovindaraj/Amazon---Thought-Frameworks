Feature: Product Booking in Amazon Application

Scenario: Login Module in Amazon Application
Given user launches the url
When User clicks signin button on amazon home page
And user enters username in username field
And User ebters password in password field
Then user clicks login button and it's navigate to next page
When user Selects the product from home page
And users click search button and it will give products relatedly

Scenario: product page in amazon application
When user select the product1
And user clicks add to cart button in product page
And user select the product2
And user clicks add to cart button in product page
Then user clicks Add to cart option from home page
Then user validates the products subtotal


