package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clases {
	private int id;
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Clases> getUsuarios() throws SQLException {
		ArrayList<Clases> usuarios = new ArrayList<>();
		Conector conector = new Conector();
		conector.conectar();

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT id, nombre_apellido FROM usuarios");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Clases usuario = new Clases();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre(resultado.getString("nombre_apellido"));
			usuarios.add(usuario);
		}
		pSt.close();
		conector.cerrar();
		return usuarios;

	}

	public void bajaUsuario(int id) throws ClassNotFoundException {
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("DELETE FROM Usuarios WHERE id=?");
			pSt.setInt(1, id);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void modificarClienteJframe(int id, String Nombre) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE usuarios SET nombre_apellido= ? WHERE id = ?");
			pSt.setString(1, Nombre);
			pSt.setInt(2, id);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void InsertarUsuarios(String Nombre,String dni, String Codigo) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO usuarios (nombre_apellido,dni,codigo) Values (?,?,?)");
			pSt.setString(1, Nombre);
			pSt.setString(2, dni);
			pSt.setString(3, Codigo);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

}
}
