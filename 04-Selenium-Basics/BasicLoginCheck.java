/*
 * Selenium WebDriver – basic Java example for a portfolio.
 * This is a starter example; update the URL and locators for an authorized demo site.
 * Prerequisites: Java, Selenium WebDriver dependency, and a compatible browser driver.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginCheck {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://example.com/login"); // Replace with an authorized test URL.

            driver.findElement(By.id("email")).sendKeys("demo@example.com");
            driver.findElement(By.id("password")).sendKeys("DemoPassword123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();

            // Replace this check with an assertion that matches the demo application.
            System.out.println("Current page: " + driver.getCurrentUrl());
        } finally {
            driver.quit();
        }
    }
}
