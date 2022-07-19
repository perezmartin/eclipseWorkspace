package cursoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	private static Connection conn;
	private static JDBC instancia;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USUARIO = "hr";
	private static final String PASSWORD = "hr";

	
	public static JDBC getInstance() {
		if (instancia == null) {
			instancia = new JDBC();
		}
		return instancia;

	}

	private JDBC() {
		this.conexion();
	}

	private void conexion() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("no jdbc driver");
			return;
		}
		System.out.println("jdbc driver registred");

		try {
			conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
			System.out.println("conectado!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sin conexion");
			return;
		}
	}

	public int Ejecutar(String sql) throws Exception {

		System.out.println("Ejecutar: " + sql);
		Statement stm = null;
		int retorno;
		try {
			stm = conn.createStatement();
			retorno = stm.executeUpdate(sql);
		} catch (SQLException e) {
			throw (new Exception("error en " + sql));
		} finally {
			// closeStatement(stm);
		}
		return retorno;

	}

	public ResultSet EjecutarQuery(String sql) throws Exception {

		System.out.println("EjecutarQuery: " + sql);
		Statement stm = null;
		ResultSet retorno;
		try {
			stm = conn.createStatement();
			retorno = stm.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw (new Exception("error en " + sql));
		} finally {
			// closeStatement(stm);
		}
		return retorno;

	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		
	}

}