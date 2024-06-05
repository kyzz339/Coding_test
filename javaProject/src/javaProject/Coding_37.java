package javaProject;

import java.util.Scanner;
import java.util.Stack;

public class Coding_37 {
	//괄호문자제거
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_37 t = new Coding_37();
			
			String str1 = in.next();
			
			
			System.out.println(t.solution(str1));
		}

		public String solution_mine(String str1){
		
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
		//스택 사용 해설 -Last In First Out	
		public String solution(String str) {
			
			String answer = "YES";
			Stack<Character> stack = new Stack<>();
			
			for(char x : str.toCharArray()) {
				if(x == '(') stack.push(x);
				else {
					if(stack.isEmpty()) return "NO";
					stack.pop();
				}
			}
			if(!stack.isEmpty()) return "NO";
			return answer;
		}
}
