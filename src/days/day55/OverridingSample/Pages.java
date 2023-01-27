package days.day55.OverridingSample;

public class Pages {

    String pageWait = "Waitblabla";

    String navigateLinkElement = ".....";

    public void navigationToPage(String pageName) {
        // todo some automation...
        // bla
        // bla
        navigateTo(pageName);
    }

    public void clickChartMenu() {
    }

    private void navigateTo(String pageName) {
        // todo some automation...
        System.out.println(" NAVIGATED TO " + pageName);
    }

    public Pages test(){
        Pages pages = new Pages();
       return pages;
    }
}

class TestPages {

    public static void main(String[] args) {

        TaskPage taskPage = new TaskPage("e0001");

        taskPage.navigationToPage("Tasks");


    }
}