import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

/**
 * @author sanjin
 * @date 2022/1/19 下午2:14
 * @description
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.w3cschool.cn/javascript/js-variables.html");
        Document document = Jsoup.parse(url,10000);
        System.out.println(document);
    }
}
