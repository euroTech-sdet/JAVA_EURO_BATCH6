package days.day54;

public class AccessModifier {

    public int value = 5;
    private String password= "12QWEsada$%^";
    String pageElement= "button[id='Register']"; // if u not provide any access modifier-> default!!
    protected boolean isActive = true;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected void testModifier(){
    }

   protected void testOverriding(){
        System.out.println("AccessModifier PARENT CLASS");
    }
}
