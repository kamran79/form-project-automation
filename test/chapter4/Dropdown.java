package chapter4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/kamran-dev-work/selenium-material/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownButton.click();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();


        driver.quit();
    }
}
