package SeleniumPractise.SeleniumPractise;

public class DemoCartTest {

	public static void main(String[] args) {

		BrowserUtil br= new BrowserUtil();
		br.launchBrowser("edge");
		br.enterURL("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		String pagetitle=br.getPageTitle();
		if(pagetitle.contains("Login"))
		{
			System.out.println("Webpage Title:  "+pagetitle);
		}
		String url=br.getCurrentUrl();
		if(url.contains("opencart"))
		{
			System.out.println("Current URL:  "+url);
		}
		
		
		br.quitBrowser();
		
		
	}

}
