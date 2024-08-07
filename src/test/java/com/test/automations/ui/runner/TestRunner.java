package com.test.automations.ui.runner;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.core.options.Constants.FEATURES_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.test.automations.ui")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,value = "definitions")
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/resources/tests")
public class TestRunner {
}
