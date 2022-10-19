package SeleniumPractise.SeleniumPractise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	static WebDriver driver;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver
			.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-1st-odi-1277082/full-scorecard");
		
		String player1="Ravichandran Ashwin";
		String player2="Shardul Thakur";
		System.out.println("Player Name--  " +player1+ "  No of Wickets:  " +getWickets(player1));
		System.out.println("Player Name--  " +player2+ "  No of Wickets:  " +getWickets(player2));
		
		System.out.println("Bowler Details:  " +getBowlingScoreCard(player1));
		
		
	}
	
	
	public static List<String> getBowlingScoreCard(String playername)
	{
		List<String> actbowlinglist=new ArrayList<String>();
		List<WebElement> bowlinglist=driver.
										findElements(By.xpath("//span[text()='"+playername+"']/parent::a/parent::td/following-sibling::td"));
		for(WebElement e: bowlinglist)
		{
			String text=e.getText();
			actbowlinglist.add(text); 
		}
		return actbowlinglist;
		
	}
	
	public static String getWickets(String playername)
	{
		WebElement wickets=driver.
				findElement(
						By.xpath("//span[text()='"+playername+"']/parent::a/parent::td/following-sibling::td//strong"));
		return wickets.getText();
	}

}
