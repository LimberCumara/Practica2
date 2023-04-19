package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroLibroServlet")
public class RegistroLibroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");

        // Guardar los valores en una base de datos o en algún otro tipo de almacenamiento persistente
        // ...

        // Mostrar un mensaje de confirmación al usuario
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Confirmación de registro de libro</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>¡El libro se ha registrado correctamente!</h1>");
            out.println("<p>Los datos del libro son:</p>");
            out.println("<ul>");
            out.println("<li>Título: " + titulo + "</li>");
            out.println("<li>Autor: " + autor + "</li>");
            out.println("<li>Resumen: " + resumen + "</li>");
            out.println("<li>Medio: " + medio + "</li>");
            out.println("</ul>");
            out.println("<a href='index.jsp'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
