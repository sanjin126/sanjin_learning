package com.sanjin.servlet;

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
 * @date 2022/1/27 下午7:03
 * @description
 */
@WebServlet("/del.do")
public class DelServlet extends ViewBaseServlet {

    private FruitDAO fDao= new FruitDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        if (Stringutils.isNotEmpty(fid)){
            fDao.delFruitById(Integer.parseInt(fid));
        }
        resp.sendRedirect(req.getContextPath()+"/index");
    }
}
