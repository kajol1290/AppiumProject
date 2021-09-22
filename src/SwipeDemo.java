import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		   driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		   driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		   
		    driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		    
		    driver.findElementByXPath("//*[@content-desc='9']").click();
		    
		   AndroidElement srcEle = driver.findElementByXPath("//*[@content-desc='15']");
		   AndroidElement destEle = driver.findElementByXPath("//*[@content-desc='45']");
		   
		   TouchAction t = new TouchAction(driver);
		   
			 t.longPress(longPressOptions().withElement(element(srcEle)).withDuration(ofSeconds(2))).moveTo(element(destEle)).release().perform();
		   
		    
		   
	}

}
