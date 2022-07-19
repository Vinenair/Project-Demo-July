package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclasss {
	static WebDriver driver;

	public void browserlaunch(String Browser) {
		switch (Browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "EDGE":
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

	}

	public void urllaunch(String s) {
		driver.get(s);
	}

	public String getUrl() {
		String r = driver.getCurrentUrl();
		return r;
	}

	public void sendkey(WebElement e, String a) {
		e.sendKeys(a);
	}

	public void Switchindex(int a) {
		driver.switchTo().frame(a);
	}

	public void Switchvalue(String a) {
		driver.switchTo().frame(a);
	}

	public void navigate(String s) {
		driver.navigate().to(s);
	}
}