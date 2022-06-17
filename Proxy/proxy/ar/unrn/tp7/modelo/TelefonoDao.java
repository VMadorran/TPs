package ar.unrn.tp7.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefonoDao {

	private int idPersona;
	private String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String DB = "proxy";
	protected static String user = "root";
	protected static String pass = "";
	protected static Connection conn;

	public Connection obtenerConexion() {

		try {
			conn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			System.out.println("No se ha podido conectar a " + URL_DB + DB + ". " + sqlEx.getMessage());
			System.out.println("Error al cargar el driver");
		}
		return conn;
	}

	private static void disconnect() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<Telefono> telefonosPorId(int id) {

		List<Telefono> telefonos = new ArrayList<Telefono>();

		try {
			Connection conn = obtenerConexion();
			PreparedStatement statement = conn.prepareStatement("select numero from telefonos where id_persona=?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				telefonos.add(new Telefono(result.getString(1)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return telefonos;

	}
}
