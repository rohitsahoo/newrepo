package com.crm.comcast.LeadTest;

import org.testng.annotations.Test;

public class CreateNewLeadTest 
{
	@Test(groups="smokeTest")
	public void createNewLeadTest()
	{
		System.out.println("Created New Lead Test Successfully");
	}
	
	@Test(groups="regressionTest")
	public void createNewLeadWithIndustryTest()
	{
		System.out.println("Created New Lead With Industry Successfully");
	}


}
