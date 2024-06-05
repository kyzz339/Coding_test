package javaProject;

import java.util.Scanner;
import java.util.Stack;

public class Coding_38 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_38 t = new Coding_38();
		
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
	
	public String solution(String str1) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		for(char x : str1.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '('); //pop()꺼낸 값을 리턴한다.
			}else stack.push(x);
		}
		for(int i=0; i<stack.size();i++) answer +=stack.get(i);
		return answer;
	}
}
