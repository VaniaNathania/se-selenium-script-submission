// Generated by Selenium IDE
// Saya mengubah Text area dari empty menjadi berisi "Vania", mengubah Button menjadi berwana ungu, dan mengubah dropdown nya menjadi set to 75%
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LatihanSeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void latihanSelenium() {
    driver.get("https://seleniumbase.io/demo_page");
    driver.manage().window().setSize(new Dimension(786, 816));
    driver.findElement(By.id("myTextarea")).click();
    driver.findElement(By.id("myTextarea")).sendKeys("Vania");
    driver.findElement(By.id("myButton")).click();
    driver.findElement(By.id("mySelect")).click();
    {
      WebElement dropdown = driver.findElement(By.id("mySelect"));
      dropdown.findElement(By.xpath("//option[. = 'Set to 75%']")).click();
    }
  }
}
