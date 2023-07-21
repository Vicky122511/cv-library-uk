package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility
{
    @CacheLookup

    WebElement jobTitle = driver.findElement(By.xpath("//input[@id='keywords']"));
    //WebElement actionButton = driver.findElement(By.xpath("//button[@id='save']//div[@class='action-wrapper']"));
    WebElement location =driver.findElement(By.xpath("//input[@id='location']"));
    WebElement distanceDropdown = driver.findElement(By.xpath("//select[@id='distance']"));
    WebElement moreSearchOptionLink = driver.findElement(By.xpath("//button[@id='toggle-hp-search']"));
    WebElement salaryMin =driver.findElement(By.xpath("//input[@id='salarymin']"));
    WebElement salaryMax=driver.findElement(By.xpath("//input[@id='salarymax']"));
    WebElement salaryTypeDropdown=driver.findElement(By.xpath("//select[@id='salarytype']"));
    WebElement jobTypeDropdown=driver.findElement(By.xpath("//select[@id='tempperm']"));
    WebElement findJobButton=driver.findElement(By.xpath("//input[@id='hp-search-btn']"));



    public void enterJobTitle(String jobTitle1)
    {
        sendTextToElement(jobTitle,jobTitle1);
        //clickOnElement(actionButton);
    }

    public void enterLocation(String location1)
    {
        sendTextToElement(location,location1);
    }

    public void selectDistance(String distance)
    {
        selectByVisibleTextFromDropDown(distanceDropdown,distance);

    }

    public void clickOnMoreSearchOptionLink()
    {
        clickOnElement(moreSearchOptionLink);
    }

    public void enterMinSalary(String minSalary)
    {
        sendTextToElement(salaryMin,minSalary);
    }

    public void enterMaxSalary(String maxSalary)
    {
        sendTextToElement(salaryMax,maxSalary);
    }

    public void selectSalaryType(String sType)
    {
        selectByVisibleTextFromDropDown(salaryTypeDropdown,sType);
    }

    public void selectJobType(String jobType)
    {
        selectByVisibleTextFromDropDown(jobTypeDropdown,jobType);
    }

    public void clickOnFindJobButton()
    {
        clickOnElement(findJobButton);
    }



}
