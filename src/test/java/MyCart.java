
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    import java.awt.*;
    import java.awt.datatransfer.StringSelection;
    import java.awt.event.KeyEvent;

    public class MyCart {
        public static void main(String[] args) throws InterruptedException, AWTException {
            System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Utils.BASE_URL);

            //add product to the cart
            driver.findElement(By.xpath("//a[normalize-space()='Apple Cinema 30\"']")).click();
            driver.findElement(By.xpath("//input[@value='7']")).click();
            driver.findElement(By.xpath("//input[@value='11']")).click();
            driver.findElement(By.xpath("//input[@id='input-option208']")).clear();
            driver.findElement(By.xpath("//input[@id='input-option208']")).sendKeys("Rush");
            driver.findElement(By.xpath("//select[@id='input-option217']")).click();
            driver.findElement(By.xpath("//*[@id=\"input-option217\"]/option[2]")).click();
            driver.findElement(By.xpath("//textarea[@id='input-option209']")).sendKeys("V.I.P");

            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("button-upload222"));
            element.click();

            StringSelection ss = new StringSelection("Testsomething.png");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
            // Ctrl + v
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            Thread.sleep(2000);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(2000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='input-option219']")).clear();
            driver.findElement(By.xpath("//input[@id='input-option219']")).sendKeys("2021-03-09");
            driver.findElement(By.xpath("//input[@id='input-option221']")).clear();
            driver.findElement(By.xpath("//input[@id='input-option221']")).sendKeys("10:30");
            driver.findElement(By.xpath("//input[@id='input-option220']")).clear();
            driver.findElement(By.xpath("//input[@id='input-option220']")).sendKeys("2021-03-09 10:30");
            driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
            driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("3");
            driver.findElement(By.xpath("//button[@id='button-cart']")).click();
            Thread.sleep(1000);

            //open shopping cart
            driver.findElement(By.cssSelector(".fa.fa-shopping-cart")).click();

            //enter coupon code
            driver.findElement(By.xpath("//a[normalize-space()='Use Coupon Code']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='input-coupon']")).sendKeys("123564");
            driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
            Thread.sleep(1000);

            //enter shipping country and city
            driver.findElement(By.xpath("//a[normalize-space()='Estimate Shipping & Taxes']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"input-country\"]/option[113]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"input-zone\"]/option[12]")).click();
            driver.findElement(By.xpath("//input[@id='input-postcode']")).sendKeys("556644");
            driver.findElement(By.xpath("//button[normalize-space()='Get Quotes']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='shipping_method']")).click();
            driver.findElement(By.xpath("//input[@id='button-shipping']")).click();
            Thread.sleep(1000);

            //enter gift card
            driver.findElement(By.xpath("//a[normalize-space()='Use Gift Certificate']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='input-voucher']")).sendKeys("Ab123456");
            driver.findElement(By.xpath("//input[@id='button-voucher']")).click();

            //proceed checkout
            driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
            Thread.sleep(1000);

            //choose user: new/register/gust
            driver.findElement(By.xpath("//input[@value='guest']")).click();
            driver.findElement(By.xpath("//input[@id='button-account']")).click();
            Thread.sleep(2000);

            //input gust user detailes
            driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("israel");
            driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("israeli");
            driver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys("israel123@gmail.com");
            driver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys("02-555256");
            driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("Alenby");
            driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Tel Aviv");
            driver.findElement(By.xpath("//input[@id='button-guest']")).click();
            Thread.sleep(2000);

            //Leave a comment about your order
            driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("Need the item Asap");
            driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
            Thread.sleep(2000);

            //Accept the terms
            driver.findElement(By.xpath("//input[@name='agree']")).click();
            driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
            Thread.sleep(2000);

            //Order confiermation
            driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
            Thread.sleep(1000);
            String confiermation = driver.findElement(By.xpath("//h1[normalize-space()='Your order has been placed!']")).getText();
            System.out.println(confiermation);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();



        }
    }
