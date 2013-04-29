package org.san.test.integration.pages;

import com.persado.oss.quality.stevia.selenium.core.SteviaContext;
import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas
 * Date: 13-4-29
 * Time: 上午11:44
 * To change this template use File | Settings | File Templates.
 */
@Component
@Lazy
public class TMallHomePage extends WebComponent{

    public void inputSearch(String searchText){
        this.controller().input("mq",searchText);
    }

    public void search(){
        this.controller().click("J_MallSearchBtn");
    }

    public void validateSearchResult(){
        SteviaContext.verify().elementPresent("//a[@title='扫地机']");
        SteviaContext.verify().elementPresent("//div[@class='product']");
    }
    public void randomPickProduct(){
        List<WebElement> productLinks = this.controller().findElements("//a[@class='productImg']");
        System.out.println(productLinks);
        Random rand= new Random(System.currentTimeMillis());
        int index = rand.nextInt(productLinks.size());
        productLinks.get(index).click();
        this.controller().switchToLatestWindow();
        this.controller().waitForElement("J_LinkBuy");
    }
}
