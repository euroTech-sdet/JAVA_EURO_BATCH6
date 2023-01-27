package days.day55.OverridingSample;

public class TaskPage extends Pages {


    String taskPageID ;

    public TaskPage(String taskPageID){
        this.taskPageID= taskPageID;
    }

    @Override
    public void navigationToPage(String pageName) {
        super.navigationToPage(pageName+taskPageID);
//        System.out.println("Override the parent method, this is CHILD CLASS");
    }

    @Override
    public TaskPage test(){
        super.test();
        TaskPage taskPage = new TaskPage("");
        return taskPage;
    }
}
