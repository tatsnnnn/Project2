package Steps;
import Pages.MainPage;
import Pages.dasveneba;
import Steps.FirstStep;
import io.qameta.allure.Step;

public class SecondStep {
    dasveneba mainPage = new dasveneba();

    @Step("gotozgvispireti")
    public SecondStep gotozgvispireti(){
        mainPage.zgvispireti.click();
        return this;

    }
    @Step("setminprice")
    public SecondStep setminprice(){
        mainPage.minprice.setValue("0");
        return this;

    }
    @Step("setmaxprice")
    public SecondStep setmaxprice(){
        mainPage.maxprice.setValue("100");

        return this;
    }
}
