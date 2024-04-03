import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_seleniumSearch {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("searchbox_input"));
        searchInput.sendKeys("selenium");

        Thread.sleep(1000); // to replace with a wait asap

        WebElement searchSelect = driver.findElement(By.className("searchbox_suggestion__csrUQ"));

        Thread.sleep(1000);
        searchSelect.click();

        Thread.sleep(1000);




        driver.quit();
    }
}
