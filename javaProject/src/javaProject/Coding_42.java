package javaProject;

import java.util.Scanner;
import java.util.Stack;

public class Coding_42 {
	//쇠막대기 자르기
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_42 t = new Coding_42();
			
			String str = in.next();
			System.out.println(t.solution(str));
		}

		public int solution_mine(String str1){
			
			int answer = 0;
			char past_Char ='(';
			
			Stack<Character> stack = new Stack();
		
			for(char x : str1.toCharArray()) {
				
				if(x == '(') {
					stack.push(x);
					
				}else if(x == ')'){
					 stack.pop();
					
					if( past_Char == '(') {
						answer = answer + stack.size();
					}else if(past_Char == ')'){
						answer = answer + 1;
					}
					
				}
				past_Char = x;
			}
			
			return answer;
			
		}
		
		public int solution(String str1) {
			int answer = 0;
			Stack<Character> stack = new Stack();
			
			for(int i = 0 ; i<str1.length(); i++) {
			
				if(str1.charAt(i) == '(') stack.push('(');
				else { 
					stack.pop();
					if(str1.charAt(i-1) == '(') answer  += stack.size();
					else answer ++;
				}
			}
			
			return answer;
		}
}
