import java.util.List;

import com.ericsson.otp.erlang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.RenderedWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WD {
    public static void main(String[] args)  {
	Server server = new Server();
	try {
	    server.start();
	}
	catch (java.io.IOException e) {
	    System.out.println("Error while starting node");
	}
    }
}
