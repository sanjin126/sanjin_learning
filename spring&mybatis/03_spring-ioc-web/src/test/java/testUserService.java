import com.sanjin.domain.User;
import com.sanjin.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sanjin
 * @date 2022/2/13 下午4:40
 * @description
 */
public class testUserService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
//        User bean = app.getBean(User.class);
        userService.save();

    }
}
