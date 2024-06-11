package org.example.demojee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "exercice3", value="/exercice3")
public class ServletListePersonne extends HttpServlet {

    private List<String> personnes;


    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        personnes.add("John");
        personnes.add(prenom = "Florian");
        personnes.add(String.valueOf(age = 28));
        personnes.add(nom = "Tatou");
        personnes.add(prenom = "François");
        personnes.add(String.valueOf(age = 29));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        getServletContext().getRequestDispatcher("/personneJsp.jsp").forward(req, resp);
    }


}
