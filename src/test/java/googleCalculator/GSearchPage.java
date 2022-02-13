package googleCalculator;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GSearchPage {

    private WebDriver driver;
    public GSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(name = "q")
    private WebElement searchString;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @Step
    public GSearchPage inputSearchRequest() {
        searchString.sendKeys("калькулятор");
        return this;
    }

    @Step
    public GSearchPage clickSearchButton() {
        searchButton.click();
        return this;
    }
}
