import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitialisation {
    public PageInitialisation(WebDriver driver){ PageFactory.initElements(driver,this); }
}
