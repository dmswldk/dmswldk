package selenium_practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pjt {

	public static void main(String[] args) throws InterruptedException {
		// 사용할 크롬드라이버를 불러오기
		WebDriver driver = new ChromeDriver();
				
		//드라이버를 이용해서 페이지를 열기
		driver.get("https://m.nsmall.com/store/atypical/home");
		
		// 검색창에 생수2L 입력
		WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/label/input"));
		searchInput.sendKeys("생수 2L");
		
		// 엔터키 입력 보내기
		searchInput.sendKeys(Keys.ENTER);
		
		// 페이지 전환
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			driver.switchTo().window(handle);
		}
		
		// 시간 지연
		Thread.sleep(1000);
		
		// 무료배송 클릭 /html/body/div[1]/div[3]/div/section/div[2]/div/div/div[1]/div[1]/ul/li[2]/input
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/div[2]/div/div/div[1]/div[1]/ul/li[2]/input"));
		btn.click();

		// 지리산 물하나 클릭 
		WebElement water = driver.findElement(By.cssSelector("#app > div.container > div > section > div.search-result-list-wrap > div:nth-child(1) > ul > li:nth-child(1) > div > figure > a > picture > img"));
		water.click();
		
		/*// 상품을 나타내는 div의 클래스가 "product-item"라고 가정
		List<WebElement> products = driver.findElements(By.cssSelector("basicList_list_basis__uNBZx"));
		
		// 특정 상품 이름 클릭
        String targetProductName = "(광동 직영) 삼다수 그린(무라벨) 2L 24"; // 클릭하고자 하는 생수 이름
        for (WebElement product : products) {
            WebElement productNameElement = product.findElement(By.cssSelector("adProduct_title__amInq")); // 상품 이름을 포함하는 요소
            String productName = productNameElement.getText();
            if (productName.equals(targetProductName)) {
                product.click();
                break;
            }
        }*/
		
//		// 페이지 전환
//		Set<String> hs = driver.getWindowHandles();
//		for (String handle : hs) {
//			driver.switchTo().window(handle);
//		}
		
//		// 배송 여부 선택
//        WebElement option = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[2]/div[2]/fieldset/div[6]/ul/li/div/div/div/button[2]"));
//        // 클릭 - 옵션: 생수 4명 선택
//        for (int i = 0; i < 3; i++) {
//            option.click();
//        }
//        
//        // 시간 지연
//        Thread.sleep(1000);
//        
//        // 장바구니 클릭
//        WebElement cart = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[2]/div[2]/fieldset/div[8]/div[2]/div[3]/a"));
//        cart.click();
//        
//        // 시간 지연
//        Thread.sleep(1000);
//        
//        // Enter 키를 누르기
//        option.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
