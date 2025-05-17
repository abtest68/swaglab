import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radioButtonDemo {

    @Test
    public void radioDemo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement radioElem = driver.findElement(By.id("yesRadio"));
        boolean sel = radioElem.isDisplayed();


        JavascriptExecutor js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",radioElem);

        Thread.sleep(10000);

        radioElem.click();


    }

}
