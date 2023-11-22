package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.ReportPage;

public class ExternalInspectionReport extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	ExternalInspectionReports extReport= new ExternalInspectionReports();
		
		
		@Test
		public void GenerateSireReport() throws InterruptedException, AWTException {
			ReportPage report = new ReportPage(driver);
			
			
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************SIRE Inspection Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			// jsExecutor.executeScript("arguments[0].click();",
			// report.selectInspection(inspec_index));

			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
					
			extReport.GeneratedExternalInspectionReport();
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

		}
		
		
		
		@Test
		public void GeneratePSCReport() throws InterruptedException, AWTException {
			
			
			ReportPage report = new ReportPage(driver);
			
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n\n***************PSC Inspection Report***************\n\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getPsc());
			

			log.info("PSC inspection has been selected on the report page");
			System.out.println("PSC inspection has been selected on the report page");
			Thread.sleep(3000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			
			switchTab.switchToNewTab();
			
			extReport.GeneratedExternalInspectionReport();
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();

			

		}

}
