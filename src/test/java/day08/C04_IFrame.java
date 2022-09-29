package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_IFrame {

    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
       IFrame,bir websayfasına icine yerlestirilmis baska bir web sayfasıdır
        veya bir HTMLdokumaninin içine yerleştirilmiş baska bir HTML dokumanidir.
         */
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    @Test
    public void test1() {
        //https://html.com/tags/iframe/ adresine gidiniz
        driver.get("https://html.com/tags/iframe/");
        //YouTube videosunu çalıstiriniz.
       /* WebElement youtube = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(youtube);
        driver.findElement(By.xpath("//*[@aria-label='Play']")).click();

        */
    }
}
