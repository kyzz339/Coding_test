package javaProject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	
	int id;
	int priority;
	
	public Person(int id , int priority) {
	this.id = id;
	this.priority = priority;
	}
	
}

public class Coding_45 {
	//응급
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_45 t = new Coding_45();
		
		int N = in.nextInt();
		int M = in.nextInt();
		int [] array = new int[N];
		
		for(int i = 0; i < N ; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println(t.solution_mine(N , M , array));
	}

	public int solution_mine(int N , int M , int[] array){
		
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<Person>();
		
		for(int i=0 ; i<array.length; i++) {
			Q.offer(new Person(i , array[i]));
		}
		
		while(! Q.isEmpty()) {
			
			Person tmp = Q.poll();
			
			for(Person x : Q) {
				if(tmp.priority < x.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp != null) {
				answer ++;
				if(tmp.id == M) return answer;
			}
			
		}
		
		return answer;
		
	}
	
	public int solution(int n , int m , int[] array) {
		
		int answer = 0;
		Queue<Person> Q = new LinkedList<Person>();
		for(int i=0; i<n;i++) {
			Q.offer(new Person(i , array[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for(Person x : Q) {
				if(x.priority > tmp.priority) {
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				answer ++;
				if(tmp.id == m) return answer;
			}
			
		}
		
		return answer;
	}
}
