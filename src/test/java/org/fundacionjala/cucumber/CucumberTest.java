package org.fundacionjala.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "classpath:features",
        glue = "org.fundacionjala.cucumber"
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}
