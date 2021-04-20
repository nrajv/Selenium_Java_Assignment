package PageLocators;

import org.openqa.selenium.By;

public interface PageLoc {
    public By SearchBox = By.name("q");
    public By SearchButton = By.name("btnK");
    public By CurrentShare = By.xpath("//span[@class='IsqQVc NprOob XcVN5d wT3VGc']");
    public By High = By.xpath("(//td[@class='iyjjgb'])[8]");
    public By Low = By.xpath("(//td[@class='iyjjgb'])[9]");
}