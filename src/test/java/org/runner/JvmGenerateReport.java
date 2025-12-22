package org.runner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmGenerateReport {
		
	public static  void generateReport(String path) {
		
		// Step 1 ----> Mension File path 
		File f= new File("src\\test\\resources\\reports\\jvm");
		
		// step-2 Configuration class
		Configuration c= new Configuration(f, "FbAmazon");
		c.addClassifications("Window", "10");
		c.addClassifications("selenium version", "4");
		c.addClassifications("Tester Name-", "ram");

		//Step -3   --->json path
		List<String> l= new LinkedList<>();
		l.add(path);
		
		//Step-4  --->report generate
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
		
		
	}
		
}
