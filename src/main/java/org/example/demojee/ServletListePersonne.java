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

    private List<Personne> personnes;


    @Override
    public void init() throws ServletException {
        personnes = new ArrayList<>();
        personnes.add(new Personne("John", "Do", 25));
        personnes.add(new Personne("John", "Do", 25));
        personnes.add(new Personne("John", "Do", 25));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personnes", personnes);
        getServletContext().getRequestDispatcher("/personneJsp.jsp").forward(req, resp);
    }


}
