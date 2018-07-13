/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quico
 */
@WebServlet(name = "ChangeStyleServlet", urlPatterns = {"/changeStyle"})
public class ChangeStyleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        // Définit cookie à partir du param d'url "style"
        Cookie cookie = new Cookie("theme", req.getParameter("style"));
        cookie.setMaxAge(60*60*24*30);
        resp.addCookie( cookie );

        // Redirection vers template
        resp.sendRedirect("_TEMPLATE.jsp");
    }

    
}
