import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_byID {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        System.out.println(firstNameInput.getAttribute("placeholder"));
        firstNameInput.sendKeys("Invat da nu prea, ");
        Thread.sleep(1000);
        firstNameInput.sendKeys("da nu renuntam");
        Thread.sleep(1000);
        firstNameInput.clear();
        Thread.sleep(1000);

        driver.quit();
    }
}
