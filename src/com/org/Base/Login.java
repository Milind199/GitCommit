package com.org.Base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import org.junit.runners.MethodSorters;

import net.sourceforge.htmlunit.corejs.javascript.ast.ErrorCollector;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Login 
{
	@Rule
	public org.junit.rules.ErrorCollector collector=new org.junit.rules.ErrorCollector();
	/*@Before
	public void SetUp()
	{
		System.out.println("Before Login Into System");
	}*/
	
	@BeforeClass
	public static void SetUp()
	{
		System.out.println("Before Login Into System");
		Assume.assumeFalse(false);

	}
	
	@Test(timeout=1000)
	public void LoginUserTest()
	{
		System.out.println("User Login");
		Assert.assertEquals("Both strings are Equal", "Milind", "Milind");
	}
	
	@Test()
	public void Register()
	{
		
		System.out.println("Register USER");	
		int i=3,j=4;	
		try
		{
			Assert.assertEquals(i, j);
		}
		catch(Throwable e)
		{
			//System.out.println("Error Occured");
			collector.addError(e);		
		}
		
		System.out.println("still execution continuued");
			
	}
	
	@AfterClass
	public static void TeareDown()
	{
		System.out.println("After Login Into system");
	}

}
