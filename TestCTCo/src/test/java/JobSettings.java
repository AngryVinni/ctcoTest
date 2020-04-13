import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobSettings {
    public ChromeDriver driver;

    @Before
    public void  SetUp(){
        driver= new ChromeDriver();
    }
    @After
    public void close(){
        driver.quit();
    }
}
