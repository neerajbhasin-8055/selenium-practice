package org.example;

import org.openqa.selenium.WebDriver;

public class start {
    String url ;
    WebDriver driver;
    start(WebDriver driver, String url){
        this.url = url;
        this.driver = driver;
    }
    public void openWebPage(){
        driver.get(url);
    }
    public String getTitleOf(){
        return driver.getTitle();
    }
}
