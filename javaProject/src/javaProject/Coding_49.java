package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coding_49 {
	//Least Recently Used
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_49 t = new Coding_49();
			
			int N = in.nextInt();
			int M = in.nextInt();
			int [] array = new int [M];
			
			for(int i = 0 ; i<array.length; i++) {
				array[i] = in.nextInt();
			}
			
			for(int x : t.solution(N ,M, array)) System.out.print(x + " ");;
			//System.out.println(t.solution(N , array));
		}

		public List<Integer> solution_mine(int N , int[] array){
			
			List<Integer> list = new ArrayList();
			
			for(int i = 0; i<array.length; i++) {
				
				if(list.contains(array[i])){
					for(int j=0 ; j<list.size(); j++) {
						if(list.get(j) == array[i]) {
							list.remove(j);
						}
					}
					list.add(array[i]);
				}else {
					
					if(list.size() >= N) {
						list.remove(0);
						list.add(array[i]);
					}else {
						list.add(array[i]);
					}
					
				}
				
			}
			List<Integer> reverse_list = new ArrayList();
			for(int i= list.size() -1 ; i>=0; i--) {
				reverse_list.add(list.get(i));
				
			}
			return reverse_list;
			
		}
		
		public int[] solution(int size,int M , int[] arr) {
					
			int[] cache = new int[size];
			
			for(int x : arr) {
				int pos = -1;
				for(int i=0;i<size;i++) if(x==cache[i]) pos = i;
				if(pos == -1) {
					for(int i = size-1; i>=1 ; i--) {
						cache[i] = cache[i-1];
					}
				}
				else {
					for(int i = pos; i>=1;i--) {
						cache[i] = cache[i-1];
					}
				}
				cache[0] = x;
			}
			return cache;
		}
		
}
