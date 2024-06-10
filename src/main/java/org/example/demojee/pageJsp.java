package org.example.demojee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "pageJsp", value = "/page-jsp")
public class pageJsp extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Ceci tranfère la requête vers une page JSP";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/pageJsp.jsp").forward(req, resp);
    }


}
