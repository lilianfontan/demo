package modeo.dao;

import db.DB;
import modeo.dao.impl.DepartmentDaoJDBC;
import modeo.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmenteDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
