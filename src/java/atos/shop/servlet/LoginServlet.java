/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atos.shop.servlet;

import atos.shop.entity.Client;
import atos.shop.service.ClientService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quico
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/connexion"})
public class LoginServlet extends HttpServlet {

    private ClientService service = new ClientService();
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. connexion
        String pseudo = req.getParameter("login");
        String mdp = req.getParameter("mdp");
        Client cli = service.connexion(pseudo, mdp);
        if( cli==null ){
            
            throw new RuntimeException("Erreur de connexion!");
        }else{// Trouvé
            
            // Enregiste client en sesion
            req.getSession().setAttribute("clientConnecte", cli);
            resp.sendRedirect("home");
        }
        
    }

    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    
}
