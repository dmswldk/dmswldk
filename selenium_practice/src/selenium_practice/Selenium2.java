package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// 증권사 페이지에서 시작
		driver.get("https://finance.naver.com/");
		
		// 삼성전자 검색
		WebElement searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]"));
		searchInput.sendKeys("삼성전자");
		
		// 엔터키 입력 보내기
		searchInput.sendKeys(Keys.ENTER);
		

	}

}
