package org.san.test.integration.cases;


import com.persado.oss.quality.stevia.spring.SteviaTestBase;
import org.san.test.integration.pages.TMallHomePage;
import org.san.test.integration.pages.TMallSearchResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas
 * Date: 13-4-29
 * Time: 上午11:51
 * To change this template use File | Settings | File Templates.
 */

public class TMallSearchTest extends SteviaTestBase{
    @Autowired
    TMallHomePage tMallHomePage;
    @Autowired
    TMallSearchResultPage tMallSearch;

    @Test

    public void testSpringAutoWire(){
        tMallHomePage.inputSearch("扫地机器人");
        tMallHomePage.search();
        tMallSearch.validateSearchResult();
        tMallSearch.randomPickProduct();
    }
}
