package Clases;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clases {
	private int id;
	private String nombre;
	private String dni;
	private String codigo;
	private String password;
	private Date Fecha_login;


	public Date getFecha_login() {
		return Fecha_login;
	}

	public void setFecha_login(Date fecha_login) {
		this.Fecha_login = fecha_login;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

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

		PreparedStatement pSt = conector.getCon().prepareStatement("SELECT id, nombre_apellido,password FROM usuarios");
		ResultSet resultado = pSt.executeQuery();
		while (resultado.next()) {
			Clases usuario = new Clases();
			usuario.setId(resultado.getInt("id"));
			usuario.setNombre(resultado.getString("nombre_apellido"));
			usuario.setPassword(resultado.getString("password"));
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

	public void modificarCliente(int id, String Nombre,String dni, String codigo,String password, Date Fecha_login) throws ClassNotFoundException {

		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("UPDATE usuarios SET nombre_apellido= ?, dni=? ,codigo=?, password=?,fecha_login=?  WHERE id = ?");
			pSt.setString(1, Nombre);
			pSt.setString(2, dni);
			pSt.setString(3, codigo);
			pSt.setString(4, password);
			pSt.setDate(5, new java.sql.Date( Fecha_login.getTime()));
			pSt.setInt(6, id);
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void InsertarUsuarios(String Nombre,String dni, String Codigo,String password, Date Fecha_login) throws ClassNotFoundException{
		try {
			Conector conector = new Conector();
			conector.conectar();

			PreparedStatement pSt = conector.getCon().prepareStatement("INSERT INTO usuarios (nombre_apellido, dni, codigo, password, fecha_login) Values (?,?,?,?,?)");
			pSt.setString(1, Nombre);
			pSt.setString(2, dni);
			pSt.setString(3, Codigo);
			pSt.setString(4, password);
			pSt.setDate(5, new java.sql.Date( Fecha_login.getTime()));
			pSt.execute();
		} catch (SQLException e) {

			e.printStackTrace();
		}

}
}
