import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    public static void main(String[] args) {
        int num=1;
        num++;
        String email ="test+num+@gmail.com";

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\shop\\sejal\\Sejal Testing\\software\\Chrome Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.startours.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       //click on my account
        driver.findElement(By.xpath("//header/div/div/div[2]/div/div[7]")).click();
        //click on register button
        driver.findElement(By.id("RegisterLink")).click();
        //click on title
        driver.findElement(By.id("Title")).click();
        //find the title mrs
        driver.findElement(By.xpath("//div/div/div/div/form/div/fieldset/div/select/option[3][@value=\"Mrs\"]")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("kajal");
        //Enter surname
        driver.findElement(By.id("Surname")).sendKeys("patel");
        //Enter postcode
        driver.findElement(By.id("InternationalPostCode")).sendKeys("UB5 5RG");
        //Enter address line1
        driver.findElement(By.id("InternationalAddress1")).sendKeys("71 islip manor");
        //Enter address line2
        driver.findElement(By.id("InternationalAddress2")).sendKeys("Northolt");
        // Enter address line3
        driver.findElement(By.id("InternationalAddress3")).sendKeys("Harrow");
        //Enter address line4
        driver.findElement(By.id("InternationalAddress4")).sendKeys("Middlesex");
        //Enter E-mail
        driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
        //Enter conform E-mail
        driver.findElement(By.id("ConfirmEmail")).sendKeys("abc123@gmail.com");
        //Enter day time phone number
        driver.findElement(By.id("TelNo1")).sendKeys("07456321895");
        //Enter evening time phone number
        driver.findElement(By.id("TelNo2")).sendKeys("0712345694");
        //Enter mobile number
        driver.findElement(By.id("MobileNo")).sendKeys("07986543234");
        //Enter Fax
        driver.findElement(By.id("FaxNo")).sendKeys("0897654367");

       // Enter password
        driver.findElement(By.id("WebPassword")).sendKeys("Hiral5656");
        //Enter confirm password
        driver.findElement(By.id("ConfirmWebPassword")).sendKeys("Hiral5656");
        //Click on register button
        driver.findElement(By.id("AccountDetailsSaveDetailsButton")).click();


    }
}
