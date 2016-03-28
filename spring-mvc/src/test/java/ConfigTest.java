import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lay on 2016/3/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring/ApplicationContext.xml"})
public class ConfigTest {

    Logger log = LoggerFactory.getLogger(ConfigTest.class);

    @Autowired
    private String str1;

    @Test
    public void test(){
        log.info("----test begin----");
        System.out.println(str1);
    }
}
