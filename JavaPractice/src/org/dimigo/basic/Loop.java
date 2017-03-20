/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 * @author      : seonung ha
 * @version     : 1.0
 */
public class Loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = {"농민", "영주", "기사", "마법사"};
		int choice,a=100;
		
		do
		{
			System.out.println("--------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9.종료");
			System.out.println("=== 당신의 선택은? ");
			System.out.printf("메뉴 입력 =>");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1 : 
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",a+10);
				a+=10;
				break;
			case 2 :
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",a-10);
				a-=10;
				break;
			case 3 :
				int num = new Random().nextInt(4);
				System.out.println(arr[num]+"(으)로 설정되었습니다.");
				break;
			case 9 :
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
			}
		}  while(choice != 9);
	}

}
