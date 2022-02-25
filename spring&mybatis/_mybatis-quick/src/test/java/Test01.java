import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sanjin.dao.UserMapper;
import com.sanjin.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/17 下午4:34
 * @description
 */
public class Test01 {

        SqlSession session;

    @Before
    public void init(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        session = sessionFactory.openSession();
    }

    @Test
    public void test() throws IOException {
        PageHelper.startPage(2, 2);
        List<User> userList = session.selectList("findAll");
        userList.forEach(System.out::println);
        System.out.println(userList);
        System.out.println(new PageInfo<User>(userList));
        session.close();

    }

    @Test
    public void testMapper() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> all = userMapper.findAll();
        System.out.println("all = " + all);
    }

    @Test
    public void testMapper1() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> byId = userMapper.findById(1);
        System.out.println("byId = " + byId);
    }

    @Test
    public void testMapperCondition(){
        User user = new User();
        user.setId(0);
        user.setUsername("11");
//        user.setPassword("11");
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> byCondition = mapper.findByCondition(user);
        System.out.println("byCondition = " + byCondition);


    }

    @Test
    public void testMapperForeach(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println("mapper.findByIds(list) = " + mapper.findByIds(list));
    }

    @Test
    public void testHandler(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.save(new User(3, "33", "33", new Date()));
        session.commit();
        session.close();
    }
}
