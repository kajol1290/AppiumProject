import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Gestures extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		   TouchAction t = new TouchAction(driver);
		AndroidElement ele = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		
		t.tap(tapOptions().withElement(element(ele))).perform();
		
		 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
			 AndroidElement ele2 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
			 t.longPress(longPressOptions().withElement(element(ele2)).withDuration(ofSeconds(2))).release().perform();
			 
			 System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}

}
