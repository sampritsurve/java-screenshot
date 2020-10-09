# java-screenshot

Open the project in Eclipse IDE for java developer.

Dependencies:(jar files)
1. Selenium Jar
    selenium-standalone-server-2.53.0.jar (Recommended)
2. Asot Jar
    ashot-1.5.4.jar  
    
    Download the AShot jar file from the maven repository
    https://mvnrepository.com/artifact/ru.yandex.qatools.ashot/ashot
    
Setup Dependencies:
1. Add the jar file in your build path:
2. In Eclipse, right-click on the project -> go to properties -> Build Path -> Libraries -> Add External jars
3. Select the jar file
4. Apply and Close

What is Ashot API?
Ashot is a third party utility by Yandex supported by Selenium WebDriver to capture the Screenshots. It takes a screenshot of an individual WebElement as well as a full-page screenshot of a page, which is more significant than screen size.

How to Start the Project:
1. Run the project in ecllipse IDE.
2. Enter the url to be screenshoted in the console.
3. The code would get executed, a browser window would open automatically with the url provided. Will automatically capture the screenshot and will scroll till the end of the page.
4. Check the console, it will display a message "Screenshot written in file successfully..!!"
5. You can obtain the screenshot named as Fullscreenshot.jpg in the directory below:
    d:\Fullscreenshot.jpg

Test Cases:
In the test cases folder you will find three test screenshots.
1. Wikipedia website: https://en.wikipedia.org/wiki/Java_(programming_language)
2. Netflix website: https://www.netflix.com/in/
3. Linkedin documentation: https://docs.microsoft.com/en-us/linkedin/shared/authentication/authorization-code-flow?context=linkedin/context
    
    


 
    
    
    
