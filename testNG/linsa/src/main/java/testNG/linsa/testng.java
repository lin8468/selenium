package testNG.linsa;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class testng {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
	    options.addArguments("disable-infobars");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.baidu.com");
		WebElement search_input = driver.findElement(By.name("wd"));
		search_input.sendKeys("淘宝网");
		//WebElement search_titlte = driver.findElement(By.id("content_left"));
		//search_titlte.click();
//		List<WebElement> list = driver.findElements(By.tagName("a"));
//		for(WebElement e:list) {
//			System.out.println(e.getAttribute("href"));
//		}
		WebElement driverClick = driver.findElement(By.xpath("//*[@id=\'4001\']/div[1]/h3/a[1]"));
		driverClick.click();
		//这是一个test
		Thread.sleep(3000);
		System.out.println("Title is :" + driver.getTitle());
		driver.quit();
	}

}


