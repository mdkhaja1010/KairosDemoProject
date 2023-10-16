package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	constants constantutility=new constants();
	FileInputStream fis;
	Properties pro;
	
	public PropertyFile() {
	File f=new File(constantutility.getPropertyFilePath());
	try
	{
		fis = new FileInputStream(f);
		pro = new Properties();
		pro.load(fis);
	}catch(Exception e)
	{
		System.out.println("Exception is " + e.getMessage());
	}

	}
	
	public String getApplicationUrl() {
		String url = pro.getProperty("Url");
		return url;
	}

	
	public String getApplicationUserName() {
		String username = pro.getProperty("Username");
		return username;
	}

	public String getApplicationPassword() {
		String password = pro.getProperty("Password");
		return password;
	}

public String getApplicationBrowser() {
	String browser=pro.getProperty("Browser");
	return browser;
}
}
