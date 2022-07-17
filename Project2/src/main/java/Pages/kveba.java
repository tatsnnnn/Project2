package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class kveba {

    public SelenideElement firstelement = $(By.xpath("//*[@id=\"partialid\"]/section/div[1]/div[1]/a/img"));
    public SelenideElement increasecount = $(".amount-box-button amount-box-add");
    public SelenideElement price = $(By.xpath("//*[@id=\"body\"]/section[1]/div[2]/div/div[2]/div/div[1]/div[1]/h1"));
    public SelenideElement kidvabutt = $(".checkout__button");
    public SelenideElement totalcount = $(By.id("product-amount"));
    public SelenideElement totalprice = $(".details-voucher-price");
    public SelenideElement totalcountafteradd = $(By.name("quantity"));
    public SelenideElement totalpriceafteradd = $(By.id("item-sum-1032596"));
    public SelenideElement kidvabuttafteradd = $(".totals__button");

}







