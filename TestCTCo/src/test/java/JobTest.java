import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import static org.junit.Assert.*;

public class JobTest extends JobSettings{

    @Test
    public void testJob() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10); //implement wait
        driver.get("https://ctco.lv/en");

        WebElement career = driver.findElementByXPath("//a[contains(text(),'Careers')]");
        Actions actions = new Actions(driver);
        actions.moveToElement(career).perform();
        driver.findElementByXPath("//a[contains(text(),'Vacancies')]").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Test Automation Engineer")));
        driver.findElementByLinkText("Test Automation Engineer").click();
        Thread.sleep(2000);

        WebElement vbh = driver.findElement(By.xpath("//div[19]//div[1]//div[1]//p[3]"));
        List<WebElement> elements = vbh.findElements(By.tagName("br"));
        System.out.println(elements.size());
        assertEquals(5, elements.size());

    }
}
