import Pages.MainPage;
import Steps.FirstStep;
import Steps.SecondStep;
import Steps.ThirdStep;
import Steps.ForthStep;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mainTest {
    FirstStep Main = new FirstStep();
    SecondStep Second = new SecondStep();
    ThirdStep Third = new ThirdStep();
    ForthStep Forth = new ForthStep();

    @BeforeMethod
    public void before(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        open("https://www.swoop.ge/");
    }
    @Test
    public void First(){
        Main.Gotodasveneba();
        Second.gotozgvispireti().
                setmaxprice().
                setminprice();
    }
    @Test
    public void Second(){
        Main.Gotogartoba();
        Third.clickfirstelement()
                .clickfirstimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage()
                .anotherimage();
    }
    @Test
    public void Third(){
        Main.Gotokveba();
        Forth.firstelement()
        .increasecount()
        .checktotalamount()
        .clickonyidva()
        .checktotalquantity()
        .checktotalprice()
        .clickbuttyidva();
    }


    @AfterMethod
    public void after(){
        WebDriverRunner.closeWebDriver();
    }

}

}
