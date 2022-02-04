package com.sanjin.servlet;

import com.sanjin.bean.Fruit;
import com.sanjin.dao.FruitDAO;
import com.sanjin.dao.impl.FruitDAOImpl;
import com.sanjin.myspringmvc.ViewBaseServlet;
import com.sanjin.utils.Stringutils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/3 下午9:52
 * @description
 */
@WebServlet("/fruit.do")
public class FruitServlet extends ViewBaseServlet {

    private FruitDAO fDao = new FruitDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String operate = req.getParameter("operate");
        if (!Stringutils.isNotEmpty(operate)){
            operate = "index";
        }

        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method m : methods) {
            if (operate.equals(m.getName())) {
                try {
                    m.invoke(this, req,resp);
                    return;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        throw new RuntimeException("not found servlet!");

//        switch (operate){
//            case "index":
//                index(req, resp);
//                break;
//            case "del":
//                del(req, resp);
//                break;
//            case "add":
//                add(req, resp);
//                break;
//            case "edit":
//                edit(req, resp);
//                break;
//            case "update":
//                update(req, resp);
//                break;
//            default:
//                throw new RuntimeException("error");
//        }
    }


    private void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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

    private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8"); //解决post
        String fname = req.getParameter("fname");
        String fcount = req.getParameter("fcount");
        String price = req.getParameter("price");
        String remark = req.getParameter("remark");
        if (Stringutils.isNotEmpty( fname, price, fcount, remark)){
            fDao.addFruit(new Fruit(0, fname, Integer.parseInt(price),
                    Integer.parseInt(fcount), remark));
        }
        resp.sendRedirect(req.getContextPath()+"/index");
    }

    private void del(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        if (Stringutils.isNotEmpty(fid)){
            fDao.delFruitById(Integer.parseInt(fid));
        }
        resp.sendRedirect(req.getContextPath()+"/index");
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        if (Stringutils.isNotEmpty(fid)){
            Fruit fruit = fDao.getFruitById(Integer.parseInt(fid));
            req.setAttribute("fruit", fruit);
        }
        super.processTemplate("edit", req, resp);
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        String fname = req.getParameter("fname");
        String fcount = req.getParameter("fcount");
        String price = req.getParameter("price");
        String remark = req.getParameter("remark");
        if (Stringutils.isNotEmpty(fid, fname, price, fcount, remark)){
            fDao.updateFruit(new Fruit(Integer.parseInt(fid), fname, Integer.parseInt(price),
                    Integer.parseInt(fcount), remark));
        }
        resp.sendRedirect(req.getContextPath()+"/index");

    }
}
