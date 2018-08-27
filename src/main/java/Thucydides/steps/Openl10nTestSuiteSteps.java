package Thucydides.steps;



import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Thucydides.pages.BrowserObjectAndCommonMethodPage;
import Thucydides.pages.Openl10nTestSuitePage;
import net.thucydides.core.annotations.Step;

public class Openl10nTestSuiteSteps {
	BrowserObjectAndCommonMethodPage browserObjectAndCommonMethodPage;
	Openl10nTestSuitePage openl10nTestSuitePage;
	private static Logger logger = LoggerFactory.getLogger(Openl10nTestSuiteSteps.class);
	
	@Step
	public void deleteAllCookies() throws Exception{
		System.out.println("No Cookies Deleted!!");
	}
	
	@Step
	public void EnterUnPwd(String username, String password) throws Exception {
		openl10nTestSuitePage.login(username, password);
	}
	
	@Step
	public void ClickSubmitBtn() throws Exception {
		openl10nTestSuitePage.clickSubmit();
	}
	
	@Step
	public void LoginAssertion() throws InterruptedException {
		openl10nTestSuitePage.assertLoginSuccessfully();
		Thread.sleep(3000);
	}
	
	@Step
	public void ClickLogoutBtn() throws Exception {
		openl10nTestSuitePage.ClickLogoutBtn();
	}
	
	@Step
	public void LoginBtnAftOut() throws Exception {
		openl10nTestSuitePage.LoginBtnAftOut();
	}
	
	@Step
	public void SelectPvl() throws Exception {
		openl10nTestSuitePage.SelectPvl();
	}
	
	@Step
	public void UploadBtnClick() throws Exception {
		openl10nTestSuitePage.UploadBtn();
		Thread.sleep(2000);
	}
	
	@Step
	public void RunRisk1Exe() throws Exception {
		//获取到当前工程的根目录
		String CurrPath = System.getProperty("user.dir");
		
		logger.info("Into:  RunRisk1Exe()----------------------------");
		File file = new File(CurrPath+"\\src\\test\\resources\\autoItScript\\Risk01_EmptyZipFile\\PPM_950_fi.exe");
		java.awt.Desktop.getDesktop().open(file);
		Thread.sleep(5000);
		logger.info("Exit:  RunRisk1Exe()----------------------------"+file.getAbsolutePath());
	}
	
	@Step
	public void Risk1Result() throws Exception {
		openl10nTestSuitePage.Risk1ResultAssert();
	}
	
	@Step
	public void RunRisk2Exe() throws Exception {
		//获取到当前工程的根目录
		String CurrPath = System.getProperty("user.dir");
		java.awt.Desktop.getDesktop().open(new File(CurrPath+"\\src\\test\\resources\\autoItScript\\Risk02_DisallowedType\\PPM_950_fi.exe"));
		Thread.sleep(5000);
	}
	
	@Step
	public void TakeAlertShot() throws Exception {
		openl10nTestSuitePage.TakeAlertShot();
	}
	
	@Step
	public void Risk2Result() throws Exception {
		openl10nTestSuitePage.Risk2ResultAssert();
	}

	
}
