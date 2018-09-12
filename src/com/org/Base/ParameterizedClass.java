package com.org.Base;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;


@RunWith(Parameterized.class)
public class ParameterizedClass 
{
	public String username;
	public String password;
	public int pin;
	
	public ParameterizedClass(String username,String password, int pin)
	{
		this.username=username;
		this.password=password;
		this.pin=pin;
	}
	
	@Parameters
	public static Collection<Object[]> getData()
	{
		Object[][]data=new Object[2][3];
		
		data[0][0]="Milind";
		data[0][1]="mitel1";
		data[0][2]=3;
		
		data[1][0]="Anil";
		data[1][1]="Mitel1";
		data[1][2]=4;				
		
		return Arrays.asList(data);
	}
	
	@Test
	public void TestLogin()
	{
		System.out.println("USER : "+username+" password : "+password+" pin : "+pin);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void check()
	{
		Assert.assertTrue("Both number are not Equal", 3>4);
		System.out.println();
	}
	

}
