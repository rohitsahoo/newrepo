package com.crm.comcast.OrgTest;

import org.testng.annotations.Test;


public class CreateOrgTest 
{
	@Test(groups="smokeTest")
	public void createOrgTest()
	{		
		System.out.println("Created Org successfully!!!");
	}
	
	
	@Test(groups="regressionTest")
	public void modifyContactTest()
	{
		System.out.println("Modified Contact successfully");
	}
}
