package firstPackageforSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLaunch {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.close();
	}

}
