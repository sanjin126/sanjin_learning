import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/19 下午2:42
 * @description
 */
public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        File xmlFile = new File("05_XML/src/students.xml");
        //2.获取document对象,根据xml文档获取
        Document document = Jsoup.parse(xmlFile, "utf-8");
        System.out.println(document.select("name"));
        System.out.println("--------------------------");
        System.out.println(document.getElementsByTag("name"));
        System.out.println("--------------------------");
        System.out.println(document.select("#wang"));
        System.out.println("--------------------------");
        System.out.println(document.getElementsByAttributeValue("id", "wang"));
        System.out.println("--------------------------");

    }
}
