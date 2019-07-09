package org.kale.corvi.sdk;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Variables_Declaration 
{
	 public int i=0;
	
	 public String folderpath,s,ExcelSavePath;
	 public long second = 1000l;
	 public long minute = 60l * second;
	 public long hour = 60l * minute;
	 public long diff;
	 public SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	 public  String currentdate = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	 public Boolean result;
	 /**
	  * @category Variables of Validate_Elements Class
	  */
	 
	public String StartTime, EndTime, ScreenShotName, ScreenShotPath, ExptResult, ActResult_FALSE, ChkType, Element, ActResult_TRUE,
	Status, ActResult, Duration, Statement_end_word, ActualResult, SC_ID,Description,Id, ExpectedResult, ActualResultTrue,
	ActualResultFalse, filename;
	public int Srno=1,r=1;
		
	/**
	 * @category   Variables of LineNoDetails Page
	 */
	
	public String username,password;
	

	
}
