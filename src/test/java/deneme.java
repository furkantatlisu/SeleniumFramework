import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class deneme {

    @Test
    public void Demo(){
        System.out.println("hello");
    }

    @Test
    public void Demo1(){
        System.out.println("hello1");
    }

    @BeforeTest
    public void prerequest(){
        System.out.println("executed first");
    }

}
