package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Srt1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// SRT 홈페이지 열기
		driver.get("https://etk.srail.kr/main.do");
		
		// select 안쪽의 name으로 가져오기
		Select departure = new Select(driver.findElement(By.name("dptRsStnCd")));
		
		// 텍스트 값으로 가져오기
		departure.selectByVisibleText("동탄");
		
		// 도착역
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		
		// value 값으로 가져오기
		arrival.selectByValue("0010");
		
		

	}

}
