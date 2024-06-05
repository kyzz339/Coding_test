package javaProject;

import java.util.Scanner;

public class Coding_39 {
	//괄호문자제거
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_39 t = new Coding_39();
			
			String str1 = in.next();
			
			
			System.out.println(t.solution(str1));
		}

		public String solution(String str1){
		
		String answer = "";
		int cnt = 0;
		for(char x : str1.toCharArray()) {
		
				if(x == '(') {
					cnt++;
				}else if(x == ')') {
					cnt --;
				}else {
					if(cnt <= 0) {
						answer = answer + x;
					}
				}
		
			
		}
		return answer;
		
		}
}
