package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//두 배열 합치기 -투 포인터 (Two Pointer Algorithm)
public class Coding_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_25 t = new Coding_25();
		
		int c = in.nextInt();
		int [] arr_1 = new int[c];
		
		for(int i=0; i<arr_1.length;i++) {
			arr_1[i] = in.nextInt();
		}
		
		int d = in.nextInt();
		int [] arr_2 = new int[d];
		
		for(int i=0; i<arr_2.length;i++) {
			arr_2[i] = in.nextInt();
		}
		
		
		for(int x : t.solution(c, d, arr_1, arr_2)) System.out.print(x+" ");

	}
	
public List<Integer> solution(int n ,int m, int[] arr_1 , int[] arr_2) {
		
		List<Integer> answer = new ArrayList();
		int p1 = 0 , p2 = 0;
		while(p1 < n && p2 < m) {
			if(arr_1[p1] < arr_2[p2]) {
				answer.add(arr_1[p1]);
				p1++;
			}else {
				answer.add(arr_2[p2]);
				p2++;
			}
		}
		
		while(p1 < n) {
			answer.add(arr_1[p1]);
			p1++;
		}
		
		while(p2 < m) {
			answer.add(arr_2[p2]);
			p2++;
		}
		
		return answer;
	}
}
