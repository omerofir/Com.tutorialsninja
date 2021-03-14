import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Links {
    public static void main(String[] args) throws IOException {
        //Login to the site
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        FileWriter writer = new FileWriter("link_list.txt", true);

        //Get list of web-elements with tagName  - a
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//footer//div[4]//ul[1]//li/a"));

        //Traversing through the list and printing its text along with link address
       // for (WebElement link : allLinks) {
//            writer.write(link.getAttribute("href") + System.lineSeparator());
//            writer.flush();
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));


            Scanner scanner = new Scanner(new File("Link_List.txt"));
            while (scanner.hasNextLine()) {
                String p = scanner.nextLine();
          //      System.out.println(p);
                //    var xPathQuery = String.format("//a[contains(text(),'About Us')]");
                //  System.out.println(xPathQuery);
                driver.get(p);


                // driver.findElement(By.xpath("//a[normalize-space()=' "," " + line + " ')]");
                // driver.findElement(By.xpath("a//a[normalize-space()='", ++ line ++ ""));
            }
            ////a[contains()='Contact Us']
        }

        // writer.close();
        //Commenting driver.quit() for user to easil

        // List<WebElement>AllLinks = driver.findElements(By.xpath("//footer//div[2]//ul[1]//li//a"));
        //   List<WebElement>aLlLinks = driver.findElements(By.xpath("Extras - //body//footer//div[3]//ul[1]//li//a"));
        //  List<WebElement>AlLlinks = driver.findElements(By.xpath("My Account  - //body//footer//div[4]//ul[1]//li/a"));
    }



