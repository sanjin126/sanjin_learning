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
 * @date 2022/1/27 下午5:32
 * @description
 */
@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet {

    private FruitDAO fDao = new FruitDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fid = req.getParameter("fid");
        if (Stringutils.isNotEmpty(fid)){
            Fruit fruit = fDao.getFruitById(Integer.parseInt(fid));
            req.setAttribute("fruit", fruit);
        }
        super.processTemplate("edit", req, resp);
    }
}
