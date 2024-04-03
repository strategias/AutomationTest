import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework_fillFields {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstNameInput = driver.findElement(By.className("form-control"));
        firstNameInput.sendKeys("John");

        Thread.sleep(1000);

        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Smith");

        Thread.sleep(1000);

        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        jobTitleInput.sendKeys("QA");

        Thread.sleep(1000);

        WebElement levelOfEducation = driver.findElement(By.cssSelector("input[value='radio-button-2']"));
        levelOfEducation.click();

        Thread.sleep(1000);

        WebElement sexInput = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        sexInput.click();

        Thread.sleep(1000);

        WebElement dropdownElement = driver.findElement(By.id("select-menu"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("5-9");

        Thread.sleep(1000);

        WebElement datePicker = driver.findElement(By.cssSelector("input#datepicker"));
        datePicker.click();
        WebElement datePicked = driver.findElement(By.xpath("//body/div[2]/div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[2]/td[4]"));
        datePicked.click();

        WebElement submitBtn = driver.findElement(By.linkText("Submit"));
        submitBtn.click();

        Thread.sleep(1000);


        driver.quit();
    }
}
