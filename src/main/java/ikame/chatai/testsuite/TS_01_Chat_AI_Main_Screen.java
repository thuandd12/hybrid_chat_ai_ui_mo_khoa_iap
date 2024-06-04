package ikame.chatai.testsuite;

import static ikame.chatai.common.TestLogger.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.chatai.common.Management_Account;
import ikame.chatai.common.commonBase;
import ikame.chatai.ui.PageUI_ChatAI;

public final class TS_01_Chat_AI_Main_Screen extends commonBase {

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
	public void TC_001_Check_AllLink_Main_Screen() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);
		getElementPresent(PageUI_ChatAI.BTN_SETTING);
		getElementPresent(PageUI_ChatAI.TEXT_IMAGE_GENERATOR);
		getElementPresent(PageUI_ChatAI.BTN_CREATE_NOW);
		getElementPresent(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		getElementPresent(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		getElementPresent(PageUI_ChatAI.TEXT_DISCOVER_TOPIC);
		getElementPresent(PageUI_ChatAI.LIST_TITLE_IN_DISCOVER_TOPIC);
		getElementPresent(PageUI_ChatAI.TEXT_VIEW_MORE);
		getElementPresent(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION);
		getElementPresent(PageUI_ChatAI.BTN_IMAGE);
		getElementPresent(PageUI_ChatAI.BTN_VOID_CHAT);
		getElementPresent(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.ICON_ASSISTANT);
		getElementPresent(PageUI_ChatAI.TEXT_ASSISTANT);
		getElementPresent(PageUI_ChatAI.ICON_MIDJ_ART);
		getElementPresent(PageUI_ChatAI.TEXT_MIDJ_ART);
		captureScreen(driver, "MainScreen");

		click(PageUI_ChatAI.TEXT_VIEW_MORE);
		getElementPresent(PageUI_ChatAI.TITLE_ASSISTANT);
		getElementPresent(PageUI_ChatAI.LIST_BTN_IN_ASSISTANT);
		captureScreen(driver, "Main_Screen_View_More_Lich_Su_Chat_Khong_Qua_6_Lan");
	}

	@Test
	public void TC_002_Check_AllLink_Main_Screen_Lich_Su_Chat_Khong_Qua_6_Lan() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "a");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_CLOSE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "b");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "c");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "d");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "e");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "f");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);
		getElementPresent(PageUI_ChatAI.BTN_SETTING);
		getElementPresent(PageUI_ChatAI.TEXT_IMAGE_GENERATOR);
		getElementPresent(PageUI_ChatAI.BTN_CREATE_NOW);
		getElementPresent(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		getElementPresent(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		getElementPresent(PageUI_ChatAI.TEXT_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.LIST_TITLE_IN_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION);
		getElementPresent(PageUI_ChatAI.BTN_IMAGE);
		getElementPresent(PageUI_ChatAI.BTN_VOID_CHAT);
		getElementPresent(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.ICON_ASSISTANT);
		getElementPresent(PageUI_ChatAI.TEXT_ASSISTANT);
		getElementPresent(PageUI_ChatAI.ICON_MIDJ_ART);
		getElementPresent(PageUI_ChatAI.TEXT_MIDJ_ART);

		captureScreen(driver, "Main_Screen_Lich_Su_Chat_Khong_Qua_6_Lan");

	}

	@Test
	public void TC_003_Check_AllLink_Main_Screen_Lich_Su_Chat_Nhieu_Hon_6_Lan() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "a");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_CLOSE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "b");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "c");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "d");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "e");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "f");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "f");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		click(PageUI_ChatAI.BTN_LEFT);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);

		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);
		getElementPresent(PageUI_ChatAI.BTN_SETTING);
		getElementPresent(PageUI_ChatAI.TEXT_IMAGE_GENERATOR);
		getElementPresent(PageUI_ChatAI.BTN_CREATE_NOW);
		getElementPresent(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		getElementPresent(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		getElementPresent(PageUI_ChatAI.TEXT_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.TEXT_VIEW_MORE_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.LIST_TITLE_IN_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION);
		getElementPresent(PageUI_ChatAI.BTN_IMAGE);
		getElementPresent(PageUI_ChatAI.BTN_VOID_CHAT);
		getElementPresent(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI_BOTTOM_BAR);
		getElementPresent(PageUI_ChatAI.ICON_ASSISTANT);
		getElementPresent(PageUI_ChatAI.TEXT_ASSISTANT);
		getElementPresent(PageUI_ChatAI.ICON_MIDJ_ART);
		getElementPresent(PageUI_ChatAI.TEXT_MIDJ_ART);

		captureScreen(driver, "Main_Screen_Lich_Su_Chat_Nhieu_Hon_6_Lan");

		click(PageUI_ChatAI.TEXT_VIEW_MORE_RECENT_HISTORY);
		getElementPresent(PageUI_ChatAI.TITLE_HISTORY);
		getElementPresent(PageUI_ChatAI.BTN_DELETE);
		captureScreen(driver, "Main_Screen_View_More_Lich_Su_Chat_Nhieu_Hon_6_Lan");
	}

	@Test
	public void TC_004_Check_AllLink_Main_Create_New() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_CREATE_NOW);
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

		captureScreen(driver, "Main_Create_New");
	}

	@Test
	public void TC_005_Check_AllLink_Main_AI_OCR_TEXT() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_ACTION);
		getElementPresent(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.BTN_CANCEL_ACTION);
		captureScreen(driver, "Main_AI_OCR_TEXT");
		click(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_TAKE_PHOTO);
		captureScreen(driver, "Main_AI_OCR_TEXT_OpenCamera");
		pressKeyCode("BACK");
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		click(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		getElementPresent(PageUI_ChatAI.LIST_IMG);
		captureScreen(driver, "Main_AI_OCR_TEXT_GoToPhotos");
		click(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		click(PageUI_ChatAI.BTN_CANCEL_ACTION);
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);

	}

	@Test
	public void TC_006_Check_AllLink_Main_Summary_Text() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_FILES);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_PHOTOS);
		getElementPresent(PageUI_ChatAI.IMG_FILE_IMG);
		getElementPresent(PageUI_ChatAI.TEXTBOX_SUMMARY);
		getElementPresent(PageUI_ChatAI.BTN_SCAN);
		getElementPresent(PageUI_ChatAI.BTN_SEND_SUMMARY);

		captureScreen(driver, "Main_Summary_Text");
	}

	@Test
	public void TC_007_Check_AllLink_Main_Summary_Text_Upload_Files() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		click(PageUI_ChatAI.BTN_UPLOAD_FILES);
		getElementPresent(PageUI_ChatAI.TITLE_ONLY_UPLOAD_PDF);
		getElementPresent(PageUI_ChatAI.BTN_I_GOT_IT);
		getElementPresent(PageUI_ChatAI.BTN_CANCEL_UPLOAD_FILES);

		captureScreen(driver, "Main_Summary_Text_Upload_Files");
	}

	@Test
	public void TC_008_Check_AllLink_Main_Summary_Text_Upload_Files_I_Got_It() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		click(PageUI_ChatAI.BTN_UPLOAD_FILES);
		click(PageUI_ChatAI.BTN_I_GOT_IT);
		pause(3000);
		getElementPresent(PageUI_ChatAI.LIST_FILE_PDF);

		captureScreen(driver, "Main_Summary_Text_Upload_Files_I_Got_It");
	}

	@Test
	public void TC_009_Check_AllLink_Main_Summary_Text_Upload_Files_Cancel() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		click(PageUI_ChatAI.BTN_UPLOAD_FILES);

		click(PageUI_ChatAI.BTN_CANCEL_UPLOAD_FILES);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_FILES);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_PHOTOS);
	}

	@Test
	public void TC_010_Check_AllLink_Main_Summary_Text_Upload_Photos() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		click(PageUI_ChatAI.BTN_UPLOAD_PHOTOS);
		getElementPresent(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_IMG);

		captureScreen(driver, "Main_Summary_Text_Upload_Files");
	}

	@Test
	public void TC_011_Check_AllLink_Main_Summary_Textbox_Ask_A_Question() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		pause(3000);
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_SUMMARY, "auto test");
		click(PageUI_ChatAI.BTN_SEND_SUMMARY);
		getElementPresent(PageUI_ChatAI.TEXTBOX_SEARCH);
		pause(2000);
		captureScreen(driver, "Main_Summary_Textbox_Ask_A_Question");

	}

	@Test
	public void TC_012_Check_AllLink_Main_Summary_Scan() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TAB_SUMMARY_TEXT);
		click(PageUI_ChatAI.BTN_SCAN);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_ACTION);
		getElementPresent(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.BTN_CANCEL_ACTION);
		captureScreen(driver, "Main_Summary_Scan");
		click(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_TAKE_PHOTO);
		pause(3000);
		captureScreen(driver, "Main_Summary_Scan_OpenCamera");
		pressKeyCode("BACK");
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.BTN_SCAN);
		click(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		getElementPresent(PageUI_ChatAI.LIST_IMG);
		captureScreen(driver, "Main_Summary_Scan_GoToPhotos");
		click(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.BTN_SCAN);
		click(PageUI_ChatAI.BTN_CANCEL_ACTION);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_FILES);
		getElementPresent(PageUI_ChatAI.BTN_UPLOAD_PHOTOS);
	}

	@Test
	public void TC_013_Check_AllLink_Main_Textbox_Ask_A_Question() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		sendKeyToElement(PageUI_ChatAI.TEXTBOX_ASK_A_QUESTION, "a");
		click(PageUI_ChatAI.BTN_SEND);
		getElementPresent(PageUI_ChatAI.TITLE_CHAT_AI);
		getElementPresent(PageUI_ChatAI.TXTBOX_ASK_A_QUESTION);
		getElementPresent(PageUI_ChatAI.BTN_REGENERATE);
		pause(2000);
		captureScreen(driver, "Main_Textbox_Ask_A_Question");
	}

	@Test
	public void TC_014_Check_AllLink_Main_Add_Gallery() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_IMAGE);
		getElementPresent(PageUI_ChatAI.TEXT_CHOOSE_ACTION);
		getElementPresent(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.BTN_CANCEL_ACTION);
		captureScreen(driver, "Main_Add_Gallery");
		click(PageUI_ChatAI.BTN_OPEN_CAMERA);
		getElementPresent(PageUI_ChatAI.BTN_TAKE_PHOTO);
		captureScreen(driver, "Main_Add_Gallery_OpenCamera");
		pressKeyCode("BACK");
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		click(PageUI_ChatAI.BTN_GO_TO_PHOTO);
		getElementPresent(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		getElementPresent(PageUI_ChatAI.LIST_IMG);
		captureScreen(driver, "Main_Add_Gallery_GoToPhotos");
		click(PageUI_ChatAI.TITLE_CHOOSE_PHOTOS);
		clickElementIfDisplay(PageUI_ChatAI.BTN_CONTINUE, 10000);
		clickElementIfDisplay(PageUI_ChatAI.BTN_DISMISS, 10000);
		click(PageUI_ChatAI.TAB_AI_ORC_TEXT);
		click(PageUI_ChatAI.BTN_CANCEL_ACTION);
		getElementPresent(PageUI_ChatAI.TEXT_CHAT_AI);
		getElementPresent(PageUI_ChatAI.ICON_CHAT_AI);
	}

	@Test
	public void TC_015_Check_AllLink_Main_Void() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.BTN_VOID_CHAT);
		getElementPresent(PageUI_ChatAI.TITLE_VOID_CHAT);
		getElementPresent(PageUI_ChatAI.IMG_MIC);

		captureScreen(driver, "Main_Void");
	}

	private Management_Account managementAccount;
}
