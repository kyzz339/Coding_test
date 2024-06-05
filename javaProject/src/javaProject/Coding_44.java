package javaProject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Coding_44 {
//공주 구하기
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_44 t = new Coding_44();
		
		String str1 = in.next();
		String str2 = in.next();
		System.out.println(t.solution(str1 , str2));
	}

	public String solution_mine(String str1 , String str2){
		
		String answer = "NO";
		Queue<Character>class_Queue = new LinkedList<Character>(); 
		
		for(char x : str1.toCharArray()) {
			class_Queue.add(x);
		}
		
		for(char x : str2.toCharArray()) {
			
			if(x == class_Queue.peek()) {
				class_Queue.remove();
			}
			
			if(class_Queue.size() == 0) return "YES";
			
		}
		
		
		return answer;
		
	}
	
	public String solution(String need , String plan) {
		
		String answer = "YES";
		Queue<Character>Q = new LinkedList<Character>();
		
		for(char x : need.toCharArray()) Q.offer(x);
		
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) return "NO";
			}
		}
		
		if(!Q.isEmpty()) return "NO";		
		return answer;
	}
}
