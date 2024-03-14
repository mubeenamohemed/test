package Maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
		ChromeDriver driver;
		@Test
		public void test()
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
		
}
