package ar.unrn.tp7.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class PersonaDao {

	// TODO Auto-generated method stub
	private String DRIVER = "com.mysql.jdbc.Driver";
	private static String URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String DB = "proxy";
	protected static String user = "root";
	protected static String pass = "";
	protected static Connection dbconn;

	public Connection obtenerConexion() {

		try {
			dbconn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			System.out.println("No se ha podido conectar a " + URL_DB + DB + ". " + sqlEx.getMessage());
			System.out.println("Error al cargar el driver");
		}
		return dbconn;
	}

	private void disconnect() {
		if (dbconn != null) {
			try {
				dbconn.close();
				dbconn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Persona personaPorId(int id) {

		try {
			Connection conn = obtenerConexion();
			PreparedStatement statement = conn.prepareStatement("SELECT nombre from personas where id=?");
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			Set<Telefono> telefonos = new ProxySet(id);
			String nombrePersona = null;
			while (result.next()) {
				nombrePersona = result.getString(1);
			}
			return new Persona(id, nombrePersona, telefonos);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			this.disconnect();
		}

	}

}
