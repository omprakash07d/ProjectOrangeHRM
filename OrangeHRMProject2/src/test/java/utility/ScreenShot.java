package utility;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShot { 

    public static String captureScreenshot(WebDriver driver, String filename) throws IOException {
    	
        // Cast the WebDriver to TakesScreenshot
        TakesScreenshot scrshot = (TakesScreenshot) driver;

        // Capture the screenshot and store it in a temporary file
        File source = scrshot.getScreenshotAs(OutputType.FILE);

        // Define the relative path to the screenshots folder using File.separator for cross-platform compatibility
        String path = System.getProperty("user.dir") +"\\CapturedScreenShot\\"+filename+".png";

        // Define the destination file
        File destination = new File(path);

        // Copy the screenshot to the specified location
        FileHandler.copy(source, destination);
        
		return path;

       
    }
}




/*

 
String path =   
System.getProperty("user.dir")+"\\CapturedScreenshot\\"+filename
 +".png"; 
 
                              project path                             foldername in project             filename.png 
 
 
  File destination = new File(path); 
 
 
  FileHandler.copy(source, destination);

/*

// Cast the driver to TakeScreenshot
   TakesScreenshot scrshot = (TakesScreenshot) driver;
   
// Capture the screenshot and store it in a file
   File source = scrshot.getScreenshotAs(OutputType.FILE);
   
// Specify the destination for the screenshot
// File destination = new File ("D:\\Om_Drive\\Learning Folder\\Eclips\\Screenshot\\"+filename+".jpg");
  
   
// Copy the file to the destination
   
//   FileHandler.copy(source, destination);
   
   
 // Define the relative path to the screenshots folder
   
 String path = System.getProperty("user.dir") + "\\CapturedScreenShot\\" + filename + ".png";
  
 File destination = new File (path);
  
 FileHandler.copy(source, destination);

 */
 

