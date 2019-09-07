import com.ss.class4.Java8Topic;
import org.junit.Assert;

public class Test {
    //Junit

    @org.junit.Test
    public void testDemo(){
        Assert.assertEquals(new Java8Topic().demo(),0.9 , 0.00001);
    }
}
