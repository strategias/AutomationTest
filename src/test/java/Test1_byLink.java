import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test1_byLink {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com");
        //WebElement autocompleteLink = driver.findElement(By.linkText("Autocomplete"));
        List<WebElement> autocompleteLink = driver.findElements(By.partialLinkText("and"));
        Thread.sleep(1000);
        autocompleteLink.get(2).click();
        Thread.sleep(1000);


        driver.quit();
    }
}
