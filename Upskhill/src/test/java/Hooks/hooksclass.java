package Hooks;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import VinayKumar.TestComponents.Base_Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksclass {
	
	WebDriver driver;
	
	Base_Test base=new Base_Test();
	
	
	@Before
	public void init() throws IOException {
		driver=base.initializer();
		
	}

	public void takeScraenshotOnFailure(Scenario scenario) {

		if (scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "/Upskhill/test-output/image/png", "screenshot");
		}

		}
	
	
	
	@After
	public void close() {
		driver.close();
	}
}
