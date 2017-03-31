package hyp_hdn_sniffer_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


/**
 * Created by d.poloka on 3/31/2017.
 */
public class simple_test {
    @Test
    public void userCanLoginByUsername() {
        System.setProperty("webdriver.chrome.driver", "C://Users//d.poloka//Documents//chromedriver//chromedriver.exe");
        System.setProperty("simple_test.browser", "Chrome");
        open("http://google.com");
        $("#hplogo").shouldHave(text("Україна")); // Waits until element gets text
    }

}
