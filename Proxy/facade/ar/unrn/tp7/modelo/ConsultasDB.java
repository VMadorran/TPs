package ar.unrn.tp7.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsultasDB implements DBFacade {

	private String DRIVER = "com.mysql.jdbc.Driver";
	private String URL_DB = "jdbc:mysql://localhost:3306/proxy";
	private String user = "root";
	private String pass = "";
	private static Connection conn;

	@Override
	public void open() {
		// TODO Auto-generated method stub
		try {
			conn = DriverManager.getConnection(URL_DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			throw new RuntimeException("Error al cargar el driver" + sqlEx.getMessage());

		}
	}

	@Override
	public List<Map<String, String>> queryResultAsAsociation(String sql) {
		// TODO Auto-generated method stub
		List<Map<String, String>> lista = new ArrayList<Map<String, String>>();
		Map<String, String> mapa = new HashMap<String, String>();

		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			if (rs.next()) {

				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					mapa.put(rs.getMetaData().getColumnName(i), rs.getString(i));
				}
				lista.add(mapa);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Error con la consulta o la conexion no existe " + e.getMessage());
		}

		return lista;

	}

	@Override
	public List<String[]> queryResultAsArray(String sql) {
		// TODO Auto-generated method stub

		List<String[]> lista = new ArrayList<String[]>();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);

			ResultSet rs = statement.executeQuery();

			if (rs.next()) {

				for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
					lista.add(new String[] { rs.getString(i) });
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Error con la consulta o la conexion no existe " + e.getMessage());

		}

		return lista;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
