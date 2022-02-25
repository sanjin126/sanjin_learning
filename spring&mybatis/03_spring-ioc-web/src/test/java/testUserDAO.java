import com.sanjin.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sanjin
 * @date 2022/2/13 下午3:47
 * @description
 */
public class testUserDAO {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) app.getBean("userDAO");
        userDAO.save();
    }
}
