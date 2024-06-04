package ikame.chatai.testsuite;

import static ikame.chatai.common.TestLogger.info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.chatai.common.Management_Account;
import ikame.chatai.common.commonBase;
import ikame.chatai.ui.PageUI_ChatAI;

public final class TS_03_Chat_AI_Assistant extends commonBase {

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
	public void TC_001_Check_AllLink_Assistant_Screen() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		getElementPresent(PageUI_ChatAI.TITLE_ASSISTANT);
		managementAccount.checkButtonAssistant("All");
		managementAccount.checkButtonAssistant("Business Expert");
		managementAccount.checkButtonAssistant("Content Creator");
		managementAccount.checkContentUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Screen");
	}
	@Test
	public void TC_002_Check_AllLink_Assistant_Business_Expert() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert");
	}
	@Test
	public void TC_003_Check_AllLink_Assistant_Business_Expert_Marketing_Plan() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.chooseOptionUtilitiesAssistant("Marketing Plan");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert_Marketing_Plan");
	}
	@Test
	public void TC_004_Check_AllLink_Assistant_Business_Expert_Interviewer_Support() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.chooseOptionUtilitiesAssistant("Interviewer Support");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert_Interviewer_Support");
	}
	@Test
	public void TC_005_Check_AllLink_Assistant_Business_Expert_Competitors_Research() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.chooseOptionUtilitiesAssistant("Competitors Research");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert_Competitors_Research");
	}
	@Test
	public void TC_006_Check_AllLink_Assistant_Business_Expert_Customers_Insights() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.chooseOptionUtilitiesAssistant("Customers Insights");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert_Customers_Insights");
	}
	@Test
	public void TC_007_Check_AllLink_Assistant_Business_Expert_Clients_Proposal() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Business Expert");
		managementAccount.chooseOptionUtilitiesAssistant("Clients Proposal");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Business_Expert_Clients_Proposal");
	}
	@Test
	public void TC_008_Check_AllLink_Assistant_Content_Creator() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator");
	}
	@Test
	public void TC_009_Check_AllLink_Assistant_Content_Creator_Paragraph_Writer() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Paragraph Writer");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Paragraph_Writer");
	}
	@Test
	public void TC_010_Check_AllLink_Assistant_Content_Creator_Song_Composer() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Song Composer");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Song_Composer");
	}
	@Test
	public void TC_011_Check_AllLink_Assistant_Content_Creator_Social_Media() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Social Media");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Social_Media");
	}
	@Test
	public void TC_012_Check_AllLink_Assistant_Content_Creator_Email_Writer() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Email Writer");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Email_Writer");
	}
	@Test
	public void TC_013_Check_AllLink_Assistant_Content_Creator_Ad_Copy() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Ad Copy");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Ad_Copy");
	}
	@Test
	public void TC_014_Check_AllLink_Assistant_Content_Creator_SEO_Specialist() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("SEO Specialist");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_SEO_Specialist");
	}
	@Test
	public void TC_015_Check_AllLink_Assistant_Content_Creator_Blogging() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Blogging");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Blogging");
	}
	@Test
	public void TC_016_Check_AllLink_Assistant_Content_Creator_Content_Calendar() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Content Creator");
		managementAccount.chooseOptionUtilitiesAssistant("Content Calendar");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Content_Creator_Content_Calendar");
	}
	@Test
	public void TC_017_Check_AllLink_Assistant_Lifestyle_Buddy() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy");
	}
	@Test
	public void TC_018_Check_AllLink_Assistant_Lifestyle_Buddy_Outfit_Designer() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("Outfit Designer");
		managementAccount.checkUIUtilitiesAssistantNoTextbox();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_Outfit_Designer");
	}
	@Test
	public void TC_019_Check_AllLink_Assistant_Lifestyle_Buddy_Pick_Up_Line() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("Pick up line");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_Pick_Up_Line");
	}
	@Test
	public void TC_020_Check_AllLink_Assistant_Lifestyle_Buddy_Write_A_Joke() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("Write a joke");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_Write_A_Joke");
	}
	@Test
	public void TC_021_Check_AllLink_Assistant_Lifestyle_Buddy_Horoscope_Reader() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("Horoscope Reader");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_Horoscope_Reader");
	}
	@Test
	public void TC_022_Check_AllLink_Assistant_Lifestyle_Buddy_Team_Building_Activities() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("Team Building Activities");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_Team_Building_Activities");
	}
	@Test
	public void TC_023_Check_AllLink_Assistant_Lifestyle_Buddy_DIY_Ideas() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Lifestyle Buddy");
		managementAccount.chooseOptionUtilitiesAssistant("DIY Ideas");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Lifestyle_Buddy_DIY_Ideas");
	}
	@Test
	public void TC_024_Check_AllLink_Assistant_Learn_With_ChatAI() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.checkContentScreenUtilitiesAssistant();
		captureScreen(driver, "Assistant_Learn_With_ChatAI");
	}
	@Test
	public void TC_025_Check_AllLink_Assistant_Learn_With_ChatAI_Math_Expert() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("Math Expert");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_Math_Expert");
	}
	@Test
	public void TC_026_Check_AllLink_Assistant_Learn_With_ChatAI_History_Events() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("History events");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_History_Events");
	}
	@Test
	public void TC_027_Check_AllLink_Assistant_Learn_With_ChatAI_Code_Supporter() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("Code Supporter");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_Code_Supporter");
	}
	@Test
	public void TC_028_Check_AllLink_Assistant_Learn_With_ChatAI_Essay_Supporter() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("Essay Supporter");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_Essay_Supporter");
	}
	@Test
	public void TC_029_Check_AllLink_Assistant_Learn_With_ChatAI_Physics_Expert() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("Physics Expert");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_Physics_Expert");
	}
	@Test
	public void TC_030_Check_AllLink_Assistant_Learn_With_ChatAI_Chemistry_Expert() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Learn with ChatAI");
		managementAccount.chooseOptionUtilitiesAssistant("Chemistry Expert");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Learn_With_ChatAI_Chemistry_Expert");
	}
	@Test
	public void TC_031_Check_AllLink_Assistant_Cuisines() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines");
	}
	@Test
	public void TC_032_Check_AllLink_Assistant_Cuisines_Latino() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Latino");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Latin");
	}
	@Test
	public void TC_033_Check_AllLink_Assistant_Cuisines_African() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("African");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_African");
	}
	@Test
	public void TC_034_Check_AllLink_Assistant_Cuisines_Asian() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Asian");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Asian");
	}
	@Test
	public void TC_035_Check_AllLink_Assistant_Cuisines_Western() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Western");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Western");
	}
	@Test
	public void TC_036_Check_AllLink_Assistant_Cuisines_Thai() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Thai");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Thai");
	}
	@Test
	public void TC_037_Check_AllLink_Assistant_Cuisines_Japanese() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Japanese");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Japanese");
	}
	@Test
	public void TC_038_Check_AllLink_Assistant_Cuisines_European() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("European");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_European");
	}
	@Test
	public void TC_039_Check_AllLink_Assistant_Cuisines_American() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("American");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_American");
	}
	@Test
	public void TC_040_Check_AllLink_Assistant_Cuisines_Indian() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Cuisines");
		managementAccount.chooseOptionUtilitiesAssistant("Indian");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Cuisines_Indian");
	}
	@Test
	public void TC_041_Check_AllLink_Assistant_Travel() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Travel");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Travel");
	}
	@Test
	public void TC_042_Check_AllLink_Assistant_Travel_Destination() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Travel");
		managementAccount.chooseOptionUtilitiesAssistant("Destination");
		managementAccount.checkUIUtilitiesAssistantNoTextbox();
		
		captureScreen(driver, "Assistant_Travel_Destination");
	}
	@Test
	public void TC_043_Check_AllLink_Assistant_Travel_Experiences() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Travel");
		managementAccount.chooseOptionUtilitiesAssistant("Experiences");
		managementAccount.checkUIUtilitiesAssistantNoTextbox();		
		captureScreen(driver, "Assistant_Travel_Experiences");
	}
	@Test
	public void TC_044_Check_AllLink_Assistant_Halloween() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Halloween");
		managementAccount.checkContentScreenUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Halloween");
	}
	@Test
	public void TC_045_Check_AllLink_Assistant_Halloween_Movies() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Halloween");
		managementAccount.chooseOptionUtilitiesAssistant("Movies");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Halloween_Movies");
	}
	@Test
	public void TC_046_Check_AllLink_Assistant_Halloween_Decoration_Ideas() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Halloween");
		managementAccount.chooseOptionUtilitiesAssistant("Decoration Ideas");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Halloween_Decoration_Ideas");
	}
	@Test
	public void TC_047_Check_AllLink_Assistant_Halloween_Costumes() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Halloween");
		managementAccount.chooseOptionUtilitiesAssistant("Costumes");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Halloween_Costumes");
	}
	@Test
	public void TC_048_Check_AllLink_Assistant_Halloween_Pranks() {
		info("Open app");
		managementAccount.openHomePageWithLanguage("English");
		click(PageUI_ChatAI.TEXT_ASSISTANT);
		managementAccount.clickOptionButtonAssistant("Halloween");
		managementAccount.chooseOptionUtilitiesAssistant("Pranks");
		managementAccount.checkUIUtilitiesAssistant();
		
		captureScreen(driver, "Assistant_Halloween_Pranks");
	}
	private Management_Account managementAccount;
}
