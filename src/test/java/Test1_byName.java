import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_byName {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.lambdatest.com/login");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("hello world");
        emailInput.clear();
        Thread.sleep(1000);


        driver.quit();
    }
}
