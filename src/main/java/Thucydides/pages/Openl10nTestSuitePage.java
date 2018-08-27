package Thucydides.pages;

import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

public class Openl10nTestSuitePage extends PageObject {
	
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;

	public void login(String username, String password) {

		WebElement usernameInput = find(By.id("username"));
		WebElement passwordInput = find(By.id("password"));
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(password);

	}

	public void clickSubmit() throws Exception {
		find(By.id("submit")).click();
		Thread.sleep(5000);
	}

	public void assertLoginSuccessfully() {
		getDriver().getCurrentUrl().contains("translation");
	}
	
	public void ClickLogoutBtn() throws Exception {
		browserObjectAndCommonMethodPage.ClickLogoutBtn();
	}
	
	public void LoginBtnAftOut() throws Exception {
		browserObjectAndCommonMethodPage.LoginBtnAftOut();
	}
	
	
	public void SelectPvl() throws Exception {
		browserObjectAndCommonMethodPage.SelectPvl();
	}
	
	
	public void UploadBtn(){
		find(By.xpath("/html/body/app-root/div/app-applications/div/div/mf-translation/div/div/div[2]/div/button[2]")).click();
	}
	
	public void Risk1ResultAssert() {
		browserObjectAndCommonMethodPage.EmptyAssert();
	}

	public void Risk2ResultAssert() throws Exception {
		browserObjectAndCommonMethodPage.Risk2ResultAssert();
	}

	public void TakeAlertShot() throws Exception {
		browserObjectAndCommonMethodPage.TakeAlertShot();
	}

}
