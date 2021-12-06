package com.syntax.seleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationElements {

            public static void main (String[] args) {
/*HW*

 Navigate https:// parabank.parasoft.com/parabank/register.htm;

 https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22

 Fill out the form

 Click on register

 Close the browser

 */

                System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
                WebDriver driver =new ChromeDriver();
                driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
                driver.findElement(By.name("customer.firstName")).sendKeys("Eleni");
                driver.findElement(By.name("customer.lastname")).sendKeys("Kand");
                driver.findElement(By.id("customer.address.street")).sendKeys("Queens");
                driver.findElement(By.id("customer.address.city")).sendKeys("Rego Park ");
                driver.findElement(By.name("customer.address.state")).sendKeys("NYC ");
                driver.findElement(By.id("customer.phoneNumber")).sendKeys("718_756_6709");
                driver.findElement(By.id("customer.ssn")).sendKeys("200_45_4478");

                driver.findElement(By.name("customer.username")).sendKeys("Eleni");
                driver.findElement(By.id("customer.password")).sendKeys("Great@12345");
                driver.findElement(By.id("repeatedPassword")).sendKeys("Great@12345");
                driver.findElement(By.className("button")).click();
                driver.close();




    }

}
