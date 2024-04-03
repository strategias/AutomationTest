import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homework_authentication {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement formAuthentication = driver.findElement(By.cssSelector("li:nth-of-type(21) > a"));
        formAuthentication.click();
        WebElement inputUsername = driver.findElement(By.id("username"));
        inputUsername.sendKeys("john.smith");
        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.sendKeys("1234");
        WebElement clickLogin = driver.findElement(By.cssSelector("[class='fa fa-2x fa-sign-in']"));
        clickLogin.click();

        driver.quit();

    }
}

