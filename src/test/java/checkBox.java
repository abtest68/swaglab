import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class checkBox {
    @Test(description = "CheckBoxDemo")
    public void check() {

 WebDriverManager.chromedriver().setup();

 ChromeOptions options = new ChromeOptions();

 options.addArguments("--no-sandbox");

 options.addArguments("--disable-dev-shm-usage");

 options.addArguments("--headless");

 driver = new ChromeDriver(options);

 

 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        //WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.cssSelector(".rct-checkbox svg"));
        boolean isDisplayed = element.isDisplayed();
        boolean isSelected = element.isSelected();
        boolean isEnabled = element.isEnabled();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",element);

        if (isDisplayed == true && isSelected == false && isEnabled == true) {
            element.click();
            System.out.println("Clicked");
        }else {
            System.out.println("Not clickable");
        }

        driver.quit();

    }
}
