package com.ej.programmers;

/*
 * water_melon함수는 정수 n을 매개변수로 입력받습니다.
길이가 n이고, 수박수박수...와 같은 패턴을 유지하는 문자열을 리턴하도록 함수를 완성하세요.

예를들어 n이 4이면 '수박수박'을 리턴하고 3이라면 '수박수'를 리턴하면 됩니다.
*/

public class WaterMelon {
	public String watermelon(int n){
		String[] wm = {"수", "박"};
    StringBuffer sb = new StringBuffer();
   	for(int i = 0; i<n; i++){
      	sb.append(wm[i%2]);
    }
    String s = sb.toString();
 		return s;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}