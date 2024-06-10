package org.example.demojee;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "TextBrut", value = "/texte-brut")
public class TextBrut extends HttpServlet {
    private String message;

    public void init() {
        message = "Je suis un texte brut";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        PrintWriter out = response.getWriter();
        out.println(message);

    }

    public void destroy() {
    }
}