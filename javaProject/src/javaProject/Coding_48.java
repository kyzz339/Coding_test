package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coding_48 {
	//삽입정렬
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_48 t = new Coding_48();
			
			int N = in.nextInt();
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
			
			for(int i=1; i<list.size(); i++) {
				
				int tmp = list.get(i);
				
				int j ;
				for(j = i -1; j>=0 && tmp < list.get(j) ; j--) {
					
					list.set(j+1, list.get(j));
				}
				
				list.set(j+1, tmp);
			}
			
			return list;
			
		}
		
		public int[] solution(int n , int[] arr) {
			
			for(int i = 1 ; i<n; i++) {
				int tmp = arr[i];
				int j ;
				for(j=i -1; j>=0; j--) {
					if(arr[j] > arr[tmp]) arr[j + 1] = arr[j];
					else break;
				}
				arr[j + 1] = tmp;
				
			}
			
			
			return arr;
		}
		
		

}
