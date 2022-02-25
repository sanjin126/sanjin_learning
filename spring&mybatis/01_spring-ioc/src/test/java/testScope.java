import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sanjin
 * @date 2022/2/13 下午3:55
 * @description
 */
public class testScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("1:"+applicationContext.getBean("userDAO"));
        System.out.println("2:"+applicationContext.getBean("userDAO"));
        applicationContext.close();
    }
}
