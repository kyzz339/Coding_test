package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Coding_50 {
	//중복 확인
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_50 t = new Coding_50();
			
			int N = in.nextInt();
			
			int [] array = new int [N];
			
			for(int i = 0 ; i<array.length; i++) {
				array[i] = in.nextInt();
			}
			
			//for(int x : t.solution(N, array)) xystem.out.print(x + " ");;
			System.out.println(t.solution(N , array));
		}

		public String solution_mine(int N , int[] array){
			
			String answer = "U";
			List<Integer> list = new ArrayList<Integer>();
			
			for(int x : array) list.add(x);
			
			for(int i=0 ; i<list.size(); i++) {
				int number = list.remove(i);
				
				if(list.contains(number)) return "D";
			
				list.add(array[i]);
			}
			return answer;
		}
		
		public String solution(int n , int[] arr) {
			
			String answer = "U";
			
			Arrays.sort(arr);
			for(int i=0; i<n-1; i++) {
				if(arr[i] == arr[i+1]) return "D";
			}
			
			return answer;
		}
		
		
}
