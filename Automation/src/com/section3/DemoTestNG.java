package com.section3;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {
	@BeforeSuite
	public void openServer()
	{
		System.out.println("open server connection");
	}
	@BeforeTest
	public void openDataBase()
	{
		System.out.println("open DataBase");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the browser");
	}
	@BeforeMethod
	public void loginApp()
	{
		System.out.println("login the app");
	}
	@Test
	public void customerCreation()
	{
		System.out.println("customer created");
	}
	@Test
	public void modifyUser()
	{
		System.out.println("customer modified");
	}
	@AfterMethod
	public void logoutApp()
	{
		System.out.println("logout the app");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	@AfterTest
	public void closeDB()
	{
		System.out.println("close the db");
	}
	@AfterSuite
	public void closeServer()
	{
		System.out.println("close the server");
		Reporter.log("ServerClosed",true);
	}
	
		
		
		



}
