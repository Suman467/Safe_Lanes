package com.sail.qa.TestCases;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.GeneratedReports.ExternalInspectionReports;
import com.sail.qa.base.TestBase;
import com.sail.qa.pages.GeneratedReport;
import com.sail.qa.pages.ReportFilterPage;
import com.sail.qa.pages.ReportPage;

public class InspectionReportWithFilters extends TestBase {
	
	public JavascriptExecutor js ;
	SwitchTab switchTab = new SwitchTab();
	CloseTab closeTAb= new CloseTab();
	ExternalInspectionReports externalInsp = new ExternalInspectionReports();
	
		
	@Parameters({"currentYear"})
		@Test
		public void GenerateSireReportWithVesselFilter(int currentYear ) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(4000);
			
			System.out.println("\n***************SIRE Inspection Report With Vessels Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			getFluentWait();
			clickElement(filter.getArrowIconInVessel());
			log.info("Vessels filter button has been clicked");
			System.out.println("Vessels filter button has been clicked");
			
			for(int vessel_index =3;vessel_index<6;vessel_index++ ) {
			getFluentWait();
			clickElement(filter.selectFilters(vessel_index));
			System.out.println("Vessel has been selected");
			log.info("Vessel has been selected");
			}
			
						
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Vessel filter drop down is closed");
			log.info("Vessel filter drop down is closed");
						
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
	    @Parameters({"currentYear"})
		@Test
		public void GenerateSireReportWithOwnerFilter(int currentYear ) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(4000);
			
			System.out.println("\n***************SIRE Inspection Report With Owner Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			getFluentWait();
			clickElement(filter.getArrowIconInOwner());
			log.info("Owner filter button has been clicked");
			System.out.println("Owner filter button has been clicked");
			
			for(int owner_index =1;owner_index <3;owner_index++ ) {
			getFluentWait();
			clickElement(filter.selectFilters(owner_index));
			System.out.println("Owner has been selected");
			log.info("Owner has been selected");
			}
			
						
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Owner filter drop down is closed");
			log.info("Owner filter drop down is closed");	
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
		
		@Parameters({"Year", "currentYear"})
		@Test
		public void GenerateSireReportWithVIQChapterFilter(String year , int currentYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(2000);
			
			clickElement(filter.getClearBtn());
			log.info("Clear button is pressed");
			clickElement(filter.getYear());
			clickElement(filter.selectYear(year));
			getFluentWait();
			
			System.out.println("\n***************SIRE Inspection Report With VIQ Chapter Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			Thread.sleep(2000);
			clickElement(filter.getArrowIconInVIQChap());
			log.info("VIQ Chapter filter button has been clicked");
			System.out.println("VIQ Chapter filter button has been clicked");
			
			for(int chapter =1;chapter <5;chapter++ ) {
			getFluentWait();
			clickElement(filter.selectFilters(chapter));
			System.out.println("Chapters have been selected");
			log.info("Chapters have been selected");
			}
			
						
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("VIQ Chapter filter drop down is closed");
			log.info("VIQ Chapter filter drop down is closed");			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
		
		@Parameters({"Location","currentYear"})
		@Test
		public void GenerateSireReportWithLocationFilter(String location, int currentYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(2000);			
			
			System.out.println("\n***************SIRE Inspection Report With VIQ Chapter Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSire());
			
			log.info("SIRE inspection has been selected on the report page");
			System.out.println("SIRE inspection has been selected on the report page");
			
			Thread.sleep(2000);
			clickElement(filter.getArrowIconInLocation());
			log.info("Location filter button has been clicked");
			System.out.println("Location  filter button has been clicked");
			
			
			clickElement(filter.selectLocation(location));
			System.out.println("Location has been selected");	
			log.info("Location has been selected");	
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			log.info(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
		
		@Parameters({"currentYear"})
		@Test
		public void GeneratePscReportWithPscActionFilter(int currentYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(2000);
			
			
			System.out.println("\n***************PSC Inspection Report PSC action Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getPsc());
			
			log.info("PSC inspection has been selected on the report page");
			System.out.println("PSC inspection has been selected on the report page");
			
			Thread.sleep(2000);
			clickElement(filter.getPscActionCheckBox());
			log.info("PSC Action filter button has been clicked");
			System.out.println("PSC Action button has been clicked");			
			
			for(int pscActionIndex =1;pscActionIndex <5;pscActionIndex++ ) {
				getFluentWait();
				clickElement(filter.selectFilters(pscActionIndex));		
				
				}
			System.out.println("PSC Action have been selected");
			
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("PSC Action filter  drop down is closed");
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			externalInsp.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
		
		@Parameters({"Location","currentYear"})
		@Test
		public void GenerateSupdtInspectionReportWithLocationFilter(String location , int currentYear) throws InterruptedException, AWTException {
			
			ReportPage report = new ReportPage(driver);
			ExternalInspectionReports extInspReport= new ExternalInspectionReports();
			GeneratedReport genRep = new GeneratedReport(driver);
			
			ReportFilterPage filter = new ReportFilterPage(driver);
			
			Thread.sleep(2000);
			
			
			System.out.println("\n***************Supdt. Inspection Report Location and Port Filter ***************\n");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();", report.getSupdtInspection());
			
			log.info("Supdt. inspection has been selected on the report page");
			System.out.println("Supdt. inspection has been selected on the report page");
			
			Thread.sleep(2000);
			clickElement(filter.getArrowIconInLocation());
			log.info("Location filter button has been clicked");
			System.out.println("Location  filter button has been clicked");
			
			
			clickElement(filter.selectLocation(location));
			System.out.println("Location has been selected");								
			
			
			clickElement(filter.getArrowIconInPort());
			for(int port =1;port <4;port++ ) {
				getFluentWait();
				clickElement(filter.selectFilters(port));
				System.out.println("Ports have been selected");
				}
			
			Actions actions = new Actions(driver);
	        // Press the Escape key
	        actions.sendKeys(Keys.ESCAPE).build().perform();	
			System.out.println("Port filter  drop down is closed");
			
			Thread.sleep(2000);
			
			clickElement(report.getGenerateBtn());
			log.info("Generate button has been clicked on the report page");
			System.out.println("Generate button has been clicked on the report page");
			getFluentWait();

			switchTab.switchToNewTab();
			
			System.out.println(getText(genRep.getFilterApplied()));
			extInspReport.GeneratedExternalInspectionReport(currentYear);
			
			closeTAb.closeTab();	
			switchTab.switchToOldTab();			

		}
		
		
		}
