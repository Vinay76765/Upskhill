import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//open the browser
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		WebElement x = driver.findElement(By.id("username"));
		x.sendKeys("vengatram");
		WebElement x1 = driver.findElement(By.name("password"));
		x.sendKeys(Keys.CONTROL,"ac");
		x1.sendKeys(Keys.CONTROL,"v");
		
	}

}
