package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int generateRandomNo(int boundaryNumber) {
		Random rnd = new Random();
		int generateNo = rnd.nextInt(boundaryNumber);
		return generateNo;
		
	}
	
	public void selectFromDropdown(WebElement selectElement, String visibleText) {
		Select sel = new Select(selectElement);
		sel.selectByVisibleText(visibleText);
		
	}

}
