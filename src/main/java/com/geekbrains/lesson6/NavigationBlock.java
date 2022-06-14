package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationBlock extends BaseView {
    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenButton;

    @FindBy(xpath = "//ul[contains(@class,'submenu')]//a[.='T-shirts']")
    private WebElement tShirtsSubmenuTShirtsButton;

    public TShirtsPage clickTShirtsButtonInTShirtsSubmenu() {
        actions.moveToElement(womenButton)
                .build()
                .perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(tShirtsSubmenuTShirtsButton));
        tShirtsSubmenuTShirtsButton.click();
        return new TShirtsPage(driver);
    }
}
