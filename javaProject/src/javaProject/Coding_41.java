package javaProject;

import java.util.Scanner;
import java.util.Stack;

public class Coding_41 {
	//후위연산식
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_41 t = new Coding_41();
			
			String str = in.next();
			
			System.out.println(t.solution(str));
		}

		public int solution_mine(String str1){
			
			int result = 0;
			Stack<Integer> stack = new Stack<>();
			
	        for (char x : str1.toCharArray()) {
	            char c = x;

	            if (Character.isDigit(c)) {
	                stack.push(c - '0');
	            } else {
	                int operand2 = stack.pop();
	                int operand1 = stack.pop();

	                switch (c) {
	                    case '+':
	                        stack.push(operand1 + operand2);
	                        break;
	                    case '-':
	                        stack.push(operand1 - operand2);
	                        break;
	                    case '*':
	                        stack.push(operand1 * operand2);
	                        break;
	                    case '/':
	                        stack.push(operand1 / operand2);
	                        break;
	                }
	            }
	        }
	        result = stack.pop();
	        return result;
		}
		
		public int solution(String str) {
			
			int answer = 0;
			Stack<Integer> stack = new Stack();
			for(char x : str.toCharArray()) {
			
				if(Character.isDigit(x)) stack.push(x - 48);
				else {
					int rt = stack.pop();
					int lt = stack.pop();
					if(x=='+')stack.push(lt + rt);
					else if(x== '-')stack.push(lt - rt);
					else if(x== '*')stack.push(lt * rt);
					else if(x== '/')stack.push(lt / rt);
							
				}
			}
			answer = stack.get(0);
			
			return answer;
			
		}
}
