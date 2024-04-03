import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Curs13 {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement loginLink = driver.findElement(By.linkText("Form Authentication"));
        loginLink.click();

        WebElement titlePage = driver.findElement(By.className("heading"));
        System.out.println(titlePage.getText());

        WebElement imageGreen = driver.findElement(By.cssSelector("img[alt='Fork me on GitHub']"));
        System.out.println(imageGreen.isDisplayed());
        System.out.println(driver.findElements(By.cssSelector("li")).size());

        driver.close();


    }
}
