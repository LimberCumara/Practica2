package com.emergentes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        // Guardar los valores en una base de datos o en algún otro tipo de almacenamiento persistente
        // ...

        // Mostrar un mensaje de confirmación al usuario
        String mensaje = "¡Gracias por registrarte en nuestra aplicación!";
        request.setAttribute("mensaje", mensaje);
        
        // Mostrar los datos del usuario registrado
        String datos = "Nombre: " + nombre + "\n" +
                       "Apellidos: " + apellidos + "\n" +
                       "Correo electrónico: " + correo + "\n" +
                       "Contraseña: " + contrasena;
        request.setAttribute("datos", datos);
        
        // Enviar la respuesta al usuario
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(mensaje + "\n\n" + datos);
    }

}

