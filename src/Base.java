import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		// TODO Auto-generated method stub

		File appDir = new File("src");
		File app = new File(appDir,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyDevice_1");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//umtil here app will be deployed and invoked in your Virtual device.
		//Make sure that emulator is open and ready to receive your commands
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

}
