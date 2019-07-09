package org.kale.corvi.Test_Cases_Modules;

import org.kale.corvi.TestDataReaders.TestDataCollection;
import org.kale.corvi.TestDataReaders.TestDataReader;
import org.kale.corvi.TestDataReaders.TestDataReaderFactory;
import org.kale.corvi.pages.LoginPage;
import org.kale.corvi.pages.Sales_Target_Page;
import org.kale.corvi.sdk.BaseClass;
import org.kale.corvi.sdk.Variables_Declaration;
import org.kale.corvi.utils.WriteExcel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sales_Target extends BaseClass
{
	Variables_Declaration vd=new Variables_Declaration();
	WriteExcel rw = new WriteExcel();
	LoginPage lp=new LoginPage(driver);
	
	@BeforeClass
	public void ReadData_UserDetails() throws Exception
	{
		TestDataReader tdr=TestDataReaderFactory.getInstance().open("test_data\\user-accounts.yml");
		TestDataCollection tdc=tdr.getCollection("login_cfsuser");
		vd.username=tdc.getString("user_id");
		vd.password=tdc.getString("password");
	}
	
	@Test	
	public void Login() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		Sales_Target_Page STP=new Sales_Target_Page(driver);
		
	//	lp.login(vd.username, vd.password);
		lp.login(vd.username, vd.password);
		
		
		STP.Create_SalesTarget();
		
		
	}
}
