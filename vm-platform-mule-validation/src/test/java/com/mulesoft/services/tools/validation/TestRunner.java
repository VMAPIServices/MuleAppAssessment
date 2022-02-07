package com.mulesoft.services.tools.validation;

import java.io.File;


public class TestRunner {
	//private String testPath = "src/test/resources/mule4";
	private String testPath = "C:/workspce/test-mule-app/src/main/mule";
	private String resultPath = "C:/Anupam/Software/mule-sonarqube-plugin-master/src/test/resources/result.csv";
	public static void main(String[] args) {
		
	
		TestRunner runner =new TestRunner();
		runner.runTest();
	}
	
	public void runTest() {
		
		try {
			System.out.println("---------------------Test Start-----------------------");
			Validator val = new Validator(Constants.Ruleset.MULE4);
			//	String testDirectory = System.getProperty("user.dir") + File.separator + testPath;
			String testDirectory = testPath;
			System.out.println("Working Directory = " + System.getProperty("user.dir"));
			val.validate(new File(testDirectory),resultPath);
			System.out.println("---------------------Test END-----------------------");
		}catch(Exception exp) {
				System.out.println("problem in runtest======="+exp.getMessage());
			}
	}
	

}
