import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkimTest {
    public static void main(String[] args) throws IOException, InterruptedException {


        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        FileWriter writer = new FileWriter("link_list.txt", true);

        //Get list of web-elements with tagName  - a
        // List<String>link = new ArrayList<String>();
        //  link.add("driver.findElements(By.xpath(//footer//div[@class='row']//div[1]//ul[1]//li//a")));
     //   List<WebElement> allLinks = driver.findElements(By.xpath("//footer//a"));
        //  List<WebElement> AllLinks = driver.findElements(By.xpath("//footer//div[2]//ul[1]//li//a"));
        //       List<WebElement> AllLink = driver.findElements(By.xpath("//footer//div[3]//ul[1]//li//a"));
        //      List<WebElement> AlLink = driver.findElements(By.xpath("//footer//div[4]//ul[1]//li/a"));
//        String aboutus = "'About Us'";
//        String countactus = "'Contact Us'";
//        String brands = "'Brands'";
//        String myaccount = "'My Account'";


        //Clicking on the currency button and click euro and validate
//        ArrayList<String> curr = new ArrayList<>();
//        curr.add(aboutus);
//        curr.add(countactus);
//        curr.add(brands);
//        curr.add(myaccount);
//        Thread.sleep(1000);
//        for (int i = 0; i < allLinks.size(); i++) {
//            allLinks.get(i);
//            System.out.println(allLinks.get(i));
//
//            //  driver.findElement(By.xpath("//footer//" + curr.get(i) + "//ul[1]//li/a")).click();
//            //  driver.findElement(By.xpath("//a[normalize-space()=" + curr.get(i) + "]")).click();
//            Thread.sleep(1000);
            //  System.out.println("this is a debug line" + curr.get(i));

      //  }
        //Traversing through the list and printing its text along with link address
//        for (WebElement link : allLinks) {
//            writer.write(link.getAttribute("href") + System.lineSeparator());
//            writer.flush();
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//        }
//        for (WebElement link : AllLinks) {
//            writer.write(link.getAttribute("href") + System.lineSeparator());
//            writer.flush();
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//        }
//        for (WebElement link : AllLink) {
//            writer.write(link.getAttribute("href") + System.lineSeparator());
//            writer.flush();
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//        }
//        for (WebElement link : AlLink) {
//            writer.write(link.getAttribute("href") + System.lineSeparator());
//            writer.flush();
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//        }
//    }
        FooterLinks(driver);
        driver.close();

    }

    static void FooterLinks(WebDriver driver) throws IOException {
        System.out.println("-FooterLinks function started-");
        //create a new log txt file.
        FileWriter logger = new FileWriter("FooterLinks.txt", true);
        System.out.println("footer Logger start");
        String details;
        //Get list of web-elements with tagName  - a
        List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//a"));
      //  logger.write("----start of log----" + "\n");
        //going through the list and logging all links by text name and atrribute
        for (WebElement link : footerLinks) {
            details = (link.getAttribute("textContent") + " - " + link.getAttribute("href"));
            logger.append(details + "\n");
            //search for products active links and log the in a file
        }
           // logger.append("-----end of log---- \n");
            logger.close();


            System.out.println("footer links and Working links has been logged.");
        }
    }
