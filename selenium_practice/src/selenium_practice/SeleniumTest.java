package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	public static void main(String[] args) {
		// 사용할 크롬드라이버를 불러오기
		WebDriver driver = new ChromeDriver();
		
		//드라이버를 이용해서 페이지를 열기
		driver.get("https://www.naver.com/");
				
		// #shrtcutArea > ul > li:nth-child(6) > a
		WebElement financeBtn = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		
//		// xpath : HTML문서의 구조를 보여주는 패스 -> 태그의 경로를 알려줌
//		WebElement financeBtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[6]/ul/li[6]/a"));
		
		// 증권버튼클릭
		financeBtn.click();
		
/*		----- 페이지 전환하는 코드 입력해야 밑의 코드가 실행됨------ */
		
		// 페이지 전환을 기다리는 코드
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#stock_items")));
		
		
		// 삼성전자 검색 #stock_items
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		searchInput.sendKeys("삼성전자");
		
		// 엔터키 입력 보내기
		searchInput.sendKeys(Keys.ENTER); 
		
		

	}

}
