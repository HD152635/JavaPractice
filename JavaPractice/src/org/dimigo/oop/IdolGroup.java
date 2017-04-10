package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] groupname = {"빅뱅","2NE1","걸스데이"};
		String[][] NameinG = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"}
		};
		for(int i=0;i<groupname.length;i++,System.out.println()){
			System.out.println("<< "+groupname[i]+" >>");
			for(int j=0;j<NameinG[i].length;j++){
				System.out.println(NameinG[i][j]);
			}
		}
	}
}
