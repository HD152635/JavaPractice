package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ExampleException {
	public static void main(String[] args) throws Exception{
		unchecked("abc");
		checked();
	}
	// Unchecked Exception : 컴파일러가 강제적으로 예외처리를 요구하지 않음.
	private static void unchecked(String str) throws Exception{
		if(str==null) throw new Exception("문자열이 입력되지 않았습니다.");
		if(str.length()<5) throw new Exception("문자열의 길이는 5이상이어야 합니다.");
		System.out.println(str.substring(0,5));
	}
	private static void checked() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력값  => ");
		System.out.println("출력값 => " + br.readLine());
	}
}
