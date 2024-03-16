package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/CucumberFeatures/Create_course.feature", glue={"CucumberDefinitions","Hooks"},
monochrome=true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {





}