package days.day22;

public class WebSite {
    public static void main(String[] args) {
        // open the browser-chrome-firefox-edge-explorer
        // navigate to www.hotmail.com
        // enter your user name
        // enter your password
        // click on login button
//        openTheBrowser();
//        navigatetohotmail();
//        enterUserName();
//        enterThePassword();
//        clickOnLoginButton();
        myHotmailEmailBox();
        System.out.println();
        myGmailBox();
    }

    public static void myGmailBox() {
        openTheBrowser();
        navigateToGmail();
        enterUserName();
        enterThePassword();
        clickOnLoginButton();
    }

    public static void myHotmailEmailBox() {
        openTheBrowser();
        navigateToHotmail();
        enterUserName();
        enterThePassword();
        clickOnLoginButton();
    }
    //opened the chrome browser
    //you opened the hotmail web site.
    //you entered Faruk
    //you entered the 12345 as password.
    //You clicked on Login button
    //now you are on dash board page.


    public static void enterUserName() {
        System.out.println("you entered Faruk");
    }

    public static void navigateToHotmail() {
        System.out.println("you opened the hotmail web site.");
    }

    public static void navigateToGmail() {
        System.out.println("you opened the gmail page");
    }

    public static void openTheBrowser() {
        System.out.println("opened the chrome browser");
    }

    public static void enterThePassword() {
        System.out.println("you entered the 12345 as password.");
    }

    public static void clickOnLoginButton() {
        System.out.println("You clicked on Login button");
        System.out.println("now you are on dash board page.");
    }


}
