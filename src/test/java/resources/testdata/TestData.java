package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData
{
    @DataProvider(name="JobSearch")
    public Object[][] getData()

    {
        Object[][] data= new Object[][]
        {
                {"Tester","Harrow","5 miles","30000","50000","Per annum","Permanent"},
                //,"Permanent Tester jobs in Harrow on the Hill"
                {"Engineer","UK","5 miles","50000","75000","Per month","Contract"},
                //,"Contract Engineer jobs in UK"
               {"Design Manager","London","10 miles","50000","100000","Per annum","Temporary"},
                //,"Temporary Design Manager jobs in London"
                {"Warehouse Operative","London","15 miles","10000","20000","Per day","Apprenticeship"},
                //,"Apprenticeship Warehouse Operative jobs in London"
                {"Shop Manager","Milton Keynes","20 miles","10000","15000","Per week","Part Time"},
                //,"Part Time Shop Manager jobs in Milton Keynes"
                {"Manager","Central London","25 miles","25000","35000","Per month","Part Time"}
                //,"Part Time Manager jobs in Central London"
        };
        return data;
    };

}
