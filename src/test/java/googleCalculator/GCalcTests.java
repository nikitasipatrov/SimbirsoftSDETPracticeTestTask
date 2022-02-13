package googleCalculator;

import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class GCalcTests {
    public static GSearchPage gSearchPage;
    public static GCalcPage gCalcPage;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        gSearchPage = new GSearchPage(driver);
        gCalcPage = new GCalcPage(driver);
        driver.get(ConfProperties.getProperty("googlesearchurl"));
        gSearchPage.inputSearchRequest()
                .clickSearchButton();
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }

    @Epic(value = "Основной функционал калькулятора")
    @Test(description = "Кейс 1. Проверка операций с целыми числами")
    @Owner(value = "Никита Сипатров")
    public void gCalcFirstCase() {
        gCalcPage.pushLeftBracketButton()
                .pushOneButton()
                .pushPlusButton()
                .pushTwoButton()
                .pushRightBracketButton()
                .pushMultipleButton()
                .pushThreeButton()
                .pushMinusBtn()
                .pushFourButton()
                .pushZeroButton()
                .pushDivButton()
                .pushFiveButton()
                .pushEqualButton();
        Assert.assertEquals(ConfProperties.getProperty("formule1"), gCalcPage.getInputFormule());
        Assert.assertEquals(ConfProperties.getProperty("result1"), gCalcPage.getOutputResult());
    }

    @Epic(value = "Основной функционал калькулятора")
    @Test(description = "Кейс 2. Проверка деления на ноль")
    @Owner(value = "Никита Сипатров")
    public void gCalcSecondCase() {
        gCalcPage.pushSixButton()
                .pushDivButton()
                .pushZeroButton()
                .pushEqualButton();
        Assert.assertEquals(ConfProperties.getProperty("formule2"), gCalcPage.getInputFormule());
        Assert.assertEquals(ConfProperties.getProperty("result2"), gCalcPage.getOutputResult());
    }

    @Epic(value = "Основной функционал калькулятора")
    @Test(description = "Кейс 3. Проверка ошибки при отсутствии значения")
    @Owner(value = "Никита Сипатров")
    public void gCalcThirdCase() {
        gCalcPage.pushSinButton()
                .pushEqualButton();
        Assert.assertEquals(ConfProperties.getProperty("formule3"), gCalcPage.getInputFormule());
        Assert.assertEquals(ConfProperties.getProperty("result3"), gCalcPage.getOutputResult());
    }
}