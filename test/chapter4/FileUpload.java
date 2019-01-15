package chapter4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws  InterruptedException{

//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver", "D:/kamran-dev-work/selenium-material/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploader = driver.findElement(By.id("file-upload-field"));
        fileUploader.sendKeys("abc.jpg");
        Thread.sleep(2500);
        driver.quit();
    }
}
