/**
 * 
 */
package orp.perform.server;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import orp.perform.server.Hangeul.Dir;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.Writer;
import java.io.FileReader;

/**
 * <pre>
 * org.perform.math
 *    |_Functional
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 17.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class index {
	public static void main(String[] args) {
		  try {
				  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		          BufferedReader reader = new BufferedReader(new FileReader("files/main.ah"));
		           // Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
		           // BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"));) {
		         List<String> code = new ArrayList<>();
		         Storage storage = new Storage();
		         String str;
		         while ((str = reader.readLine()) != null) {
		             code.add(str);
		          }
		         Dir pos = new Dir(0,-1);
		         Dir iMove = new Dir(0,1);
		         do{
		        	 pos.x+=iMove.x;
		        	 pos.y+=iMove.y;
		        	 int uni = (int)(code.get(pos.y).charAt(pos.x)) - '가';
		        	 Hangeul h = new Hangeul(uni,new Dir(0,1));
		        	 int  isEnd = h.isEnd();
		        	 if(!Hangeul.isOn) break;
		        	 iMove = h.execute();
		         } while(true);
		         br.close();
		         reader.close();
		      } catch (Exception e) {
		         e.printStackTrace();
		     }
		  System.out.println("\n프로그램이 종료되었습니다");
	}
	public static int put(String mode){
		try {
			  BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			  String s;
			if(mode.equals("문자")){
				System.out.print("문자를 입력해주세요 : ");
				 s =br1.readLine();
				  return s.charAt(0);
			} else if(mode.equals("정수")){
				System.out.print("정수를 입력해주세요 : ");
				 s =br1.readLine();
				return Integer.parseInt(s);
			}
		}catch(Exception e){
				e.printStackTrace();
		}
		return 0;
	}
}
