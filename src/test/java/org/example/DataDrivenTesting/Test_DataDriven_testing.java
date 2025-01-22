package org.example.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_DataDriven_testing {

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin@admin.com","pass123"},
                new Object[]{"adamin@admin.com","pass123"}
        };
    }
    @Test(dataProvider = "getData")
    public void loginTest(String email, String password){
        System.out.println(email +"|"+ password);
    }
}
