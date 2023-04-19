package com.emergentes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InscripcionServlet")
public class InscripcionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public InscripcionServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los valores enviados por el formulario
        String fecha = request.getParameter("fecha");
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String turno = request.getParameter("turno");
        String[] temas = request.getParameterValues("temas");

        try {
            // Guardar los valores en una base de datos o en algún otro tipo de almacenamiento persistente
            // ...

            // Mostrar un mensaje de confirmación al usuario
            String mensaje = "¡Gracias por inscribirte en el seminario!";
            mensaje += "<br>Fecha: " + fecha;
            mensaje += "<br>Nombre: " + nombre;
            mensaje += "<br>Apellidos: " + apellidos;
            mensaje += "<br>Turno: " + turno;
            mensaje += "<br>Temas:";
            if (temas != null) {
                for (String tema : temas) {
                    mensaje += "<br>- " + tema;
                }
            }
            // Mostrar el mensaje de confirmación en la respuesta HTTP
            response.setContentType("text/html");
            response.getWriter().println("<html><head><title>Confirmación de inscripción</title></head><body>" + mensaje + "</body></html>");
        } catch (Exception ex) {
            // En caso de error, mostrar un mensaje de error al usuario
            String mensaje = "Lo siento, ha ocurrido un error al procesar la solicitud. Por favor, inténtelo de nuevo más tarde.";
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}



