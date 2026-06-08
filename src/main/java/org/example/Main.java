package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com";
        start open = new start(driver,url);
        open.openWebPage();
        String title = open.getTitleOf();
        System.out.print("Title: "+title);
        Thread.sleep(3000);
        driver.quit();
    }
}
