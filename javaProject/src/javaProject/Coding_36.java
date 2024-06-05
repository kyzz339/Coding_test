package javaProject;

import java.util.Scanner;

public class Coding_36 {
	//올바른 괄호
	//닫히는 괄호가 열리는 괄호보다 먼저 나올 경우 "NO" return 열리는 괄호가 나올떄마다 cnt 올리고 그 수만큼 닫히는 괄호 나올시 cnt 차감 
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_36 t = new Coding_36();
			
			String str1 = in.next();
			
			
			System.out.println(t.solution(str1));
		}

		public String solution(String str1){
		
		String answer = "";
		int cnt = 0;
		for(char x : str1.toCharArray()) {
		
			if(cnt <= 0) {
				if(x == ')') {
					return "NO";
				}else if(x=='(') {
					cnt ++;
				}
			}else {
				if(x == '(') {
					cnt ++;
				}else if(x == ')') {
					cnt --;
				}
			}
		}
		if(cnt == 0) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		
		
		return answer;
		
		}
}
