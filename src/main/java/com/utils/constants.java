package com.utils;

public class constants {
	private String propertyFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
	private String excellFilePath=System.getProperty("user.dir")+"/src/test/resources/sauceLabsData.xlsx";
	
	 public String getPropertyFilePath() {
		  return propertyFilePath;
	   }
	 public String getExcellFilePath() {
		 return excellFilePath;
	 }
}
