package com.geekbrains.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/");
        WebElement sSize = webDriver.findElement(By.xpath("//input[@id='layered_id_attribute_group_1']"));
        sSize.click();
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10));

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cancel']")));
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath("//a[@title='Cancel']"))));
        webDriver.findElement(By.xpath("//a[@title='Cancel']")).click();

        Thread.sleep(3000);

        webDriver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/");
        WebElement saSize = webDriver.findElement(By.xpath("//input[@id='layered_id_attribute_group_2']"));
        saSize.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cancel']")));
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath("//a[@title='Cancel']"))));
        webDriver.findElement(By.xpath("//a[@title='Cancel']")).click();

        Thread.sleep(2000);

        webDriver.get("http://automationpractice.com/index.php?id_category=5&controller=category#/");
        WebElement sbSize = webDriver.findElement(By.xpath("//input[@id='layered_id_attribute_group_3']"));
        sbSize.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cancel']")));
        webDriverWait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath("//a[@title='Cancel']"))));
        webDriver.findElement(By.xpath("//a[@title='Cancel']")).click();


        Thread.sleep(2000);
        webDriver.quit();
    }
}
