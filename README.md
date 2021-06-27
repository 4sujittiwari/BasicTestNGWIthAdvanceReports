# BasicTestNGWIthAdvanceReports


## Running Locally

Go to your project directory and run below commands

    mvn clean install -DskipTests

And then run

    mvn clean test -Dheadless=true

If you want to run in headless mode just give **-Dheadless=true** or give it **false**

## Reports

By default reports are generated to ***target/cucumber***. But if you want a different location just go the  TestRunner.java and change below line

    me.jvt.cucumber.report.PrettyReports:target/cucumber


## Jenkins

Follow the below process to create Jenkins Job 

<img src="/jenkins/1.png" alt="pipeline_job"/>


<img src="/jenkins/2.png" alt="Pipleline_script_from_scm"/>
