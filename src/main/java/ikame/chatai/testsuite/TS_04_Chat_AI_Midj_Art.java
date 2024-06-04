package ikame.chatai.testsuite;

import static ikame.chatai.common.TestLogger.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.chatai.common.Management_Account;
import ikame.chatai.common.commonBase;
import ikame.chatai.ui.PageUI_ChatAI;

public final class TS_04_Chat_AI_Midj_Art extends commonBase {

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
	public void TC_001_Check_AllLink_Midj_Art_Screen() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		getElementPresent(PageUI_ChatAI.TAB_GENERATE_ART);
		getElementPresent(PageUI_ChatAI.TAB_WALLPAPERS);
		getElementPresent(PageUI_ChatAI.TEXT_ENTER_YOUR_PROMPT);
		getElementPresent(PageUI_ChatAI.BTN_GET_INSPIRED);
		getElementPresent(PageUI_ChatAI.TEXTBOX_PROMPT);
		getElementPresent(PageUI_ChatAI.BTN_ADVANCED);
		getElementPresent(PageUI_ChatAI.BTN_PRIMARY);
		getElementPresent(PageUI_ChatAI.DROPDOWNLIST_CHOOSE_MODEL);
		getElementPresent(PageUI_ChatAI.DROPDOWNLIST_CHOOSE_SETTING);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_AN_ART_STYLE);
		getElementPresent(PageUI_ChatAI.TEXT_MORE);
		getElementPresent(PageUI_ChatAI.LIST_ART);
		getElementPresent(PageUI_ChatAI.BTN_GENERATE);
		
		captureScreen(driver, "Midj_Art_Screen");
	}
	@Test
	public void TC_002_Check_AllLink_Midj_Art_Generate_Art_Get_Inspired() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		String textStart  = getText(PageUI_ChatAI.TEXTBOX_PROMPT);
		click(PageUI_ChatAI.BTN_GET_INSPIRED);
		pause(3000);
		String textEnd  = getText(PageUI_ChatAI.TEXTBOX_PROMPT);
		verifyCompareNotEqual(textStart, textEnd);
		
		captureScreen(driver, "Midj_Art_Generate_Art_Get_Inspired");
	}
	@Test
	public void TC_003_Check_AllLink_Midj_Art_Generate_Art_Textbox_Prompt() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_PROMPT,"Auto test");
		verifyCompare("Auto test", getText(PageUI_ChatAI.TEXTBOX_PROMPT));
		
		captureScreen(driver, "Midj_Art_Generate_Art_Textbox_Prompt");
	}
	@Test
	public void TC_004_Check_AllLink_Midj_Art_Generate_Art_Dropdown_List_Choose_Model() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		click(PageUI_ChatAI.DROPDOWN_LIST_CHOOSE_MODEL);
		getElementPresent(PageUI_ChatAI.TEXT_SELECT_MODEL);
		getElementPresent(PageUI_ChatAI.LIST_MODEL);
		
		captureScreen(driver, "Midj_Art_Generate_Art_Dropdown_List_Choose_Model");
		
		click(PageUI_ChatAI.IMG_MODEL_1);
		getElementPresent(PageUI_ChatAI.TAB_GENERATE_ART);
		getElementPresent(PageUI_ChatAI.TAB_WALLPAPERS);
	}
	@Test
	public void TC_005_Check_AllLink_Midj_Art_Generate_Art_Dropdown_List_Choose_Settings() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		click(PageUI_ChatAI.DROPDOWN_LIST_CHOOSE_SETTING);
		getElementPresent(PageUI_ChatAI.TEXT_ADVANCED_SETTINGS);
		getElementPresent(PageUI_ChatAI.BTN_SAVE);
		getElementPresent(PageUI_ChatAI.TEXT_NEGATIVE_PROMPT);
		getElementPresent(PageUI_ChatAI.SCALE_SELECTION_BAR);
		getElementPresent(PageUI_ChatAI.LIST_FLEXBOX);
		getElementPresent(PageUI_ChatAI.TEXT_SCALE);
		getElementPresent(PageUI_ChatAI.SCALE_SELECTION_BAR);
		
		captureScreen(driver, "Midj_Art_Generate_Art_Dropdown_List_Choose_Settings");
		
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_NEGATIVE_PROMPT,"Auto Test");
		click(PageUI_ChatAI.ICON_SCALE_1);
		click(PageUI_ChatAI.BTN_SAVE);
		getElementPresent(PageUI_ChatAI.TAB_GENERATE_ART);
		getElementPresent(PageUI_ChatAI.TAB_WALLPAPERS);
	}
	@Test
	public void TC_006_Check_AllLink_Midj_Art_Generate_Art_More() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		click(PageUI_ChatAI.TEXT_MORE);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_STYLE_ART);
		getElementPresent(PageUI_ChatAI.BTN_DONE_STYLE_ART);
		getElementPresent(PageUI_ChatAI.LIST_IMG);
		getElementPresent(PageUI_ChatAI.IMG_RANDOM);
		
		captureScreen(driver, "Midj_Art_Generate_Art_More");
		click(PageUI_ChatAI.BTN_DONE_STYLE_ART);
		getElementPresent(PageUI_ChatAI.TAB_GENERATE_ART);
		getElementPresent(PageUI_ChatAI.TAB_WALLPAPERS);
	}
	@Test
	public void TC_007_Check_AllLink_Midj_Art_Generate_Art_Generate() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_PROMPT,"Auto test");
		click(PageUI_ChatAI.DROPDOWN_LIST_CHOOSE_MODEL);
		click(PageUI_ChatAI.IMG_MODEL_1);
		click(PageUI_ChatAI.BTN_GENERATE);
		pause(10000);
		getElementPresent(PageUI_ChatAI.BTN_SWITCH_WATERMARK);
		getElementPresent(PageUI_ChatAI.IMG_RESULT_ART);
		getElementPresent(PageUI_ChatAI.TEXT_RESULT_PROMPT);
		getElementPresent(PageUI_ChatAI.TEXT_RESULT_STYLE);
		getElementPresent(PageUI_ChatAI.BUTTON_REGENERATE);
		getElementPresent(PageUI_ChatAI.BTN_IMG);
		getElementPresent(PageUI_ChatAI.BTN_SHARE);
		
		captureScreen(driver, "Midj_Art_Generate_Art_Generate");
	}
	@Test
	public void TC_008_Check_AllLink_Midj_Art_Generate_Art_Advanced() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		click(PageUI_ChatAI.BTN_ADVANCED);
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_PROMPT,"Auto test");
		click(PageUI_ChatAI.DROPDOWN_LIST_CHOOSE_MODEL);
		click(PageUI_ChatAI.IMG_MODEL_1);
		click(PageUI_ChatAI.BTN_GENERATE);
		pause(10000);
		getElementPresent(PageUI_ChatAI.BTN_SWITCH_WATERMARK);
		getElementPresent(PageUI_ChatAI.IMG_RESULT_ART);
		click(PageUI_ChatAI.BTN_BACK);
		verifyContains("1", getText(PageUI_ChatAI.TEXT_NUMBER_FREE_TIMES));
		
		captureScreen(driver, "Midj_Art_Generate_Art_Advanced");
	}
	@Test
	public void TC_009_Check_AllLink_Midj_Art_Generate_Art_Primary() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_GENERATE_ART);
		click(PageUI_ChatAI.BTN_PRIMARY);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_AN_ART_STYLE_PRIMARY);
		getElementPresent(PageUI_ChatAI.LIST_IMG_PRIMARY);
		getElementPresent(PageUI_ChatAI.LIST_TITLE_IMG_PRIMARY);
		
		captureScreen(driver, "Midj_Art_Generate_Art_Primary");
		click(PageUI_ChatAI.IMG_PRIMARY1);
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_PROMPT,"Auto test");
		click(PageUI_ChatAI.BTN_GENERATE);
		pause(10000);
		getElementPresent(PageUI_ChatAI.BTN_SWITCH_WATERMARK);
		getElementPresent(PageUI_ChatAI.IMG_RESULT_ART);
		getElementPresent(PageUI_ChatAI.TEXT_RESULT_PROMPT);
		getElementPresent(PageUI_ChatAI.TEXT_RESULT_STYLE);
		getElementPresent(PageUI_ChatAI.BUTTON_REGENERATE);
		getElementPresent(PageUI_ChatAI.BTN_IMG);
		getElementPresent(PageUI_ChatAI.BTN_SHARE);
		
	}
	@Test
	public void TC_010_Check_AllLink_Midj_Art_Wallpapers() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_MIDJ_ART);
		click(PageUI_ChatAI.TAB_WALLPAPERS);
		getElementPresent(PageUI_ChatAI.TEXT_POPULAR);
		getElementPresent(PageUI_ChatAI.LIST_IMG);
		
		captureScreen(driver, "Midj_Art_Wallpapers");
		click(PageUI_ChatAI.IMG_WALLPAPERS1);
		getElementPresent(PageUI_ChatAI.TEXT_SET_WALLPAPER);
		
		captureScreen(driver, "Midj_Art_Wallpapers_Set_Wallpaper");
		click(PageUI_ChatAI.BTN_SET_WALLPAPER);
		getElementPresent(PageUI_ChatAI.IMG_SUCCESS);
		captureScreen(driver, "Midj_Art_Wallpapers_Set_Wallpaper_Success");
		
	}
	
	
	private Management_Account managementAccount;
}
