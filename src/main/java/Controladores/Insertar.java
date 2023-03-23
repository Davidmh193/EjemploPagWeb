package Controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
			String password = request.getParameter("password");
			String Fecha_Login = request.getParameter("fecha_login");
			Clases cliente = new Clases();
	        java.util.Date fecha = null;
			
	
	        try {
	        	fecha = new SimpleDateFormat("yyyy-MM-dd").parse(Fecha_Login);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
			try {
				cliente.InsertarUsuarios(nombre, dni, codigo,password ,fecha);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		request.getRequestDispatcher("MenuInsertar").forward(request,response);
		
	}

}
