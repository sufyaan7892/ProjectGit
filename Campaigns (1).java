package com.autodeskcom.objectrepositoryLib;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.autodeskcom.genericLib.WebdriverCommonLib;

public class Campaigns {
	public WebdriverCommonLib webLib = new WebdriverCommonLib();
	
	@FindBy(xpath="//img[@alt='Create Campaign...']")
	private WebElement createCampaignsBtn;
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[*]/td[2]")
	private List<WebElement> displayAllCampaigns;
	
	@FindBy(xpath="//a[text()='Go to Advanced Search']")
	private WebElement advancedSearchBtn;
	
	@FindBy(xpath="//select[@class='detailedViewTextBox']")
	private WebElement dropdownCamp;
	
	@FindBy(xpath="//select[@class='repBox']")
	private WebElement dropdown2Equal;
	
	@FindBy(xpath="//input[@id='fval0']")
	private WebElement CampIDEdt;
	
	@FindBy(xpath="//table[@class='searchUIAdv3 small']/tbody/tr/td/input")
	private WebElement searchNowBtn;
	
	@FindBy(xpath="//a[text()='edit']")
	private WebElement editBtn;
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[*]/td[3]")
	private WebElement campName;
	
	
	

	public void clickOncreateCampaignsBtn(){
		createCampaignsBtn.click();
	}
	
	public void clickOnadvancedSearchBtn(){
		advancedSearchBtn.click();
	}
	
	public void clickOnsearchNowBtn(String campId){
		webLib.select(dropdownCamp, "Campaign No");
		webLib.select(dropdown2Equal, "equals");
		CampIDEdt.sendKeys(campId);
		searchNowBtn.click();
		
	}
	public void clickOneditBtn(){
		editBtn.click();
	}
	
	public List<WebElement> getDisplayAllCampaigns() {
		return displayAllCampaigns;
	}
	
	public WebElement getCampName() {
		return campName;
	}
	

}
