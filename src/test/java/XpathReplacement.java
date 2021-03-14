import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XpathReplacement {

    public static void main(String[] args) throws InterruptedException {
        String dollar = "'$ US Dollar'";
        String euro = "'€ Euro'";
        String pound = "'£ Pound Sterling'";
        String xpath = "//button[normalize-space()='$ US Dollar']";
        String xpathtest = "//button[normalize-space()=" + dollar + "]";
        String xpatheuro = "//button[normalize-space()=" + euro + "]";
        String xpathpound = "//button[normalize-space()=" + pound + "]";

        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        //Clicking on the currency button and click euro and validate
        ArrayList<String>curr = new ArrayList<>();
        curr.add(pound);
        curr.add(euro);
        curr.add(dollar);

      //  Thread.sleep(1000);
        for (int i=0;i<curr.size(); i ++){
            driver.findElement(By.xpath("//span[normalize-space()='Currency']")).click();
            String link = "//button[normalize-space()=" + curr + "]";

           driver.findElement(By.xpath("//button[normalize-space()=" + curr.get(i) + "]")).click();
          //  System.out.println(curr.get(i));
            driver.findElement(By.xpath("//img[@title='MacBook']")).click();
            String price = driver.findElement(By.xpath("//*[@id='content']/div/div[2]/ul[2]/li[1]/h2")).getText();

            // validate the currency of each price
            String ch1 = curr.get(i).substring(1,2);

            System.out.println(" the " +ch1+ " test returns: " + (price.contains(ch1)));

            driver.navigate().back();


        }


    }
}
