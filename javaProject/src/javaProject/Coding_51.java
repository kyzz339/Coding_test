package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Coding_51 {
	//장난꾸러기
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_51 t = new Coding_51();
			
			int N = in.nextInt();
			
			int [] array = new int[N];
			
			for(int i = 0 ; i<array.length; i++) {
				array[i] = in.nextInt();
			}
			
			for(int x : t.solution(N, array)) System.out.print(x + " ");;
			//System.out.println(t.solution(N , array));
		}

		public List<Integer> solution_mine(int N , int[] array){
			
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> answer = new ArrayList<Integer>();
			for(int x: array) list.add(x);
			
			for(int i=1; i<list.size(); i++) {
				
				if(list.get( i- 1) > list.get(i) && answer.size() == 1) {
					answer.add(i + 1);
				}
				
				if(list.get( i- 1) > list.get(i) && answer.size() == 0) {
					answer.add(i);
				}
				
				if(i == list.size() - 1 && answer.size() == 1) answer.add(i);
				
			}
			
			
			return answer;
			
		}
		
		public ArrayList<Integer> solution(int n , int[] arr) {
			ArrayList<Integer> answer = new ArrayList<Integer>();
			
			int[] tmp = arr.clone();
			Arrays.sort(tmp);
			
			for(int i=0 ; i<n ; i++) {
				if(arr[i] != tmp[i]) answer.add(i+1);
			}
			
			return answer;
		}
}
