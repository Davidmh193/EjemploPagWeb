package Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Clases.Clases;

/**
 * Servlet implementation class Insertar
 */
@WebServlet("/Insertar")
public class Insertar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Insertar() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.getRequestDispatcher("InsertarUsuarios.jsp").forward(request,response);
	}
	
	

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String nombre = request.getParameter("nombre");
			String dni = request.getParameter("dni");
			String codigo = request.getParameter("codigo");
			Clases cliente = new Clases();
			
			try {
				cliente.InsertarUsuarios(nombre, dni, codigo);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		request.getRequestDispatcher("MenuInsertar").forward(request,response);
		
	}

}
