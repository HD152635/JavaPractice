package org.dimigo.interfaces;

public class DBTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String[] dbChanges = { "전","후","Sybase","Oracle"};
		for(int i=0;i<2;i++){
			System.out.println(String.format("<<변경 %s>>", dbChanges[i]));
			crud(IDBManager.getDBObject(dbChanges[i+2]));
			System.out.println();
		}
	}
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
