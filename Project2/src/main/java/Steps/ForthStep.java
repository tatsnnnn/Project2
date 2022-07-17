package Steps;
import Pages.kveba;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class ForthStep {
    kveba mainPage = new kveba();
    @Step("firstelement")
    public ForthStep firstelement(){
        mainPage.firstelement.click();
        return this;

    }
    @Step("increasecount")
    public ForthStep increasecount(){
        mainPage.increasecount.click();
        return this;

    }
    @Step("checktotalamount")
    public ForthStep checktotalamount(){
        StringBuffer stringbuffer = new StringBuffer(price);

        stringbuffer.deleteCharAt(price.length()-1);
        float price = Float.parseFloat(stringbuffer.toString());
        int totalcount = Integer.parseInt(kveba.totalcount.getText());
        int totalCount = (int) (price*totalcount);
        kveba.totalprice.shouldHave(Condition.text(String.valueOf(totalCount)));
        return this;

    }
    @Step("clickonyidva")
    public ForthStep clickonyidva(){
        mainPage.kidvabutt.scrollTo().click();
        return this;

    }
    @Step("checktotalquantity")
    public ForthStep checktotalquantity(){
        kveba.totalcountafteradd.shouldHave(Condition.text(kveba.totalcount.getText()));
        return this;

    }
    @Step("checktotalprice")
    public ForthStep checktotalprice(){
        StringBuffer stringbuffer = new StringBuffer(price);

        stringbuffer.deleteCharAt(price.length()-1);
        float price = Float.parseFloat(stringbuffer.toString());
        int totalcount = Integer.parseInt(kveba.totalcount.getText());
        int totalCount = (int) (price*totalcount);
        kveba.totalpriceafteradd.shouldHave(Condition.text(String.valueOf(totalCount)));
        return this;

    }
    @Step("clickbuttyidva")
    public ForthStep clickbuttyidva(){
        mainPage.kidvabuttafteradd.scrollTo().click();
        return this;
        
    }
}
