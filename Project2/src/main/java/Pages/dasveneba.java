package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class dasveneba {
    public SelenideElement zgvispireti = $(withText("ზღვისპირეთი"));
    public SelenideElement minprice = $(byId("minprice"));
    public SelenideElement maxprice = $(byId("maxprice"));

}
