package extendlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator ()
	
	{
		
		// Specify the report file path
		String path = System.getProperty("user.dir")+"//reports//orangehrmreport.html";
		
		// ExtentHtmlReporter report = new ExtentHtmlReporter (path);
		
		
        // Use ExtentSparkReporter instead of ExtentHtmlReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path);

        
        sparkReporter.config().setReportName("OrangehrmTestReport");  
        
        sparkReporter.config().setTheme(Theme.STANDARD);
        
        // Attach the reporter to ExtentReports
        extent = new ExtentReports();
        
        extent.attachReporter(sparkReporter);

		extent.setSystemInfo("OS", "Windows");
		
		extent.setSystemInfo ("Organizaiton name", "XpertTech");
		
		extent.setSystemInfo ("Executed by","Omprakash");
		
		return extent;
		
        
		
		
	}
	
	
	
	
	
	
	
	

}
