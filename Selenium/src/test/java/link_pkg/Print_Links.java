package link_pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Links {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		List<WebElement> links1 = driver.findElements(By.tagName("a"));

		int totalCount = links1.size();
		System.out.println(totalCount);
//		for (WebElement ele : links1) {
//			System.out.println(ele.getAttribute("href"));
//		}
		for(int i=0;i<totalCount-1;i++) {
			WebElement linkUrl = links1.get(i);
			String urlis = linkUrl.getAttribute("href");
			System.out.println(urlis);
		}
	}

}
