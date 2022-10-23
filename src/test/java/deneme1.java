import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class deneme1 {

    @AfterTest
    public void DemoAfter(){
        System.out.println("aftertest");
    }

    @BeforeSuite
    public void FirstSuite(){
        System.out.println("first suite");
    }

}
