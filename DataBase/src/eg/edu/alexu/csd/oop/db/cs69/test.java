package eg.edu.alexu.csd.oop.db.cs69;

import java.sql.SQLException;

import eg.edu.alexu.csd.oop.db.cs69.Model.MyDatabase;

public class test {
	public static void main(String[] args) throws SQLException {


		final MyDatabase m = new MyDatabase();
	final String s = m.createDatabase("nn11",true);
	try {
		m.executeStructureQuery(
				"Create TABLE table_name1(StudentName varchar, Department varchar, City varchar, ID int, Country varchar)");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int z = m.executeUpdateQuery(
			"INSERT INTO table_name1 (StudentName, Department, City, ID, Country)VALUES ('Eshraq Ibrahim', 'CSED20', 'ALex', '12', 'Egypt')");
	z = m.executeUpdateQuery(
			"INSERT INTO table_name1 VALUES ('Hanan Samir', 'CSED20', 'ALex', '20', 'Egypt')");
	z = m.executeUpdateQuery(
			"INSERT INTO table_name1 VALUES ('Rowan Adel', 'CSED20', 'ALex', '25', 'Egypt')");
	z = m.executeUpdateQuery(
			"INSERT INTO table_name1 VALUES ('Nancy Abdelkarem', 'CSED20', 'ALex', '69', 'Egypt')");
	Object[][] array = m.executeQuery("SELECT * FROM table_name1");
	array = m.executeQuery("SELECT StudentName , ID FROM table_name1");
	z = m.executeUpdateQuery("UPDATE table_name1 SET City= 'Frankfurt' ");
	System.out.println(z);
	z=m.executeUpdateQuery("DELETE FROM table_name1 WHERE StudentName = 'Hanan Samir'");
	
   
	}


}
