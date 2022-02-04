package com.sanjin.myspringmvc;

import com.sanjin.utils.Stringutils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sanjin
 * @date 2022/2/3 下午10:48
 * @description
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {

    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream("applicationContext.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(is);

            NodeList beans = doc.getElementsByTagName("bean");

            for (int i = 0; i < beans.getLength(); i++) {
                Node item = beans.item(i);
                if (item.getNodeType() == Node.ELEMENT_NODE){
                    Element beanElement = (Element) item;
                    String id = beanElement.getAttribute("id");
                    String className = beanElement.getAttribute("class");
                    Constructor<?> constructor = Class.forName(className).getConstructor(ServletContext.class);
                    Object beanObj = constructor.newInstance(this.getServletContext());
                    beanMap.put(id, beanObj);
                }
            }

        } catch (ParserConfigurationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | SAXException | IOException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String servletPath = req.getServletPath();
        String substring = servletPath.substring(1);
        //获取到url中的对应controller
        String controllerId = substring.replace(".do", "");
        Object beanObj = beanMap.get(controllerId);

        if (beanObj != null){
            String operate = req.getParameter("operate");
            if (!Stringutils.isNotEmpty(operate)){
                operate = "index";
            }

            Method[] methods = beanObj.getClass().getDeclaredMethods();
            for (Method m : methods) {
                if (operate.equals(m.getName())) {
                    try {
                        m.setAccessible(true);
                        m.invoke(beanObj, req, resp);

                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        throw new RuntimeException("not found servlet!");
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                        throw new RuntimeException("not found servlet!");
                    }
                }
            }

        };


    }
}
