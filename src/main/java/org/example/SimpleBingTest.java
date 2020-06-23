package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleBingTest {

    public static void main(String[] args) throws InterruptedException {
        SimpleBingTest sbt = new SimpleBingTest();

        System.setProperty("webdriver.chrome.driver", "E:/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cn.bing.com/");
//        System.out.println("Home page title: " + driver.getTitle());

//        WebElement element = driver.findElement(By.id("sb_form_q"));
//        WebElement element = driver.findElement(By.cssSelector("#sb_form_q"));
//        element.sendKeys("Software Testing");
//        element.submit();
//
//        Thread.sleep(3000);
//
//        driver.quit();

        String str1="语文";
        String str2="数学";
        sbt.search(driver,str1);
        sbt.search(driver,str2);
        driver.findElement(By.id("sb_form_q")).click();
//        driver.findElement(By.xpath("//*[@id=\"sa_5003\"]/div/div/a")).click();
//        #sa_5003 > div > div > a
        driver.findElement(By.cssSelector("#sa_5003 > div > div > a")).click();
        driver.quit();

    }

//    @Test
//    public void test4() throws InterruptedException {
//        String str1="语文";
//        String str2="数学";
//        search(driver,str1);
//        search(driver,str2);
//        driver.findElement(By.id("sb_form_q")).click();
//        // error：试了多种选择器都找不到元素，但在浏览器中可以找到
//        driver.findElement(By.xpath("//*[@id=\"sa_5003\"]/div/div/a")).click();
    //*[@id="sa_5004"]/div/div/a
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        // error：选择器找不到元素，浏览器中可以找到
//        WebElement webElement = driver.findElement(By.cssSelector("#sa_5003 > div > span"));
//        String topRecord = webElement.getText();
//        assertEquals(str1,topRecord);
//    }

    public void search(WebDriver webDriver,String arg) throws InterruptedException {
        webDriver.findElement(By.id("sb_form_q")).sendKeys(arg);
//        Thread.sleep(1000);
        webDriver.findElement(By.id("sb_form_go")).click();
//        Thread.sleep(1000);
        webDriver.navigate().back();
//        Thread.sleep(1000);
    }
}

