package org.dimigo.interfaces;

public interface IDBManager {
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class cls = Class.forName("org.dimigo.interfaces." + database + "DB");
		IDBManager db = (IDBManager) cls.newInstance();
		
		return db;
	}
}
