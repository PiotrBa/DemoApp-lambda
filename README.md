# My first AWS Lambda app

### How it works

1. **The user sends a GET request** to the API Gateway.
2. **The API Gateway forwards the request** to the Lambda function.
3. **Lambda executes the application code** and returns the list of cars.
4. **The API Gateway returns the response** to the user.

I invite you to test it at the link: https://i6rdrepy58.execute-api.us-east-1.amazonaws.com/production/cars


Here is a screenshot of my project:

![Screenshot](https://github.com/PiotrBa/DemoApp-lambda/blob/main/Screenshot.png)


### Short description

I created an application that displays a list of cars using the GET method. 
I use AWS Lambda to run the application code and API Gateway to handle HTTP requests and forward them to Lambda. 
The result seems raw, but that's how it's supposed to be because it's in JSON format. 
The Lambda doesn't support JSP files, so there's no graphical interface.
