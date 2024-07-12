package selenium_practice;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_paiejvnaien {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // 시작페이지
        driver.get("https://m.nsmall.com/store/atypical/home");

        // 닫기버튼
        WebElement popButton1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[3]/button[2]"));
        popButton1.click();
        
        // 시간지연
        Thread.sleep(1000);
        
        // 닫기버튼
        WebElement popButton2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[2]/button[2]"));
        popButton2.click();
        
        // 시간지연
        Thread.sleep(1000);
        
        // 로그인버튼(시작화면에서)
        WebElement loginButton1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/button[1]"));
        loginButton1.click();
        
        // 페이지 전환
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }
        
        // ID, 비번 입력
        WebElement idBar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div/input"));
        WebElement passBar = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/input"));
        
        idBar.sendKeys("gch05219@gmail.com");
        passBar.sendKeys("Hyeokgyu1!@");
        
        // 로그인버튼(로그인화면에서)
        WebElement login1Button = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[4]/button"));
        login1Button.click();        
        
        // 페이지 전환
        Set<String> handles1 = driver.getWindowHandles();
        for (String handle : handles1) {
            driver.switchTo().window(handle);
        }
        
        // 시간지연
        Thread.sleep(1000);
        
        // 검색창에 생수2L 입력
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/label/input"));
        searchInput.sendKeys("생수 2L");
        
        // 엔터키 입력 보내기
        searchInput.sendKeys(Keys.ENTER);
        
        // 페이지 전환
        Set<String> handles2 = driver.getWindowHandles();
        for (String handle : handles2) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 무료배송 클릭 
        WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/div[2]/div/div/div[1]/div[1]/ul/li[2]/input"));
        btn.click();

        // 지리산 물하나 클릭 
        WebElement water = driver.findElement(By.cssSelector("#app > div.container > div > section > div.search-result-list-wrap > div:nth-child(1) > ul > li:nth-child(1) > div > figure > a > picture > img"));
        water.click();
        
        // 페이지 전환
        Set<String> handles3 = driver.getWindowHandles();
        for (String handle : handles3) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 개수 선택 - 생수 4병
        WebElement option = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div[7]/div/div[1]/div[2]/div/div/button[2]"));
        for (int i = 0; i < 3; i++) {
            option.click();
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 장바구니 클릭
        WebElement purchase1_1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/div[2]/div[7]/div/div[3]/div/button[2]"));
        purchase1_1.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 계속 쇼핑하기 클릭
        WebElement purchase1_2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[2]/div/div/button"));
        purchase1_2.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 검색창에 햇반 입력
        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div[1]/div/label/input"));
        searchbar.sendKeys("햇반");
        
        // 엔터키 입력 보내기
        searchbar.sendKeys(Keys.ENTER);
        
        // 페이지 전환
        Set<String> handles4 = driver.getWindowHandles();
        for (String handle : handles4) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 무료배송 클릭 
        WebElement butn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/div[2]/div/div/div[1]/div[1]/ul/li[2]/input"));
        butn.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 햇반 작은공기 36개 클릭 
        WebElement rice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/div[3]/div[1]/ul/li[2]/div/a/strong"));
        rice.click();
        
        // 페이지 전환 5
        Set<String> handles5 = driver.getWindowHandles();
        for (String handle : handles5) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 상품정보 누르기 
        WebElement ricedetails = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/ul/li[2]/button"));
        ricedetails.click();
        
        // 시간 지연
        Thread.sleep(1000);
		
        // 
        List<WebElement> details1 = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[7]"));
		for(WebElement el : details1) {
			System.out.println(el.getText()); 
		}
		// 
		List<WebElement> details2 = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/div/div/table[2]/tr[8]"));
		for(WebElement el : details2) {
			System.out.println(el.getText());
		}
		
		// 시간 지연
		Thread.sleep(1000);
		
		//========================== 상품평 ==============================//
		// 상품평 누르기
        WebElement review = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div/ul/li[3]/button"));
        review.click();
        
        // 시간 지연
        Thread.sleep(500);
        
        // 아래로 두번
        for(int j = 0; j<3; j++) {
        searchbar.sendKeys(Keys.PAGE_DOWN);
        // 시간 지연
        Thread.sleep(1000);
        }

        // 시간 지연
        Thread.sleep(1000);

        // 위로 두번
        for(int j = 0; j<4; j++) {
            searchbar.sendKeys(Keys.PAGE_UP);
            // 시간 지연
            Thread.sleep(1000);
        }
        
        // 시간 지연
        Thread.sleep(1000);
		
		
        // 개수 선택 - 햇반 3개 
        WebElement option2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/div/div/div[1]/div[2]/div/div/button[2]"));
            for (int i = 0; i < 2; i++) {
                option2.click();
            }
            
		// 시간 지연
		Thread.sleep(1000);

		// 장바구니 클릭
		WebElement purchase2_1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/div/div/div[3]/div/button[2]"));
		purchase2_1.click();
		
		// 시간 지연
        Thread.sleep(1000);

		// 장바구니 보러가기 클릭
		WebElement purchase2_2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div[2]/div/div/a"));
		purchase2_2.click();
		
        // 페이지 전환 6
        Set<String> handles6 = driver.getWindowHandles();
        for (String handle : handles6) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 구매하기 클릭
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div[2]/div/div[4]/button"));
        button.click();
        
		
		// 페이지 전환 7
        Set<String> handles7 = driver.getWindowHandles();
        for (String handle : handles7) {
            driver.switchTo().window(handle);
        }
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 카드선택 클릭
        WebElement cardChoice = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[5]/div[2]/div[4]/div[2]/div[1]/div/div[1]/button"));
        cardChoice.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 국민카드 클릭
        WebElement KBcard = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/ul/li[2]/button/span"));
        KBcard.click();

        // 시간 지연
        Thread.sleep(1000);
        
        // 필수 동의 클릭
        WebElement allow = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div/div[3]/div/div/div[1]"));
        allow.click();
        
        // 시간 지연
        Thread.sleep(1000);
        
        // 최종결제하기 클릭
        WebElement  last = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/div/div[3]/div/button"));
        last.click();
        
        
    }
}