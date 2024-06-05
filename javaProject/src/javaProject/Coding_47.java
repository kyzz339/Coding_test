package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coding_47 {

	//버블정렬
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_47 t = new Coding_47();
			
			int N =in.nextInt();
			int [] array = new int[N];
			
			for(int i = 0 ; i<array.length; i++) {
				array[i] = in.nextInt();
			}
			
			for(int x : t.solution(N, array)) System.out.print(x + " ");;
			//System.out.println(t.solution(N , array));
		}

		public List<Integer> solution_mine(int N , int[] array){
			
			List<Integer> list = new ArrayList();
			
			for(int x : array) list.add(x);
			
			for(int i=0; i<array.length; i++) {
				
				for(int j = i+1; j<array.length; j++) {
					
					if(list.get(i) > list.get(j)) {
						
						int tmp = list.get(i);
						
						list.set(i, list.get(j));
						list.set(j, tmp);
						
					}
					
				}
				
			}
			
			return list;
			
		}
		
public int[] solution(int n , int[] arr){
			
			for(int i=0 ; i<n -1 ; i++) {
				int idx = i;
				for(int j = i + 1; j<n ; j++) {
					if(arr[j] < arr[idx])  idx = j;
				}
				
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
			}
			
			return arr;
			
		}

}
