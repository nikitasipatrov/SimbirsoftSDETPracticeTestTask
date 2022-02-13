package googleCalculator;

import io.qameta.allure.Step;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class GCalcPage {
    private WebDriver driver;
    public GCalcPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//div[@jsname='j93WEe']")
    private WebElement leftBracketButton;

    @FindBy(xpath = "//div[@jsname='N10B9']")
    private WebElement numOneButton;

    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    private WebElement plusButton;

    @FindBy(xpath = "//div[@jsname='lVjWed']")
    private WebElement numTwoButton;

    @FindBy(xpath = "//div[@jsname='qCp9A']")
    private WebElement rightBracketButton;

    @FindBy(xpath = "//div[@jsname='YovRWb']")
    private WebElement multipleButton;

    @FindBy(xpath = "//div[@jsname='KN1kY']")
    private WebElement numThreeButton;

    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    private WebElement minusButton;

    @FindBy(xpath = "//div[@jsname='xAP7E']")
    private WebElement numFourButton;

    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    private WebElement numZeroButton;

    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    private WebElement divButton;

    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    private WebElement numFiveButton;

    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    private WebElement equalButton;

    @FindBy(xpath = "//div[@jsname='abcgof']")
    private WebElement numSixButton;

    @FindBy(xpath = "//div[@jsname='aN1RFf']")
    private WebElement sinButton;

    @FindBy(xpath = "//span[@jsname='ubtiRe']")
    private WebElement inputFormule;

    @FindBy(xpath = "//span[@jsname='VssY5c']")
    private WebElement outputResult;

    @Step
    public GCalcPage pushLeftBracketButton() {
        leftBracketButton.click();
        return this;
    }

    @Step
    public GCalcPage pushOneButton() {
        numOneButton.click();
        return this;
    }

    @Step
    public GCalcPage pushPlusButton() {
        plusButton.click();
        return this;
    }

    @Step
    public GCalcPage pushTwoButton() {
        numTwoButton.click();
        return this;
    }

    @Step
    public GCalcPage pushRightBracketButton() {
        rightBracketButton.click();
        return this;
    }

    @Step
    public GCalcPage pushMultipleButton() {
        multipleButton.click();
        return this;
    }

    @Step
    public GCalcPage pushThreeButton() {
        numThreeButton.click();
        return this;
    }

    @Step
    public GCalcPage pushMinusBtn() {
        minusButton.click();
        return this;
    }

    @Step
    public GCalcPage pushFourButton() {
        numFourButton.click();
        return this;
    }

    @Step
    public GCalcPage pushZeroButton() {
        numZeroButton.click();
        return this;
    }

    @Step
    public GCalcPage pushDivButton() {
        divButton.click();
        return this;
    }

    @Step
    public GCalcPage pushFiveButton() {
        numFiveButton.click();
        return this;
    }

    @Step
    public GCalcPage pushEqualButton() {
        equalButton.click();
        return this;
    }

    @Step
    public GCalcPage pushSixButton() {
        numSixButton.click();
        return this;
    }

    @Step
    public GCalcPage pushSinButton() {
        sinButton.click();
        return this;
    }

    @Step
    public String getInputFormule() {
        String formule = inputFormule.getText();
        return formule;
    }

    @Step
    public String getOutputResult() {
        String result = outputResult.getText();
        return result;
    }
}