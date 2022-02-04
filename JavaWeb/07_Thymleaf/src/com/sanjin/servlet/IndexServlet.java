package com.sanjin.servlet;

import com.sanjin.bean.Fruit;
import com.sanjin.dao.FruitDAO;
import com.sanjin.dao.impl.FruitDAOImpl;
import com.sanjin.myspringmvc.ViewBaseServlet;
import com.sanjin.utils.Stringutils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/1/27 下午3:25
 * @description
 */
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {

    private FruitDAO fDao = new FruitDAOImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNo = 1;
        HttpSession session = req.getSession();

        String pg = req.getParameter("pg");
        String search = req.getParameter("search");
        String keyword = req.getParameter("keyword");


        if (Stringutils.isNotEmpty(pg)){
            if ("search".equals(search)){
                pageNo = 1;
            } else {
                pageNo = Integer.parseInt(pg);
            }
        }

        if (keyword != null){
            session.setAttribute("keyword", keyword);
        } else {
            keyword = (String) session.getAttribute("keyword");
            if (keyword == null){
                keyword = "";
            }
        }

        List<Fruit> fruitList = fDao.getFruitList(pageNo, keyword);
        int fruitCount = fDao.getFruitCount(keyword);

        session.setAttribute("pg", pageNo);
        session.setAttribute("pgCount", (fruitCount+5-1)/5);
        session.setAttribute("fruitList", fruitList);

        //此处的名称是逻辑视图名称
        //而物理视图名称是：前缀prefix  +  逻辑视图名   + suffix
        //                   /            index       .html
        super.processTemplate("index", req, resp);
     }
}
