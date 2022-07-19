package cursoJava;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JDBCTest {
	static JDBC ojdbc;
	final String SELECT_EMPLOYEES_LASTNAME_FIRSTNAME= "SELECT EMPLOYEE_ID, LAST_NAME, FIRST_NAME FROM EMPLOYEES";
	
	@BeforeAll
	public static void inicio()throws SQLException, Exception{
		ojdbc = JDBC.getInstance();
	}
	@AfterAll
	public static void fin()throws Exception{
		ojdbc.closeConnection();
	}
	@Test
	public void testSelectNameLastNameFromEmployees() throws Exception {
		try {
			ResultSet rs = ojdbc.EjecutarQuery(SELECT_EMPLOYEES_LASTNAME_FIRSTNAME);

			try {
				while (rs.next()) {

					int id = rs.getInt(1);
					String lastName = rs.getString(2);
					String name = rs.getString(3);
					System.out.println(id + " " + lastName + " " + name);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
