package json;

import com.alibaba.fastjson.JSON;
import pojo.User;

import java.util.ArrayList;

/**
 * @author sanjin
 * @date 2022/2/10 下午11:23
 * @description
 */
public class JSONDemo {
    public static void main(String[] args) {
        User sanjin = new User("sanjin", 21, new String[]{"北京", "上海"});
        User wangxin = new User("wangxin", 21, new String[]{"北京", "郑州"});
        ArrayList<User> users = new ArrayList<User>();
        users.add(sanjin);users.add(wangxin);

        String json = JSON.toJSONString(users);
        System.out.println("json = " + json);

        ArrayList<User> user = JSON.parseObject(json, ArrayList.class);
        System.out.println("user = " + user);
    }
}
