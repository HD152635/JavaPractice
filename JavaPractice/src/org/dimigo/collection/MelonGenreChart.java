package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args) {
		int[] acts = {  0,22,31,40 };
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", new ArrayList<Music>());
		map.put("댄스", new ArrayList<Music>());
		map.get("발라드").add(new Music("팔레트","아이유"));
		map.get("댄스").add(new Music("I LUV IT","PSY"));
		map.get("댄스").add(new Music("맞지?","언니쓰"));
		for(int action:acts){
			int music = action % 10;
			System.out.print("-- << ");
			switch(action/10){
			case 0:
				System.out.print("멜론 차트"); break;
			case 1:
				System.out.printf("%d위 곡 추가",music);
			case 2:
				System.out.printf("댄스 %d위 곡 변경",music);
				map.get("댄스").set(music-1, new Music("SIGNAL","트와이스")); break;
			case 3:
				System.out.printf("댄스 %d위 곡 삭제",music);
				map.get("댄스").remove(music-1); break;
			case 4:
				System.out.print("전체 리스트 삭제");
				map.clear(); break;
			}
			System.out.println(" >> --");
			printMap(map);
		}
	}
	public static void printMap(Map<String, List<Music>> map){
		for(String key:map.keySet()){
			System.out.println(String.format("[%s]", key));
			List<Music> list = map.get(key);
			for(Music music:list){
				System.out.print(list.indexOf(music)+1+". ");
				System.out.println(music);
			}
		}System.out.println();
	}
}
