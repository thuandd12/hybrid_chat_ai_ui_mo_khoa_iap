package ikame.chatai.testsuite;

import static ikame.chatai.common.TestLogger.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.chatai.common.Management_Account;
import ikame.chatai.common.commonBase;
import ikame.chatai.ui.PageUI_ChatAI;

public final class TS_02_Chat_AI_Setting extends commonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("ChatAI.apk", "emulator-5554", "Android", "12.0", "com.begamob.chatgpt_openai",
				"com.begamob.chatgpt_openai.feature.splash.SplashActivity", "windows", "8201");
		managementAccount = new Management_Account(driver);
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}
	
	@Test
	public void TC_001_Check_AllLink_Setting() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		getElementPresent(PageUI_ChatAI.IMG_MEMBER_CLASS);
		getElementPresent(PageUI_ChatAI.TEXT_YOU_ARE_VIP);
		getElementPresent(PageUI_ChatAI.TEXT_ENJOY_UNLIMITED);
		getElementPresent(PageUI_ChatAI.TAB_WIDGET);
		getElementPresent(PageUI_ChatAI.TAB_BUBBLE_CHAT);
		getElementPresent(PageUI_ChatAI.TAB_RESTORE_PERCHASE);
		getElementPresent(PageUI_ChatAI.TAB_ABOUT_US);
		getElementPresent(PageUI_ChatAI.TAB_PRIVACY_POLICY);
		getElementPresent(PageUI_ChatAI.TAB_TERM_OF_USE);
		getElementPresent(PageUI_ChatAI.TAB_LANGUAGE);
		getElementPresent(PageUI_ChatAI.TAB_CONTACTS_SUPPORT);
		getElementPresent(PageUI_ChatAI.TAB_SEND_FEEDBACK);
		captureScreen(driver, "Setting");
	}
	@Test
	public void TC_002_Check_AllLink_Setting_Widget() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_WIDGET);
		getElementPresent(PageUI_ChatAI.TEXT_PERSONALIZE_YOUR_HOME);
		getElementPresent(PageUI_ChatAI.TEXT_4_1_WIDGET);
		getElementPresent(PageUI_ChatAI.IMG_4_1_WIDGET);
		captureScreen(driver, "Setting_Widget");
		click(PageUI_ChatAI.BTN_ADD_TO_HOME_SCREEN_4_1);
		getElementPresent(PageUI_ChatAI.CARD_CHAT_AI);
		getElementPresent(PageUI_ChatAI.BTN_ADD_TO_HOME_SCREEN);
		captureScreen(driver, "Setting_Widget_4X1");
		click(PageUI_ChatAI.BTN_CANCEL);
		getElementPresent(PageUI_ChatAI.TEXT_4_2_WIDGET);
		getElementPresent(PageUI_ChatAI.IMG_4_2_WIDGET);
		click(PageUI_ChatAI.BTN_ADD_TO_HOME_SCREEN_4_2);
		getElementPresent(PageUI_ChatAI.CARD_CHAT_AI);
		getElementPresent(PageUI_ChatAI.BTN_ADD_TO_HOME_SCREEN);
		captureScreen(driver, "Setting_Widget_4X2");
		click(PageUI_ChatAI.BTN_CANCEL);
	}
	@Test
	public void TC_003_Check_AllLink_Setting_Bubble_Chat() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.BTN_SWITCH);
		getElementPresent(PageUI_ChatAI.ICON_BUBBLE); 
		captureScreen(driver, "Setting_Bubble_Chat");
		click(PageUI_ChatAI.ICON_BUBBLE);
		getElementPresent(PageUI_ChatAI.OPTION_CHAT_AI);
	}
	@Test
	public void TC_004_Check_AllLink_Setting_Restore_Purchase() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		getElementPresent(PageUI_ChatAI.TAB_RESTORE_PERCHASE);
		
//		getElementPresent(PageUI_ChatAI.TEXT_THANK_YOU_FOR_PURCHASING);
//		getElementPresent(PageUI_ChatAI.BTN_CANCEL_RESTORE_PERCHASE);
//		captureScreen(driver, "RestorePerchase");
//		click(PageUI_ChatAI.BTN_OK);
//		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
//		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);
	}
	@Test
	public void TC_005_Check_AllLink_Setting_About_Us() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_ABOUT_US);
		getElementPresent(PageUI_ChatAI.AI_CHAT_CH_PLAY);
		getElementPresent(PageUI_ChatAI.TEXT_IKAME);
		captureScreen(driver, "Setting_About_Us");
	}
	@Test
	public void TC_006_Check_AllLink_Setting_Privacy_Policy() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_PRIVACY_POLICY);
		pause(5000);
		getElementPresent(PageUI_ChatAI.URL_CHORME);
		captureScreen(driver, "Setting_Privacy_Policy");
	}
	@Test
	public void TC_007_Check_AllLink_Setting_Term_Of_Use() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_TERM_OF_USE);
		pause(3000);
		getElementPresent(PageUI_ChatAI.URL_CHORME);
		captureScreen(driver, "Setting_Term_Of_Use");
	}
	@Test
	public void TC_008_Check_AllLink_Setting_Language() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_LANGUAGE);
		getListElement(PageUI_ChatAI.LIST_LANGUAGE);
		getElementPresent(PageUI_ChatAI.BTN_DONE_LANGUAGE);
		captureScreen(driver, "Setting_Language");
	}
	@Test
	public void TC_009_Check_AllLink_Setting_Contacts_Support() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_CONTACTS_SUPPORT);
		pause(3000);
		getElementPresent(PageUI_ChatAI.URL_CHORME);
		captureScreen(driver, "Setting_Contacts_Support");
	}
	@Test
	public void TC_010_Check_AllLink_Setting_Rate_App() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_RATE_APP);
		getElementPresent(PageUI_ChatAI.TEXT_RATE_US);
		getElementPresent(PageUI_ChatAI.BTN_RATE);
		captureScreen(driver, "Setting_Rate_App");
	}
	@Test
	public void TC_011_Check_AllLink_Setting_Send_To_Feedback() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_SETTING);
		click(PageUI_ChatAI.TAB_SEND_FEEDBACK);
		getElementPresent(PageUI_ChatAI.LIST_APP);
		getElementPresent(PageUI_ChatAI.TEXT_SHARE_WITH);
		captureScreen(driver, "Setting_Send_To_Feedback");
	}
	private Management_Account managementAccount;
}
