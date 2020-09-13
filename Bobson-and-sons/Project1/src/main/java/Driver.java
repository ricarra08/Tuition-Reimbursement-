import java.sql.SQLException;

import com.revature.dao.IdDaoImpl;
import com.revature.util.ConnFactory;

public class Driver {

	public static ConnFactory cf= ConnFactory.getInstance();
	public static void main(String[] args) {
		IdDaoImpl idi = new IdDaoImpl();
		
		try {
			System.out.println(idi.getAllId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
