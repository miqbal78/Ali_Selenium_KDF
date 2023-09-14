package com.kdd.config;

public interface GlobalVariables {

	String baseDirectory = System.getProperty("user.dir");
	String configPath = baseDirectory+"/config.properties";

	// Application URL
	//String baseURL = "https://ebay.com/";
	String baseURL = "https://www.techlistic.com/p/selenium-practice-form.html?m=1";

	// Path to test data sheet with test cases to run and test case details
	String testDataPath = baseDirectory+"/src/test/resources/data/TestDataSheet.xlsx";
	String testDataSheet = "TestCases";
	int testCaseColumn = 0;
	int testCaseDescriptionColumn = 1;
	int runModeColumn = 2;
	int resultColumn = 3;

	// Columns in Test Case sheet
	int testStepsColumn = 0;
	int testStepDescriptionColumn = 1;
	int keywordColumn = 2;
	int dataColumn = 3;	

	String PASS = "PASS";
	String FAIL = "FAIL";
	String SKIP = "SKIP";

	// Wait times
	int implicitWaitTime = 10;
	long objectWaitTime = 30;

	// Screenshot folder and file details
	String screenshotFolder = baseDirectory+"/screenshots/";
	String fileFormat = ".png";
	
	// Report related details 
	String extentConfigFilePath = baseDirectory+"/extent-config.xml";
	String htmlReportPath = baseDirectory+"/target/html-report/";
	String htmlReportFile = baseDirectory+"/target/html-report/index.html";
	String htmlFileName = "index.html";
}
