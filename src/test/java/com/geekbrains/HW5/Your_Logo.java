package com.geekbrains.HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Your_Logo {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    void likeRandomSizeS() throws InterruptedException {
        webDriverWait.until(driver1 -> driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_3']")).size() > 0);
        List<WebElement> filmsList = driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_3']"));
        filmsList.get(0).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@title='Cancel']")));
        driver.findElement(By.xpath("//a[@title='Cancel']")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Cancel']")));
        Assertions.assertTrue(driver.findElement(By.xpath("//a[@title='Cancel']")).isDisplayed());
    }

    @Test
    void likeRandomSizeM() throws InterruptedException {
        webDriverWait.until(driver1 -> driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_2']")).size() > 0);
        List<WebElement> filmsList = driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_2']"));
        filmsList.get(0).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@title='Cancel']")));
        driver.findElement(By.xpath("//a[@title='Cancel']")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Cancel']")));
        Assertions.assertTrue(driver.findElement(By.xpath("//a[@title='Cancel']")).isDisplayed());
    }

    @Test
    void likeRandomSizeL() throws InterruptedException {
        webDriverWait.until(driver1 -> driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_1']")).size() > 0);
        List<WebElement> filmsList = driver.findElements(
                By.xpath("//input[@id='layered_id_attribute_group_1']"));
        filmsList.get(0).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@title='Cancel']")));
        driver.findElement(By.xpath("//a[@title='Cancel']")).click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Cancel']")));
        Assertions.assertTrue(driver.findElement(By.xpath("//a[@title='Cancel']")).isDisplayed());
    }

    @AfterEach
    void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
