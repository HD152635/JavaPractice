/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 * org.dimigo.io
 *   |_ ArakoMenu
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 16.
 * </pre>
 * 
 * @author      : 디미고인
 * @version     : 1.0
 */
public class ArakoMenu { 
	public static void main(String[] args) { 
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
				BufferedWriter writer = new BufferedWriter(new FileWriter("files/menu.txt")); 
				BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))) {
				// 키보드로 메뉴를 한 줄씩 입력받아 파일에 저장하기
				String result;
				while((result = br.readLine()) != null) {
					writer.write(result);
					writer.newLine();
				}
				writer.flush();
				System.out.println(" <<메뉴 출력>> ");
				while((result = reader.readLine()) != null) { // 1 문자씩 읽음
					System.out.println(result);
				}
	} catch (Exception e) { 
		e.printStackTrace(); 
	}
}
}

