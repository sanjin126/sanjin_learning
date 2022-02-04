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
import java.io.IOException;

/**
 * @author sanjin
 * @date 2022/1/27 下午7:19
 * @description
 */
@WebServlet("/add.do")
public class AddServlet extends ViewBaseServlet {
    private FruitDAO fDao = new FruitDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
}
