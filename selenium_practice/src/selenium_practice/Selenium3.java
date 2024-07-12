package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// 증권사 페이지에서 시작
		driver.get("https://finance.naver.com/");
		
		// /html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div
		List<WebElement> news = driver.findElements(By.xpath("/html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div"));
		for(WebElement el : news) {
			System.out.println(el.getText()); 
		}

	}

}
