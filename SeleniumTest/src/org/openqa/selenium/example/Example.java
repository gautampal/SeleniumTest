package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Example {
    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver();

        // And now use this to visit Google
        driver.get("http://gautamspot.appspot.com");
        //driver.get("http://localhost:8");

        // Find the text input element by its name
        //WebElement element = driver.findElement(By.name("title"));

        // Enter something to search for
        //element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        //element.submit();
        
        WebElement h3Element;
		try {
			h3Element = driver.findElement(By.xpath("//html/body/*[self::h1]/text()"));
			 // Check the title of the page
	        System.out.println("Superhero generated is: " + h3Element.getText());
		} catch (Exception e) {
			System.err.println(e);
			System.out.println("Source is: " + driver.getPageSource());
		}
       

        driver.quit();
    }
}
