package days.day61.Driver;

public class Test {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        WebDriver webDriver1 = new FirefoxDriver();
        WebDriverManager webDriverManager = new WebDriverManager(new ChromeDriver());
        WebDriverManager webDriverManage1r = new WebDriverManager(new FirefoxDriver());
    }
}
