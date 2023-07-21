package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

public class JobSearchTest extends BaseTest
{
        String actualText,ExpectedText;
        HomePage h1;
        ResultPage r1;

        @BeforeMethod(alwaysRun = true)

        public void inIT()
        {
                h1 = new HomePage();
                r1 = new ResultPage();
        }

        @Test(dataProvider = "JobSearch",dataProviderClass = TestData.class)
        public void verifyJobSearchResultUsingDifferentDataSet(String jTitle,String loc,String dis,String minsal,String maxsal,String salType,String jbType)
        {
           

            h1.enterJobTitle(jTitle);
            h1.enterLocation(loc);
            h1.selectDistance(dis);
            h1.clickOnMoreSearchOptionLink();
            h1.enterMinSalary(minsal);
            h1.enterMaxSalary(maxsal);
            h1.selectSalaryType(salType);
            h1.selectJobType(jbType);
            h1.clickOnFindJobButton();
            //r1.verifyResult(exp);


        }
}
