package com.extentreport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("report.html").viewConfigurer().viewOrder()
				.as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY }).apply();
		extent.attachReporter(spark);

		spark.config().setDocumentTitle("org.preetham");
		spark.config().setReportName("selenium report");
		spark.config().setTheme(Theme.DARK);

		ExtentTest test = extent.createTest("google search").assignAuthor("khaja ts").assignCategory("sanity");
		test.info("browser opened");
		test.info("detailes enter");
		test.pass("test is passed");

		ExtentTest test1 = extent.createTest("youtube seach").assignAuthor("sameer").assignCategory("regression");
		test1.info("browser opened");
		test1.info("detailes enter");
		test1.fail("test is passed");

		extent.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
