import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigationCommandDemo {

    @Test
    public void demo() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.browserstack.com");

        WebElement element = driver.findElement(By.xpath("//div[@class='sign-in-link bstack-mm-li']"));
        element.click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        //driver.close();

    }

}
