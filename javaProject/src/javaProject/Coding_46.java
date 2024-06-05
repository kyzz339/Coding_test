package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coding_46 {
	//선택정렬
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_46 t = new Coding_46();
			
			int N = in.nextInt();
			int [] array = new int[N];
			
			for(int i = 0 ; i<array.length; i++) {
				array[i] = in.nextInt();
			}
			
			for(int x : t.solution(N, array)) System.out.print(x + " ");;
			//System.out.println(t.solution(N , array));
		}

		public List<Integer> solution(int N , int[] array){
			
			List<Integer> list = new ArrayList();
			
			for(int x : array) list.add(x);
			
			 for (int i = 0; i < list.size() - 1; i++) {
		            int minIndex = i;
		            for (int j = i + 1; j < list.size(); j++) {
		                if (list.get(j) < list.get(minIndex)) {
		                    minIndex = j;
		                }
		            }
		            int temp = list.get(minIndex);
		            list.set(minIndex, list.get(i));
		            list.set(i, temp);
		        }
			
			return list;
			
		}
}
