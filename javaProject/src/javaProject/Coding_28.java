package javaProject;

import java.util.Scanner;

public class Coding_28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_28 t = new Coding_28();
		
		int c = in.nextInt(); // 총 입력 개수
		int d = in.nextInt(); //연속부분수열의 합
		int [] arr_1 = new int[c];
		
		for(int i=0; i<arr_1.length;i++) {
			arr_1[i] = in.nextInt();
		}
		
		System.out.println(t.solution(c, d, arr_1));

	}

public int solution_mine(int n ,int m, int[] arr_1 ) {
	
	int answer = 0;
	
	for(int i=0 ; i<n; i++) {
		
		int sum = 0;
		int j = 0;
		while(sum < m && i + j < n) {
			
			sum += arr_1[i + j];
			j++;
			if(sum == m) {
				answer ++;
			}
		}
		
		
	}
	
	return answer;
}
public int solution(int n ,int m, int[] arr_1 ) {
	
	int answer = 0;
	int sum = 0 , lt = 0;
	
	for(int rt=0; rt<n; rt++) {
		sum +=arr_1[rt];
		if(sum == m) answer++;
		while(sum >= m) {
			sum -= arr_1[lt++];
			if(sum==m) answer++;
		}
	}
	
	return answer;
}
}
