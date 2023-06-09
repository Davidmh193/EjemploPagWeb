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
 * Servlet implementation class Modificar
 */
@WebServlet("/Modificar")
public class Modificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modificar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =  Integer.parseInt(request.getParameter("id"));
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
			cliente.modificarCliente(id, nombre, dni, codigo, password,fecha);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	request.getRequestDispatcher("ModificarUsuarios").forward(request,response);
	
		
		
	}

}
