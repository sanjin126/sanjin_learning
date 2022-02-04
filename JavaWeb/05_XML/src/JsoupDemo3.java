import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/19 下午1:29
 * @description
 */
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {

        File xmlFile = new File("05_XML/src/students.xml");
        //2.获取document对象,根据xml文档获取
        Document document = Jsoup.parse(xmlFile, "utf-8");
        //3.获取elements集合
//        Elements elements = document.getElementsByTag("name");
        Elements elements = document.getElementsByAttributeValue("number","s001");
        System.out.println(elements);
        //遍历，获取单独的element
        Element element = elements.get(0);
        Elements name = element.getElementsByTag("name");
        System.out.println(name.text());
        System.out.println(name.html());


    }
}
