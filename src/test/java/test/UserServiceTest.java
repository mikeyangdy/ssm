package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ydy.entity.UserInfo;
import com.ydy.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSONObject;
import test.base.BaseTest;

import javax.annotation.Resource;


public class UserServiceTest extends BaseTest {

    /** 注入用户service */
    @Autowired
    private UserService userService;

    /** byName 注入 */
    @Resource(name = "userInfo233")
    private UserInfo userInfo1;

    /** byType 注入 */
    @Autowired
    private UserInfo userInfo;


    /** 测试 用户bean注入 */
    @Test
    public void testUserInfoBean(){
        System.out.println(userInfo1);
    }

    /** 测试 查找所有用户 */
    @Test
    public void testFindAllUser(){
        System.out.println(userService.findAllUser());
    }

    /** 测试 jackson 的 object对象转json字符串 */
    @Test
    public void testObjToJsonStr(){
        ObjectMapper objectMapper = new ObjectMapper();
        UserInfo userInfo = new UserInfo("1","admin","123456",1);
        try {
            System.out.println(objectMapper.writeValueAsString(userInfo));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /** 测试 jackson 的 json字符串转object对象 */
    @Test
    public void testJsonStringToObj(){
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = "{\"id\":\"1\",\"username\":\"admin\",\"password\":\"123456\",\"type\":1}";
        try {
            JSONObject userInfo = objectMapper.readValue(jsonStr, JSONObject.class);
            System.out.println(userInfo);
            System.out.println(userInfo.get("username"));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
