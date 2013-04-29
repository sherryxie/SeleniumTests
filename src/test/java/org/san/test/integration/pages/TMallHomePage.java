package org.san.test.integration.pages;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas
 * Date: 13-4-29
 * Time: 上午11:44
 * To change this template use File | Settings | File Templates.
 */
@Component
@Lazy
public class TMallHomePage {
    public TMallHomePage(){
        System.out.println("TMALL Home!!!!!!!!!!!!!!!!!!!!");
    }
    public void helloWorld(){
        System.out.println("Hello From TMall!");
    }
}
