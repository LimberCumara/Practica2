package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EncuestaServlet")
public class EncuestaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EncuestaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String sistema = request.getParameter("sistema");
        String comentario = request.getParameter("comentario");
    
        // Aquí se podrían agregar las acciones correspondientes
        // para procesar los datos recibidos del formulario
    
        // Enviar la respuesta al cliente en el mismo servlet
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Confirmación de encuesta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Confirmación de encuesta</h1>");
            out.println("<p>Los datos recibidos son:</p>");
            out.println("<ul>");
            out.println("<li>Nombre: " + nombre + "</li>");
            out.println("<li>Sistema operativo favorito: " + sistema + "</li>");
            out.println("<li>Comentario: " + comentario + "</li>");
            out.println("</ul>");
            out.println("<p>Gracias por participar en la encuesta.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}


