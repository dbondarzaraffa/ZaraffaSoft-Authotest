import com.gargoylesoftware.htmlunit.WebWindow;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllPagesTest {

        WebDriver driver = new ChromeDriver();
        String handleHost = driver.getWindowHandle();


    public void switchToNewTab(){
        try {
            for (String handle: driver.getWindowHandles()) {
                if (handle != handleHost) {
                    driver.switchTo().window(handle);
                    driver.switchTo().activeElement();
                }
            }
        } catch (Exception e) {
            System.err.println("Couldn't get to second page");
        }
    }


    public void switchToMainTab(){
        try {
            driver.switchTo().window(handleHost);
            driver.switchTo().activeElement();
        } catch (Exception e) {
            System.err.println("Couldn't get back to first page");
        }
    }



        @Before
        public void setUp(){
            WebDriverWait wait = new WebDriverWait(driver, 30, 500);

//            System.setProperty("webdriver.chrome.driver", "C:/Docs/Automate/chromedriver.exe");
            driver.manage().window().maximize();
            driver.get("http://zaraffasoft.com/");
        }


        @Test
        public void allPages() {
            WebDriverWait wait = new WebDriverWait(driver, 10, 500);

//Every test should return to the home page
//"get free quote" button clicking on the home page
            driver.findElement(By.cssSelector(".header__content [href='/contacts.html#contacts']")).click();
            System.out.println("\n" + "1. 'Contact us' page " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"BAGBNB" title clicking on the home page
            driver.findElement(By.cssSelector(".project__title [href='/bagbnb.html']")).click();
            System.out.println("\n" + "2. 'BAGBNB' page "+ driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"BAGBNB" "READ CASE" button clicking on the home page
            driver.findElement(By.cssSelector("a[href='/bagbnb.html'][class='btn-color']")).click();
            System.out.println("\n" + "3. 'BAGBNB' page after 'READ CASE' button clicking "+ driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"Terravision Group case" title clicking on the home page
            driver.findElement(By.cssSelector(".project__title [href='/terravision.html']")).click();
            System.out.println("\n" + "4. 'Terravision Group case' page "+ driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"Terravision Group case" "READ CASE" button clicking on the home page
            driver.findElement(By.cssSelector("a[href='/terravision.html'][class='btn-color']")).click();
            System.out.println("\n" + "5. 'Terravision Group case' page after 'READ CASE' button clicking "+ driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"TALL storIES @ Clutch" button clicking on the home page
            driver.findElement(By.cssSelector("a[href='https://clutch.co/profile/zaraffasoft#reviews'][class='btn-color']")).click();
            switchToNewTab();
            wait.until(ExpectedConditions.titleContains("ZaraffaSoft Client Reviews | Clutch.co"));
            System.out.println("6. www.clutch.co 'ZaraffaSoft' page "+ driver.getCurrentUrl());
            driver.close();
            switchToMainTab();


//"Portfolio page" link on the menu
            driver.findElement(By.cssSelector(".top-line [href='/portfolio.html']")).click();
            System.out.println("\n" + "7. 'Portfolio' page after clicking the 'Portfolio' link in the menu " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"Our Team" link on the menu
            driver.findElement(By.cssSelector(".top-line [href='/team.html']")).click();
            System.out.println("\n" + "8. 'Our Team' page after clicking the 'Our Team' link in the menu " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"Blog" link on the menu
            driver.findElement(By.cssSelector(".top-line [href='https://www.zaraffasoft.com/web-development-company-blog/']")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));
            System.out.println("\n" + "9. 'Blog' page after clicking the 'Blog' link in the menu " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();

//"Contact us" link on the menu
            driver.findElement(By.cssSelector(".top-line [href='/contacts.html']")).click();
            System.out.println("\n" + "10. 'Contacts' page after clicking the 'Contact us' link in the menu " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [href='/index.html']")).click();


//"Portfolio" link on the menu
            driver.findElement(By.cssSelector(".footer [href='/portfolio.html']")).click();
            System.out.println("\n" + "11. 'Portfolio' page after clicking the 'Portfolio' link in the footer " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".footer [href='/index.html']")).click();


//"Our Team" link on the menu
            driver.findElement(By.cssSelector(".footer [href='/team.html']")).click();
            System.out.println("\n" + "12. 'Our Team' page after clicking the 'Our Team' link in the footer " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".footer [href='/index.html']")).click();


//"Blog" link on the menu
            driver.findElement(By.cssSelector(".footer [href='https://www.zaraffasoft.com/web-development-company-blog/']")).click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));
            System.out.println("\n" + "13. 'Blog' page after clicking the 'Blog' link in the footer " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".top-line [class='logo__img']")).click();
            System.out.println("\n" + "13.1 Top logo was clicked!");


//"Contact us" link on the menu
            driver.findElement(By.cssSelector(".footer [href='/contacts.html']")).click();
            System.out.println("\n" + "14. 'Contact us' page after clicking the 'Contact us' link in the footer " + driver.getCurrentUrl());
            driver.findElement(By.cssSelector(".footer [class='logo__img']")).click();
            System.out.println("\n" + "14.1 Footer logo was clicked!");
            driver.findElement(By.cssSelector(".footer [href='/index.html']")).click();


//"Facebook" button in the top
            driver.findElement(By.cssSelector(".header__social [href='https://www.facebook.com/ZaraffaSoft/']")).click();
            switchToNewTab();

            System.out.println("\n" + "15. 'Facebook' page after clicking the 'Facebook' button in the header "+ driver.getCurrentUrl());
            driver.close();
            switchToMainTab();


//"Facebook" button in the 'contacts' block
            driver.findElement(By.cssSelector(".contacts__social [href='https://www.facebook.com/ZaraffaSoft/']")).click();
            switchToNewTab();

            System.out.println("\n" + "16. 'Facebook' page after clicking the 'Facebook' button in the 'contacts' block "+ driver.getCurrentUrl());
            driver.close();
            switchToMainTab();


//"Linkedin" button in the top
            driver.findElement(By.cssSelector(".header__social [href='https://www.linkedin.com/company/5100070/']")).click();
            switchToNewTab();

            System.out.println("\n" + "17. 'Linkedin' page after clicking the 'Linkedin' button in the header "+ driver.getCurrentUrl());
            driver.close();
            switchToMainTab();


//"Linkedin" button in the 'contacts' block
            driver.findElement(By.cssSelector(".contacts__social [href='https://www.linkedin.com/company/5100070/']")).click();
            switchToNewTab();

            System.out.println("\n" + "18. 'Linkedin' page after clicking the 'Linkedin' button in the 'contacts' block "+ driver.getCurrentUrl());
            driver.close();
            switchToMainTab();
        }

        @After
        public void tearDown(){
            if(driver != null)
                driver.quit();
        }


}