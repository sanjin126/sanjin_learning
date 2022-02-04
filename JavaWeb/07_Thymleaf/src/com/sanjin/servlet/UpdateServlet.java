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
import java.net.ResponseCache;

/**
 * @author sanjin
 * @date 2022/1/27 下午6:10
 * @description
 */
@WebServlet("/update.do")
public class UpdateServlet extends ViewBaseServlet {
    private FruitDAO fDao = new FruitDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8"); //解决post
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
