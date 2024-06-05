package javaProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Coding_26 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_26 t = new Coding_26();
		
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
//time out 남 -먼저 오름차순 정렬 해야함
// two pointer algorithm
public List<Integer> solution_mine(int n ,int m, int[] arr_1 , int[] arr_2) {
		
		List<Integer> answer = new ArrayList();
	
		Arrays.sort(arr_1);
		Arrays.sort(arr_2);
		
		for(int x : arr_1) {
			for(int y : arr_2) {
				if(x == y) {
					answer.add(x);
				}
			}
		}
		
		
		
		return answer;
	
	
}

public List<Integer> solution(int n ,int m, int[] arr_1 , int[] arr_2) {
	
	List<Integer> answer = new ArrayList();

	Arrays.sort(arr_1);
	Arrays.sort(arr_2);
	int p1=0 ,p2=0;
	
	while(p1<n && p2<m) {
		if(arr_1[p1] == arr_2[p2]) {
			answer.add(arr_1[p1++]);
			p2++;
		}else if (arr_1[p1] < arr_2[p2]) p1++;
		else p2++;
		
	}
	
	
	return answer;
}
}
