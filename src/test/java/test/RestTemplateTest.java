package test;

import com.ydy.utils.MyRestTemplate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.base.BaseTest;

import java.io.UnsupportedEncodingException;

public class RestTemplateTest extends BaseTest {

    @Autowired
    private MyRestTemplate myRestTemplate;

    @Test
    public void testRestTemplate(){
        String s = myRestTemplate.getForObject("http://121.199.2.1/getJson",String.class);
        try {
            System.out.println(new String(s.getBytes(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
