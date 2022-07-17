package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public SelenideElement dasveneba = $(withText("დასვენება"));
    public SelenideElement gartoba = $(withText("გართობა"));
    public SelenideElement kveba = $(withText("კვება"));
}
