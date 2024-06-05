package javaProject;

import java.util.Scanner;

public class Coding_29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_29 t = new Coding_29();
		
		int c = in.nextInt(); //연속된 자연수의 
		
		
		System.out.println(t.solution(c));

	}
//정답
public int solution_mine(int n ) {
	
	int answer = 0;
	int [] arr_1 = new int[n];
	
	for(int i=0; i<arr_1.length; i++) {
		arr_1[i] = i+1;
	}
	
	for(int i=0;i<arr_1.length-1;i++) {
		int j = 0; //연속된 다음 배열인
		int sum = 0;
		while(sum < n && i+j < n-1) {
			sum += arr_1[i+j];
			j++;
			if(sum == n) {
				answer ++;
			}
		}
	}
	
	
	return answer;
}
//정수 n/2 +1 만큼의 수만큼만 가면 됨 two point 알고리즘
public int solution(int n ) {
	
	int answer = 0,sum = 0 , lt = 0;
	int m = n/2+1;
	int[] arr = new int[m];
	
	for(int i=0 ; i<m; i++) {
		arr[i] = i+1;
	}
	
	for(int rt = 0 ; rt < m; rt++) {
		sum += arr[rt];
		if(sum == n) answer ++;
		while(sum >= n) {
			sum -= arr[lt];
			if(sum == n) answer++;
		}
	}
	
	
	return answer;
}

public int solution_Math(int n) {
	int answer = 0 ,cnt = 1;
	n--;
	while(n>0) {
		cnt++;
		n= n-cnt;
		if(n%cnt ==0) {
			answer ++;
		}
		
	}
	
	
	return answer;
}

}
