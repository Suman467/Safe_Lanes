package com.sail.qa.GeneratedReports;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class ExternalInspectionReports extends TestBase {
	
	public JavascriptExecutor js ;
		
	   
		public void GeneratedExternalInspectionReport() throws InterruptedException, AWTException {
			
			GeneratedReport genRep = new GeneratedReport(driver);
			
			Thread.sleep(2000);
			
			if(getText(genRep.getReportText()).equals("SIRE INSPECTION - 2023")) {
			
			Assert.assertEquals(getText(genRep.getReportText()), "SIRE INSPECTION - 2023");
			System.out.println("Report Name : - " +getText(genRep.getReportText()));
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getYearly());
			System.out.println("Yearly graph is visible on report");
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getQuartly());
			System.out.println("Quartly graph is visible on report");
			getFluentWait();
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrp());
			System.out.println("Fleet group analysis graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getAdditionalGrp());
			System.out.println("Additional group  graph is visible on report");
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOwner());
			System.out.println("Owner  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getVessels());
			System.out.println("Vessels graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOilMajor());
			System.out.println("Oil Major group  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspVsObs());
			System.out.println("InsVsObs graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspByShip());
			System.out.println("Inspections By Ship Type group  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getChapter());
			System.out.println("VIQ Chapter -VIQ7 graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getTop20RepetaedObs());
			System.out.println("Top 20 Repeated Observations graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInitialRisk());
			System.out.println("Initial Risk graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFinalRisk());
			System.out.println("Final Risk graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getCompanyBenchmarkYearly());
			System.out.println("Company Benchmark graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getChapBenchmark());
			System.out.println("VIQ Chapter Benchmark graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrpBenchmark());
			System.out.println("Fleet Group Benchmark graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspectionSummary());
			System.out.println("Inspection Summary is visible on report");
			

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getListOfInspection());
			System.out.println("Inspections list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTable());
			System.out.println("Plan Table is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspPerformanceTop20RepeatedObs());
			System.out.println("Inspections Performace Top 20 Repeated Observation list is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspPerformanceHighRiskObs());
			System.out.println("Inspections Performace High Risk Observation list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFlaggedObs());
			System.out.println("Inspections Performace Flagged Observation list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspPerformanceAllObss());
			System.out.println("Inspections performance - All Observation with comment list is visible on report");
			
			getFluentWait();

			//js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].scrollIntoView(true);", filter.getPageEnd());				
		   System.out.println("SIRE Report for 2023 has been generated successfully");
		   	

		}
		
		
		
		else if(getText(genRep.getReportText()).equals("PSC INSPECTION - 2023")) {
			
			
			
			Assert.assertEquals(getText(genRep.getReportText()), "PSC INSPECTION - 2023");
			System.out.println("Report Name : - " +getText(genRep.getReportText()));
			getFluentWait();
			
			
			
			js = (JavascriptExecutor) driver;			 
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getYearly());
			System.out.println("Yearly graph is visible on report");
			getFluentWait();
						
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getQuartly());
			System.out.println("Quartly graph is visible on report");
			getFluentWait();
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getFleetGrp());
			System.out.println("Fleet group analysis graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getAdditionalGrp());
			System.out.println("Additional group  graph is visible on report");
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getOwner());
			System.out.println("Owner  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getVessels());
			System.out.println("Vessels graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspVsObs());
			System.out.println("InsVsObs graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getMou());
			System.out.println("PSC MOU graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspByShip());
			System.out.println("Inspections By Ship Type group  graph is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscDeficiencyCat());
			System.out.println("Deficiency Category  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscAction());
			System.out.println("PSC action code group  graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getDeficiencyCode());
			System.out.println("Deficiency Code graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getImmediateCause());
			System.out.println("Immediate Causes graph is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getRootCause());
			System.out.println("Root Causes graph is visible on report");			
			
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getCompanyBenchmarkYearly());
			System.out.println("Company Benchmark graph is visible on report");
			
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspectionSummary());
			System.out.println("Inspection Summary is visible on report");
			

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getListOfInspection());
			System.out.println("Inspections list is visible on report");
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPlanTable());
			System.out.println("Plan Table is visible on report");
			
			
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getInspPerformanceTop20RepeatedObs());
			System.out.println("CDI INSPECTION Performance - Top 20 Repeated Observation list is visible on report");
			getFluentWait();

			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", genRep.getPscPageEnd());				
		   System.out.println("PSC Report for 2023 has been generated successfully");
		   			

		}
		}
		
		
		
		}
