package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] q = {"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
		String[] a = {"빅뱅","조인성","응용 프로그래밍"};
		StringBuilder sb = new StringBuilder("<< 결과 출력 >>\n");
		for(int i=0;i<3;i++){
			System.out.println(q[i]);
			String ans = scanner.nextLine();
			System.out.println((a[i].equals(ans))?"정답입니다!":"틀렸습니다!");
			sb.append(q[i].substring(2)).append(a[i]).append("입니다.\n");
		}
		System.out.println(sb);
	}
}
