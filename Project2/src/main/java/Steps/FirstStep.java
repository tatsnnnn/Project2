package Steps;
import Pages.MainPage;
import io.qameta.allure.Step;

public class FirstStep {
    MainPage mainPage = new MainPage();

    @Step("dasveneba")
    public FirstStep Gotodasveneba(){
        mainPage.dasveneba.hover();
        return this;
    }

    @Step("gartoba")
    public FirstStep Gotogartoba(){
        mainPage.gartoba.click();
        return this;

    }
    @Step("kveba")
    public FirstStep Gotokveba(){
        mainPage.kveba.click();
        return this;

    }

}
