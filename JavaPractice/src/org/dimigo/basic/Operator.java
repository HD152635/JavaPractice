/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author      : 
 * @version     : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary = 1700000,emp = 3,store = 1500;
		long sum=(long)salary*(long)emp*(long)store*12L;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 :" + String.format("%,d원", salary));
		System.out.println("점포 내 직원 수 :" + String.format("%,d명", emp));
		System.out.println("점포 수 :" + String.format("%,d개\n", store));
		
		System.out.println("연간 인건비 :" + String.format("%,d", sum));
	}

}
