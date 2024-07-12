package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        // 시작페이지
        driver.get("https://m.nsmall.com/goods/32122390"); 
        		
		// 상품정보 누르기 
        WebElement ricedetails = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/ul/li[2]/button"));
        ricedetails.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        /*// 상품정보 긁어오기
        List<WebElement> details = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div"));
		for(WebElement el : details) {
			System.out.println(el.getText()); 
		}*/
		
        // /html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[7]
        List<WebElement> details1 = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[7]"));
		for(WebElement el : details1) {
			System.out.println(el.getText()); 
		}
		// /html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[8]
		List<WebElement> details2 = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[8]"));
		for(WebElement el : details2) {
			System.out.println(el.getText());
		}
		
	}

}
