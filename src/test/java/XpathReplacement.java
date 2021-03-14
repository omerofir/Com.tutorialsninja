import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XpathReplacement {

    public static void main(String[] args) throws InterruptedException {
       // List<WebElement> AlLink = driver.findElements(By.xpath("//footer//" + "lnks" + "//ul[1]//li/a"));
        String aboutus = "div[1]";
        String countactus = "div[2]";
        String brands = "div[3]";
        String myaccount = "div[4]";
        String dollar = "'$ US Dollar'";
        String euro = "'€ Euro'";
        String pound = "'£ Pound Sterling'";
        String xpath = "//button[normalize-space()='$ US Dollar']";
        String xpathtest = "//button[normalize-space()=" + dollar + "]";
       // System.out.println(xpathtest);
        String xpatheuro = "//button[normalize-space()=" + euro + "]";
       // System.out.println(xpatheuro);
      //  String xpathpound = "//button[normalize-space()=" + pound + "]";
      //  System.out.println(xpathpound);
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        //Clicking on the currency button and click euro and validate
        ArrayList<String>curr = new ArrayList<>();
      //  curr.add(pound);
      //  curr.add(euro);
       // curr.add(dollar);
        curr.add(aboutus);
        curr.add(countactus);
        curr.add(brands);
        curr.add(myaccount);
       // System.out.println(curr.get(0));
      //  driver.findElement(By.xpath("//strong[normalize-space()='$']")).click();
        Thread.sleep(1000);
        for (int i=0;i<curr.size(); i ++){
          //  driver.findElement(By.xpath("//span[normalize-space()='Currency']")).click();
            String link = "//button[normalize-space()=" + curr + "]";
         //   System.out.println(link);
            driver.findElement(By.xpath("//footer//" + curr.get(i) + "//ul[1]//li/a")).click();
         //   driver.findElement(By.xpath("//button[normalize-space()=" + curr.get(i) + "]")).click();
            System.out.println("this is a debug line" + curr.get(i));

        }
     //   driver.findElement(By.xpath("//button[contains(text(),'€ Euro')]")).click();
//        String price = driver.findElement(By.xpath("//p[contains(text(),'472.33€')]")).getText();
//        if (price.equalsIgnoreCase("472.33€\n" +
//                "Ex Tax: 392.30€")) {
//            System.out.println("valid price");
//        } else {
//            System.out.println("failed");
//        }
//        //
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).click();
//
//        String price1 = driver.findElement(By.xpath("//h2[contains(text(),'472.33€')]")).getText();
//        if (price1.equalsIgnoreCase("472.33€")) {
//            System.out.println("valid price");
//        } else {
//            System.out.println("failed");
//        }

//        String dollar = "'$ US Dollar'";
//        String euro = "'€ Euro'";
//        String pound = "'£ Pound Sterling'";
//        String xpath = "//button[normalize-space()='$ US Dollar']";
//        String xpathtest = "//button[normalize-space()=" + dollar + "]";
//        System.out.println(xpathtest);
//        String xpatheuro = "//button[normalize-space()=" + euro + "]";
//        System.out.println(xpatheuro);
//        String xpathpound = "//button[normalize-space()=" + pound + "]";
//        System.out.println(xpathpound);


    }
}
