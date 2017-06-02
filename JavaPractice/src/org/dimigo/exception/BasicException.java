package org.dimigo.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicException {
	public static void main(String[] args) {
		System.out.println("입력한 숫자 : " + input());
	}
	private static int input() {
		Scanner scanner = new Scanner(System.in);
		try {
		
		System.out.print("숫자 입력 => ");
		int n= scanner.nextInt();
		
		String s = null;
		System.out.println(s.length());
		
		return n;
		} catch(InputMismatchException ime){
//			InputMismatchException ime = new InputMismatchException();
			System.out.println("숫자를 입력하세요.");
			return 0;
		} finally {
			System.out.println("finally execute");
			scanner.close();
		}
	}
}

