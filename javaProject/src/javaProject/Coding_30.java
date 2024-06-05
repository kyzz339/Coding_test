package javaProject;

import java.util.Scanner;

public class Coding_30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_30 t = new Coding_30();
		
		int c = in.nextInt(); //첫줄의 최대 길이 
		int d = in.nextInt(); //바꿀 수 있는 횟수
	
		int [] arr_1 = new int[c];
		
		for(int i=0; i<arr_1.length; i++) {
			arr_1[i] = in.nextInt();
		}
		
		
		System.out.println(t.solution(c , d , arr_1));

	}
//만들 수 있는 최대 길이의
public int solution_mine(int n , int m , int[] arr_1) {
	
	int lt = 0 , max = 0;
	
	while(lt < n) {
		int answer = 0;
		int count = m;
		for(int rt = lt ; rt<arr_1.length; rt++ )
		{
			if(arr_1[rt] == 0) {
				if(count == 0) {
					if(max < answer) max = answer;
					break;
				}else {
					answer++;
					count--;
				}
			}else {
				answer++;
			}
		}
		
		lt++;
	}
	
	return max;
}

public int solution(int n , int m , int[] arr_1) {
	
	int answer =0 , cnt = 0, lt = 0;

	for(int rt=0;rt<n;rt++) {
		if(arr_1[rt] == 0) cnt++;
		while(cnt > m) {
			if(arr_1[lt] == 0) cnt--;
			lt++;
		}
		answer = Math.max(answer, rt-lt+1);
	}
	
	return answer;
}
}
