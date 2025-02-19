package com.omrBranch.stepdefinition;


	


	import java.io.FileNotFoundException;
	import java.io.IOException;

import com.omrBranch.BaseClassNew;


	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.Scenario;

	public class HooksClassStep  extends BaseClassNew {

		@Before
		public void beforeScenario() throws FileNotFoundException, IOException {
			browserLaunch(getPropertyFileValue("browser"));
			enterApplnUrl(getPropertyFileValue("url"));
			maximizeWindow();
			implicitWait();

		}

		@After
		public void afterScenario(Scenario scenario) {

			if (scenario.isFailed()) {

				scenario.attach(screenshot(), "images/png", "Every Scenario");
			}
			closeWindow();

		}

	}




