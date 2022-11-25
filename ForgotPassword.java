package com.crm.test;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.crm.base.ExcelReader;
import com.crm.base.Keywords;
public class ForgotPassword {
	@Test
public void ForgotPasswordTest() {
	ArrayList testData = ExcelReader.getTestData("D://test1//forgotpassword.xlsx");
	Keywords Key = new Keywords();
	for (int i = 0; i < testData.size(); i++) {
		if(testData.get(i).equals("open")) {
			Key.open();
		}
		if(testData.get(i).equals("url")) {
      String httpUrl=testData.get(i+1).toString();
      Key.url(httpUrl);
		}
		if(testData.get(i).equals("input")) {
		      String Data=testData.get(i+1).toString();
		      String objectName=testData.get(i+2).toString();
		      Key.input(Data,objectName);
		}
		if(testData.get(i).equals("click")) {
		      String objectName=testData.get(i+2).toString();
		      Key.click(objectName);
		}
		if(testData.get(i).equals("close")) {
		      Key.close();
		}
	}
}
}
