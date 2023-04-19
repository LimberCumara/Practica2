package com.emergentes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EnviarCorreoServlet")
public class EnviarCorreoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String mensaje = request.getParameter("mensaje");
        String enviarCopia = request.getParameter("enviar-copia");

        // Simular envío de correo
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Mensaje: " + mensaje);

        if (enviarCopia != null && enviarCopia.equals("on")) {
            System.out.println("Se enviará una copia a " + correo);
        }

        // Mostrar mensaje de confirmación
        String mensajeConfirmacion = "Su mensaje ha sido enviado correctamente.";
        try {
            response.setContentType("text/html");
            response.getWriter().println("<html><body><h1>" + mensajeConfirmacion + "</h1></body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

