package com.revature.dao;

import java.util.List;
import java.sql.SQLException;
import com.revature.beans.Id;

public interface IdDao {
	public List<Id> getAllId() throws SQLException, ClassNotFoundException;
	
}
