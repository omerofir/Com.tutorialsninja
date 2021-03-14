import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class CurrencyChange {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Utils.BASE_URL);
           //Clicking on the currency button and click euro and validate
            driver.findElement(By.xpath("//strong[normalize-space()='$']")).click();
            driver.findElement(By.xpath("//button[contains(text(),'€ Euro')]")).click();
            String price = driver.findElement(By.xpath("//p[contains(text(),'472.33€')]")).getText();
            if (price.equalsIgnoreCase("472.33€\n" +
                    "Ex Tax: 392.30€")) {
                System.out.println("valid price");
            } else {
                System.out.println("failed");
            }
           //
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).click();

            String price1 = driver.findElement(By.xpath("//h2[contains(text(),'472.33€')]")).getText();
            if (price1.equalsIgnoreCase("472.33€")) {
                System.out.println("valid price");
            } else {
                System.out.println("failed");
            }

        }
    }



