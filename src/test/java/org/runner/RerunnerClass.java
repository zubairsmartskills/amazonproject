package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\rerun\\testrerun.txt",glue ="org.def",dryRun = false,
				plugin = {"json:src\\test\\resources\\reports\\json\\fbamazon.json",
						"rerun:src\\test\\resources\\rerun\\testrerun.txt"})

public class RerunnerClass {
	@AfterClass
	public static void report() {
		JvmGenerateReport.generateReport("src\\test\\resources\\reports\\json\\fbamazon.json");
	}
}
