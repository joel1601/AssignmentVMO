package VMO.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login{
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sakshingp.github.io/assignment/login.html#");
    }

    @Test
    public void abtestValidLogin() {
        driver.findElement(By.id("username")).sendKeys("Delwyn");
        driver.findElement(By.id("password")).sendKeys("Delwyn@16");
        driver.findElement(By.id("log-in")).click();
    }
        @Test
        public void amountisSorted() throws InterruptedException {
        abtestValidLogin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        WebElement amountElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        amountElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("amount")));
        amountElement.click();
        Thread.sleep(3000);
        }

    
    @AfterMethod
    public void tearDown() {
            driver.quit();
    }
}
