package org.san.test.integration.cases;


import com.persado.oss.quality.stevia.spring.SteviaTestBase;
import org.san.test.integration.pages.TMallHomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas
 * Date: 13-4-29
 * Time: 上午11:51
 * To change this template use File | Settings | File Templates.
 */

public class TMallHomeTest extends SteviaTestBase{
    @Autowired
    TMallHomePage tMallHome;
    @Test

    public void testSpringAutoWire(){
        tMallHome.inputSearch("扫地机器人");
        tMallHome.search();
        tMallHome.validateSearchResult();
        tMallHome.randomPickProduct();
    }
}
