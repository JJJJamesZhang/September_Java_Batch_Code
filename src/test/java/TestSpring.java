import com.ss.class9.BeanConfig;
import com.ss.class9.AopTopic;
import com.ss.class9.Human;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class TestSpring {
    //Junit

//    @org.junit.Test
//    public void testDemo(){
//        Assert.assertEquals(new Java8Topic().demo(),0.9 , 0.00001);
//    }

@   Qualifier("student")
    @Autowired
    Human human;

    @Test
    public void testDemo(){
        System.out.println(human);
    }

    @org.junit.Test
    public void aopTest() throws Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");
        AopTopic aopTopic =(AopTopic) act.getBean("aopTopic");
        aopTopic.demo();
    }
}
