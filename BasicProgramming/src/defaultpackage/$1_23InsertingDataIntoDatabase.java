package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class $1_23InsertingDataIntoDatabase {
		public static void main(String[] args) throws ClassNotFoundException {
		try {
		//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","HR","hr");
		Statement statement = connection.createStatement();
		//int update = statement.executeUpdate("Insert into sample values(102,'Renu','11years')");
		ResultSet s = statement.executeQuery("Select first_name from employees");
		ResultSet s2 = statement.executeQuery("Select last_name from employees");
		
		List<String> sampleList = new ArrayList();
		List<String> sl2 = new ArrayList();
		while(s.next()) {
			sampleList.add(s.getString("first_name"));
		}
		while(s2.next()) {
			sl2.add(s2.getString("last_name"));
		}
		editList(sampleList,sl2);
		String[] stringList = sl2.toArray(new String[sl2.size()]);
		//Collections.sort(sampleList);
		for(String i:sl2)
		System.out.printf("%s ",i);
		
		
		System.out.println();
		System.out.println(Collections.frequency(sl2, "Taylor"));
		
		Collections.addAll(sampleList, stringList);
		Boolean tof = Collections.disjoint(sampleList, sl2);
		System.out.println(tof);
		System.out.println();
		
		Collections.sort(sampleList);
		//Collections.reverse(sampleList);
		for(String i:sampleList)
			System.out.printf("%s ",i);
		
			
			/*  
			  }*/
		
			 
		
		//System.out.println(s.next());
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		}
		public static void editList(Collection<String> sampleList, Collection<String> sl2) {
			Iterator<String> it = sampleList.iterator(); 
			  while(it.hasNext()) {
				  System.out.println((sl2.contains("Whalen")));
			  if(sl2.contains("Whalen")) { 
				  it.remove(); 
				  } 
		}
		}
		


}
