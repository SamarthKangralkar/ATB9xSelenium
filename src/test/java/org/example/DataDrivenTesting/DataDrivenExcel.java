package org.example.DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenExcel {

@Test(dataProvider = "getData", dataProviderClass = UtilExcel.class)
    public void test_VWoLogin(String email, String password){
        System.out.println("Email"+email);
        System.out.println("Password"+password);
    }
}
