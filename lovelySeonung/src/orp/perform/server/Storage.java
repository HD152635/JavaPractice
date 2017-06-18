/**
 * 
 */
package orp.perform.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * <pre>
 * orp.perform.server
 *    |_Storage
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 18.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class Storage {
	public  static List<Stack<Integer>> stacks = new ArrayList<>();
	public static Queue<Integer> o;
	Storage(){
		for(int i=0;i<30;i++) stacks.add(new Stack<>());
	}
}
