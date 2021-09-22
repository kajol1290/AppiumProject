import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HandlingDropDown extends Base{

	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
// Android Spinner or Drop down Menu with multiple options
		
		AndroidDriver<AndroidElement> driver = capabilities();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		   TouchAction t = new TouchAction(driver);
		   
driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"));");

 driver.findElementByXPath("//android.widget.TextView[@text='Spinner']").click();
 
driver.findElementById("io.appium.android.apis:id/spinner1").click();
List<AndroidElement> options = driver.findElementsByClassName("android.widget.CheckedTextView");


for( AndroidElement s: options)
{
	 String str = s.getText();
	 
	 if(str.equalsIgnoreCase("green"))
	 {
		 s.click();
		 break;
	 }
}

	}

}
