package com.sail.qa.TestCases;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportPage;

public class ReportPageTest extends TestBase {
	
	public JavascriptExecutor js ;
	
	
	@Test
	public void VerifyReportTab() throws InterruptedException
	{
		ReportPage report= new ReportPage(driver);
		getFluentWait();
		clickElement(report.getReportTab());
		log.info("Report tab is clicked");
		System.out.println("Report tab is clicked");
		//driver.navigate().refresh();
		//Thread.sleep(3000);
		Assert.assertEquals("TIME PERIOD", getText(report.getTimePeriod()));
		System.out.println(getText(report.getTimePeriod())  + " text is visible on the report page");
		Assert.assertEquals("CONSOLIDATED REPORTS", getText(report.getConsolidateReport()));
		System.out.println(getText(report.getConsolidateReport())  + " text is visible on the report page");
		getFluentWait();		
		Assert.assertTrue(report.getGenerateBtn().isDisplayed());
		log.info("Generate button is visible on the report page");
		System.out.println("Generate button is visible on the report page");
		getFluentWait();
	}
		
		
	

}
