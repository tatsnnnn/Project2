package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class gartoba {

    public SelenideElement firstelement = $(By.xpath("//*[@id=\"partialid\"]/section/div[1]/div[1]/a/img"));
    public SelenideElement firstphoto = $(By.xpath("//*[@id=\"body\"]/section[1]/div[1]/div/div[1]/a/img"));
    public SelenideElement nextphoto = $(By.xpath("//*[@id=\"lightbox\"]/div[1]/div/div[1]/a[2]"));

}
