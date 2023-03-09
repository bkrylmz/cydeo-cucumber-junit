package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                // determine what type of REPORT we want to generate with our project,
                // and also where we want to store
                "rerun:target/rerun.txt",// rerun için gerekli
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",

        },
        // determine what type of REPORT we want to generate with our project,
        // and also where we want to store

        features = "src/test/resources/features",//we provide the PATH of the features directory
        // and let our project know where to find all of the feature files

        glue = "com/cydeo/step_definitions",//glue gives PATH to the package of the step_definitions

        dryRun = false, //it determines if we want to execute the step_definitions or not.
        // if dryRun is true: dryRun is turned on, and step definitions are turned off(will not run the codes just generate snippets)
        // İf dryRun is false: dryRun is turned off, and step definitions are turned on(will run the all codes)

        tags = "@smoke",
        publish = true// whe I run this it will enable a fuctionality from cucumber to generate
        // a public link for the report of our final execution of our code
        // click to view your cucumber report's below that is on consol>> https:// reports....

        //Tags allow us to create different scenario suites or groups to run
        // (@a or @b ==> if a scenario or feature has either @a or @b, it will be executed) ||
        // (@a and @b ==> the scenario Must have both @a and @b to be able to get executed) &&
        // and not==> if we want to exclude some certain tag we can put (@a or @b and not @c)


)
public class CukesRunner {

}
