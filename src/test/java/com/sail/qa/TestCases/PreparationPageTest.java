package com.sail.qa.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sail.qa.base.TestBase;
import com.sail.qa.pages.PreparationPage;
import com.sail.qa.pages.Toaster;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class PreparationPageTest extends TestBase{
	public static Logger log = LogManager.getLogger(PreparationPageTest.class.getName());
	
	
	@Test
	public void verifyPrepPage() throws InterruptedException
	{
		
		PreparationPage pp = new PreparationPage(driver);
		Thread.sleep(2000);
		clickElement(pp.getPrepTab());
		log.info("Admin clicked on Preparation tab");
		getFluentWait();
		String prepText =getText(pp.getPreparationText());
		Assert.assertEquals(prepText, "Preparation");
		String plnText =getText(pp.getPlannedText());
		Assert.assertEquals(plnText, "PLANNED VESSELS");
		getFluentWait();
		System.out.println("The text \"PLANNED VESSELS\" is visible on the page");
		getFluentWait();
		Assert.assertTrue(pp.getActiveBtn().isDisplayed());
		Assert.assertTrue(pp.getArchiveBtn().isDisplayed());
		log.info("Active and Archive button is displaying on Preparation page");
		System.out.println("Active and Archive button is displaying on Preparation page");
		getFluentWait();
		Assert.assertTrue(pp.getNewPrepBtn().isDisplayed());
		System.out.println("New Prepartion button is visible on page");
		log.info("New Prepartion button is visible on page");
		getFluentWait();
		Assert.assertTrue( pp.getInspectionColumn().isDisplayed()&& pp.getStartDate().isDisplayed()
				&& pp.getDueDateColumn().isDisplayed() && pp.getProgressColumn().isDisplayed() && pp.getDueDateColumn().isDisplayed()
				&& pp.getPortColumn().isDisplayed() && pp.getActionColumn().isDisplayed());
		log.info("Vessel , Inspection , Start Date , Progress , Due Date , Port , Action "
				+ "columns are displaying on preparation planned vessel table");
		System.out.println("\"Vessel\" , \"Inspection\" , \"Start Date\" , \"Progress\" , \"Due Date\" , \"Port\" , \"Action\" "
		        + "columns are displaying on preparation planned vessel table");
		Thread.sleep(2000);
		
	}
	/**
	 * @param indexToSelectVessel
	 * @param viqGrp
	 * @throws InterruptedException
	 * @throws TimeoutException
	 */
	@Parameters({"indexToSelectVessel","indexToSelectPort", "viqGroup"})
	@Test
	public void addNewPreparation(int indexToSelectVessel ,int indexToSelectPort, String viqGrp) throws InterruptedException, TimeoutException
	{
		PreparationPage pp = new PreparationPage(driver);
		Toaster toast = new Toaster(driver);
		Thread.sleep(3000);
		
		clickElement(pp.getNewPrepBtn());
		Thread.sleep(3000);
		clickElement(pp.getSelectVesesl());
		log.info("Select Vessel drop down is clicked");
		System.out.println("Select Vessel drop down is clicked");
		getFluentWait();
		clickElement(pp.selectVeseslFromDropdown(indexToSelectVessel));
		log.info("Vessel is selected from drop down");
		System.out.println("Vessel is selected from drop down");
		getFluentWait();
		
		clickElement(pp.getPortDropDown());
		log.info("Port drop drown is clicked");
		System.out.println("Port drop drown is clicked");
		getFluentWait();
		
		clickElement(pp.selectPortFromDropdown(indexToSelectPort));
		log.info("Port is selected from drop down");
		System.out.println("Port is selected from drop down");
		getFluentWait();
		
		clickElement(pp.getCalenderIcon());
		getFluentWait();
		clickElement(selectInspectionDate(pp.getCurrentDate()));
		log.info("Inspection date is entered");
		System.out.println("Inspection date is entered");
		
		getFluentWait();
		clickElement(pp.getViqVersion());
		getFluentWait();
		clickElement(pp.getViq7());
		getFluentWait();
		log.info("VIQ vesrion is selected");
		System.out.println("VIQ vesrion is selected");
		
		getFluentWait();
		
		clickElement(pp.getViqGrp());
		clickElement(pp.selectViqGrp(viqGrp));
		log.info("VIQ group  is selected");
		System.out.println("VIQ group is selected");		
		getFluentWait();
		
		
		Actions actions = new Actions(driver);
        // Press the Escape key
        actions.sendKeys(Keys.ESCAPE).build().perform();	
		System.out.println("VIQ group drop down is closed");
		getFluentWait();
		
		
		
		
		scrollCheckAndClick(pp.getSaveBtn());
		
		
		String toastMsz="Preparation Created Successfully";
		Assert.assertTrue(toast.getToaster().isDisplayed());
		Assert.assertEquals(toastMsz, getText(toast.getToaster()));
		System.out.println(getText(toast.getToaster()) +"is dispakyed");
		System.out.println("New Preapation is saved");
		Thread.sleep(5000);
	
		
/*
		int maxRetries = 3; // Set the maximum number of retries

		for (int attempt = 1; attempt <= maxRetries; attempt++) {
		    clickElement(pp.getNewPrepBtn());
		    // ... perform other actions
		    
		   
		        // Check for the visibility of the element
		        if (pp.getCalenderIcon().isDisplayed()) {
		            
		        	clickElement(pp.getSelectVesesl());
					log.info("Select Vessel drop down is clicked");
					System.out.println("Select Vessel drop down is clicked");
					getFluentWait();
					clickElement(pp.selectVeseslFromDropdown(indexToSelectVessel));
					log.info("Vessel is selected from drop down");
					System.out.println("Vessel is selected from drop down");
					getFluentWait();
					clickElement(pp.getCalenderIcon());
					getFluentWait();
					clickElement(selectInspectionDate(pp.getCurrentDate()));
					log.info("Inspection date is entered");
					System.out.println("Inspection date is entered");
					getFluentWait();
					pp.selectViqGrp(viqGrp);
					log.info("VIQ group  is selected");
					System.out.println("VIQ group is selected");
					getFluentWait();					
					clickElement(pp.getViqVersion());
					getFluentWait();
					clickElement(pp.getViq7());
					getFluentWait();
					log.info("VIQ vesrion is selected");
					System.out.println("VIQ vesrion is selected");
					getFluentWait();
					
					clickElement(pp.getSaveBtn());
					Thread.sleep(2000);
					
		            break; // Exit the loop
		        }
		    
		     else {
		        clickElement(pp.getCloseBtn());
		        Thread.sleep(2000);
		    }			
		}     */
		
	}
	
	@Parameters({"indexofPrepTable"})
	@Test
	public void createdPreparationDetails(int index) throws InterruptedException 
	{
		PreparationPage pp = new PreparationPage(driver);
		Thread.sleep(3000);
		 driver.navigate().refresh();
		 waitUntilElementPresent(pp.getInspectionColumn());
		 clickElement(pp.getStartDate());
		 clickElement(pp.getStartDate());
		 Thread.sleep(2000);
		 		 
	}
	
	
}
