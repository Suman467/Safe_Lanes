package com.sail.qa.TestCases;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.NavigationAuditReport;
import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.GeneratedReports.InternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportPage;

public class InternalInspectionReport extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	InternalInspectionReports intrnlInsRep = new InternalInspectionReports();
		
	    @Parameters({"pageEndIndex"})
		@Test
		public void GenerateNavigationAuditReport(int pageEndIndex) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************Navigation Audit Inspection Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getNavAudit());

			log.info("Navigation audit inspection has been selected on the report page");
			System.out.println("Navigation audit inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			switchTab.switchToNewTab();
			
			intrnlInsRep.GenerateInternalInspectionReport(pageEndIndex);

			

		}
		
	    @Parameters({"pageEndIndex"})
		@Test
		public void GenerateSupdtInspectionReport(@Optional int pageEndIndex) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			driver.navigate().refresh();
			getFluentWait();
			clickElement(report.getRefreshIcon());
			getFluentWait();
			System.out.println("\n***************Supdt.Inspection Report***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSupdtInspection());

			log.info("Supdt. Inspection has been selected on the report page");
			System.out.println("Supdt. Inspection has been selected on the report page");
			Thread.sleep(2000);
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();
			
			switchTab.switchToNewTab();

			intrnlInsRep.GenerateInternalInspectionReport(pageEndIndex);
			closeTAb.closeTab();	
			switchTab.switchToOldTab();		
			getFluentWait();
			

		}
		
		
	}
