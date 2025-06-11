package myFirstTest;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser ="chrome";
		String url ="https://opensource-demo.orangehrmlive.com/";
		OpenBrowser app =new OpenBrowser(browser);
		app.launchWebsite(url);
		app.maximizeBrowser();
		app.inputTextBox("name","username","Admin");
		app.inputTextBox("name","password","admin123");
		app.clickButton("tagname", "Button");
		System.out.println(app.title());
		
		app.close();
		
		
		
		
	}

}
