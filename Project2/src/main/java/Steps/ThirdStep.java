package Steps;
import Pages.dasveneba;
import Pages.gartoba;
import io.qameta.allure.Step;

public class ThirdStep {
    gartoba mainPage = new gartoba();

    @Step("clickfirstelement")
    public ThirdStep clickfirstelement(){
        mainPage.firstelement.click();
        return this;

    }
    @Step("clickfirstimage")
    public ThirdStep clickfirstimage(){
        mainPage.firstphoto.click();
        return this;

    }
    @Step("anotherimage")
    public ThirdStep anotherimage(){
        mainPage.nextphoto.click();
        return this;

    }


}
