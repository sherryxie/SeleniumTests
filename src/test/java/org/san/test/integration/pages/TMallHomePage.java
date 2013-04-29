package org.san.test.integration.pages;

import com.persado.oss.quality.stevia.selenium.core.SteviaContext;
import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas
 * Date: 13-4-29
 * Time: 上午11:44
 * To change this template use File | Settings | File Templates.
 */

public class TMallHomePage extends WebComponent{

    private String searchInputLocator;
    private String searchButtonLocator;

    public String getSearchInputLocator() {
        return searchInputLocator;
    }

    public void setSearchInputLocator(String searchInputLocator) {
        this.searchInputLocator = searchInputLocator;
    }

    public String getSearchButtonLocator() {
        return searchButtonLocator;
    }

    public void setSearchButtonLocator(String searchButtonLocator) {
        this.searchButtonLocator = searchButtonLocator;
    }

    public void inputSearch(String searchText){
        this.controller().input(searchInputLocator,searchText);
    }

    public void search(){
        this.controller().click(searchButtonLocator);
    }
}
