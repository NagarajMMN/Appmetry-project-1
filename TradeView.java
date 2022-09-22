package Project1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Objects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TradeView {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://in.tradingview.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("//DIV[@role='button'][text()='Markets']")).click();
		 driver.findElement(By.xpath("//SPAN[@class='menuItemHeader-ml2L5a_a'][text()='Stocks']")).click();
		 driver.findElement(By.xpath("//A[@href='/markets/stocks-india/market-movers-all-stocks/']")).click();
		 driver.findElement(By.xpath("//button[text()='Load More']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Load More']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Load More']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Load More']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[text()='Load More']")).click();
		 System.out.println("Strong Buy ===================");
		 List<WebElement> buy = driver.findElements(By.xpath("//DIV[@class='container-epNUk8Mp strong_buy-epNUk8Mp']//preceding::sup[1]"));
		 	List<WebElement> sell = driver.findElements(By.xpath("//DIV[text()='Strong Sell']//preceding::sup[1]"));
		 for (WebElement e : buy) {
			 System.out.println(e.getText());
		}
		 System.out.println();
		 System.out.println("Strong Sell==================");
		   for(WebElement sell1 : sell) {
		  		 System.out.println(sell1.getText());			
			 			    
		}System.out.println();
		System.out.println("matching=======");
		System.out.println(Objects.equal(buy, sell));
		    
		    
					 
	}

}
