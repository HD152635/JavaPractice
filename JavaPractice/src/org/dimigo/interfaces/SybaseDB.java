package org.dimigo.interfaces;

public class SybaseDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Sybase DB 저장");
	}

	@Override
	public void search() {
		System.out.println("Sybase DB 조회");
	}

	@Override
	public void update() {
		System.out.println("Sybase DB 변경");
	}

	@Override
	public void delete() {
		System.out.println("Sybase DB 삭제");
	}

}
