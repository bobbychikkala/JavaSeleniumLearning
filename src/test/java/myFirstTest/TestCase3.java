package myFirstTest;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser ="chrome";
		String url ="https://opensource-demo.orangehrmlive.com/";
		OpenBrowser open =new OpenBrowser(browser);
		open.launchWebsite(url);
		open.maximizeBrowser();
		open.inputTextBox("name","username","Admin");
		open.inputTextBox("name","password","admin123");
		open.clickButton("tagname", "Button");
		
		
		
		
		
	}

}
