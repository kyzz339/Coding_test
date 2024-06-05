package javaProject;

import java.util.Scanner;

public class Coding_27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_27 t = new Coding_27();
		
		int c = in.nextInt(); // 총 입력 개수
		int d = in.nextInt(); //연속된 갯수
		int [] arr_1 = new int[c];
		
		for(int i=0; i<arr_1.length;i++) {
			arr_1[i] = in.nextInt();
		}
		
		
		
		
		System.out.println(t.solution(c, d, arr_1));

	}
//4번쨰 결과까지는 맞았지만 마지막에 time Limit Exceeded
public int solution_mine(int n ,int m, int[] arr_1 ) {
	
	int answer = 0;
	int max = 0;
	for(int i=0; i<arr_1.length - m; i++) {
		int sum = 0;
		for(int j=0; j<m;j++) {
			sum = sum + arr_1[i+j]; 
		}
		if(max < sum) {
			max = sum;
		}
	}
	
	answer = max;
	
	return answer;
}
//Sliding window 사용 풀
//초기합 미리 구하고 
//다음 차수 되면 맨 처음 값 빼고 다음값 넣기
//for 문 2개 되면 시간이 O^2 으로 늘어남
public int solution(int n ,int m, int[] arr_1 ) {
	
	int answer = 0;
	int max = 0 , sum = 0;
	for(int i=0; i<m; i++) sum+=arr_1[i];
	answer = sum;
	
	for(int i=m; i<n; i++) {
		sum+=(arr_1[i] - arr_1[i-m]);
		answer=Math.max(answer , sum);
	}
	
	return answer;
}
}
