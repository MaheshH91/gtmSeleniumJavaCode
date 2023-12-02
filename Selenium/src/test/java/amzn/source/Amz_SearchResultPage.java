package amzn.source;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amz_SearchResultPage {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchText;
	
	@FindBy(xpath ="//div/div[@class='s-suggestion-container']/div")
	List<WebElement> autosuggestion;
	
	@FindBy(xpath ="//div[@class='a-section aok-relative s-image-tall-aspect']")
	List<WebElement> products;
	
	public void product_search() {
		searchText.sendKeys("Shoes");
		autosuggestion.get(0).click();
	}

	public void firstProductSelect() {
		products.get(0).click();
	}
}

//WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
//Thread.sleep(2000);
//searchText.sendKeys("Shoes");
//Thread.sleep(2000);
//List<WebElement> autosuggestion = driver
//		.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));
//
//autosuggestion.get(0).click();
//
//List<WebElement> products = driver
//		.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
//
//products.get(0).click();
