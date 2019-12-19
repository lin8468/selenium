package selenium.HelloWorld;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hello {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		//设置浏览器参数
		ChromeOptions options=new ChromeOptions();
	    options.addArguments("--test-type", "--start-maximized");
	    //指定浏览器位置
        //options.setBinary("C:/XXXXXXX/chrome.exe");
		WebDriver driver = new ChromeDriver(options);
		//driver.delete_all_cookies();
		driver.get("https://www.baidu.com");
		WebElement search_input = driver.findElement(By.name("wd"));
		search_input.sendKeys("淘宝网");
		//connect = pymysql.connect(host="xx", port=3306, user="root", passwd="xxx", db="xx")
		//先线程休眠3秒，便于观察，然后才关闭，不然启动就关闭像闪退
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		System.out.println("Title is :" + driver.getTitle());
		driver.quit();
	}

}
