import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		  AndroidDriver<AndroidElement> driver = capabilities();
		   
		   driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		   
		 int s = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		 System.out.println("Size is:"+s); 
		 //  System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		System.out.println("Hello World 3");
		 
		 
	}

}
