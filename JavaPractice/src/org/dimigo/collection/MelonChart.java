package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	public static void main(String[] args) {
		int[] acts = {  0,12,23,32,40};
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		for(int action:acts){
			int music = action % 10;
			System.out.print("-- << ");
			switch(action/10){
			case 0:
				System.out.print("멜론 차트"); break;
			case 1:
				System.out.printf("%d위 곡 추가",music);
				list.add(music-1,new Music("SIGNAL","트와이스")); break;
			case 2:
				System.out.printf("%d위 곡 변경",music);
				list.set(music-1, new Music("팔레트","아이유")); break;
			case 3:
				System.out.printf("%d위 곡 삭제",music);
				list.remove(music-1); break;
			case 4:
				System.out.print("전체 리스트 삭제");
				list.clear(); break;
			}
			System.out.println(" >> --");
			printList(list);
		}
	}
	public static void printList(List<Music> list){
		for(Music music:list){
			System.out.print(list.indexOf(music)+1+". ");
			System.out.println(music);
		} System.out.println();
	}
}
