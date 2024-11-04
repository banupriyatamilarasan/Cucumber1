package com.omrBranch.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrBranch.BaseClassNew;
import com.omrBranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


	@RunWith(Cucumber.class)
	@CucumberOptions(tags="@Cancel",stepNotifications = true, publish=true, monochrome = true,   snippets = SnippetType.CAMELCASE, dryRun=false,plugin = {"pretty", "json:target//output.json","json:target//output.html"},glue="com.omrBranch.stepdefinition",features="src\\test\\resources")
	public class RunnerClass extends BaseClassNew {
		@AfterClass
		public static void afterClass() {
			 Reporting.generateJVMReport(getProjectPath()+"\\target\\output.json");

		}
	}

