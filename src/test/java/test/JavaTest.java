package test;

import org.junit.Test;
import test.base.BaseTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaTest extends BaseTest {


    /** jdk1.8 遍历 map foreach */
    @Test
    public void mapForEach(){
        Map<String,Object> map = new HashMap();
        map.put("user","mike");
        map.put("psw","mike1234");

        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
    }

    /** jdk1.8 遍历 list foreach */
    @Test
    public void listForEach(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("word");
        list.add("!");
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
