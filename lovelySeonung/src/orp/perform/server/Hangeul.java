/**
 * 
 */
package orp.perform.server;

import java.util.Stack;

/**
 * <pre>
 * orp.perform.server
 *    |_hangeul
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 18.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class Hangeul {
	static class Dir {
		int x , y ;
		Dir(int xx,int yy){
			x=xx; y=yy;
		}
	}
	private int cho,jung,jong;
	private Dir move;
	public static boolean isOn = true;
	public static Stack<Integer> idxStack = Storage.stacks.get(0);
	public static String[] TtoNum= {" ㅏㄱ","ㄱㅐㄱ","ㄲㅑㄴ","ㄳㅒㄷ","ㄴㅓㄸ",
																			"ㄵㅔㄹ","ㄶㅕㅁ","ㄷㅖㅂ","ㄹㅗㅃ","ㄺㅘㅅ",
																			"ㄻㅙㅆ","ㄼㅚㅇ","ㄽㅛㅈ","ㄾㅜㅉ","ㄿㅝㅊ",
																			"ㅀㅞㅋ","ㅁㅟㅌ","ㅂㅠㅍ","ㅄㅡㅎ","ㅅㅢ",
																			"ㅆㅣ","ㅇ","ㅈ","ㅊ","ㅋ",
																			"ㅌ","ㅍ","ㅎ"};
	public Hangeul(int uni, Dir move){
		cho = uni / (21*28);
		jung = (uni % (21*28)) / 28;
		jong = uni % 28;
		this.move = move;
//		System.out.println(cho+" "+jung+" "+jong);
//		System.out.printf("%c %c %c\n",TtoNum[cho].charAt(2),TtoNum[jung].charAt(1),TtoNum[jong].charAt(0));
		switch(parseHan(jung,1)){
		case 'ㅏ':
			this.move = new Dir(1,0); break;
		case 'ㅓ':
			this.move = new Dir(-1,0); break;
		case 'ㅗ':
			this.move = new Dir(0,-1); break;
		case 'ㅜ':
			this.move = new Dir(0,1); break;
		case 'ㅑ':
			this.move = new Dir(2,0); break;
		case 'ㅕ':
			this.move = new Dir(-2,0); break;
		case 'ㅛ':
			this.move = new Dir(0,-2); break;
		case 'ㅠ':
			this.move = new Dir(0,2); break;
		case 'ㅣ':
			if(this.move.x == 1)
				this.rvs();
		case 'ㅡ':
			if(this.move.y == 1)
				this.rvs();
		case 'ㅢ':
				this.rvs();
		}
	}
	private char parseHan(int val,int cjj){ return TtoNum[val].charAt(2-cjj);}
	
	public int isEnd(){
		Stack<Integer> store = Storage.stacks.get(jong);
		int T = parseHan(cho,0);
		if(T == 'ㅎ'){
			isOn = false;
			return (store.isEmpty() ?  0 : store.pop() );
		}
		if(T=='ㅇ')
			isOn = false;
		return 0;
	}
	public Dir execute() throws Exception{
		Stack<Integer> store = idxStack;
		int T = parseHan(cho,0);
		switch(T){
		
				
		case 'ㄷ': store.push(store.pop()+store.pop()); break;
		case 'ㄸ': store.push(store.pop()*store.pop()); break;
		case 'ㅌ': store.push(store.pop()-store.pop()); break;
		case 'ㄴ': store.push(store.pop()/store.pop()); break;
		case 'ㄹ': store.push(store.pop()%store.pop()); break;
		
		case 'ㅁ':
			int jongseong1 = parseHan(jong,2);
			switch(jongseong1){
			case 'ㅇ': System.out.printf("%d", store.pop()); break;
			case 'ㅎ':System.out.printf("%c",store.pop()); break;
			default: store.pop(); break;
			} break;
		case 'ㅂ':
			int jongseong2 = parseHan(jong,2);
			switch(jongseong2){
			case 'ㅇ': store.push(index.put("정수"));break;
			case 'ㅎ':store.push(index.put("문자")); break;
			default: store.push(parseInt(jongseong2)); break;
			} break;
		case 'ㅍ':
			int jongseong3 = parseHan(jong,2);
			switch(jongseong3){
			case 'ㅇ': 
				break;
			default: 
				int top = store.pop();
				int sec = store.pop();
				store.push(top); store.push(sec);
				break;
			} break;
			
		case 'ㅅ':
			idxStack = Storage.stacks.get(jong);
			break;
		case 'ㅆ':
			Stack<Integer> jstore = Storage.stacks.get(jong);
			jstore.push( store.pop());
			break;
		case 'ㅈ':
			store.push((store.pop() <= store.pop() ? 1 : 0));
			break;
		case 'ㅊ':
			if(store.pop() == 0)
				this.rvs();
			break;
		default:
				throw new Exception("뜻하지 않은 종료");
		}
		return move;
	}
	private void rvs() {
		move.x*=-1;
		move.y*=-1;
	}
	private int parseInt(int jong){
		int[] jToI = {0,2,4,4,2,5,5,3,5,7,9,9,7,9,9,8,4,4,6,2,4,1,3,4,3,4,4,3};
		return jToI[jong];
	}
}
