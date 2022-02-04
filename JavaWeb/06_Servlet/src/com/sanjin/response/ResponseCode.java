package com.sanjin.response;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author sanjin
 * @date 2022/1/23 下午4:42
 * @description
 */
@WebServlet("/respDemoCode")
public class ResponseCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width = 100;
        int height = 70;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = image.getGraphics();

        graphics.setColor(Color.PINK);
        graphics.fillRect(0, 0, width, height);
        graphics.setColor(Color.blue);
        graphics.drawRect(0, 0, width-1, height-1);

        String str = "abcdefghijklmnopqrstuvwxyz1234567890";
        Random ran = new Random();
        StringBuffer strbf = new StringBuffer();
        for (int i = 1; i <= 4; i++) {
            int index = ran.nextInt(str.length());
            char c = str.charAt(index);
            strbf.append(c);
            graphics.drawString(c+"", width/5*i, height/2);

        }
        HttpSession session = req.getSession();
        session.setAttribute("idcode", new String(strbf));
        System.out.println(session.getAttribute("idcode"));
        graphics.setColor(Color.green);
        for (int i = 0; i <10; i++) {
            int x1 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int x2 = ran.nextInt(width);
            int y2 = ran.nextInt(height);
            graphics.drawLine(x1, y1, x2, y2);
        }


        ServletOutputStream os = resp.getOutputStream();
        ImageIO.write(image, "jpg", os);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
