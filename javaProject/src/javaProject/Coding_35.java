package javaProject;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Coding_35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_35 t = new Coding_35();
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int [] total = new int[N];
		
		for(int i=0 ; i<total.length; i++) {
			total[i] = in.nextInt();
		}
		
		System.out.println(t.solution(N , K , total));
	}

public int solution(int n , int k  , int[] arr){
	
	int answer = 0;
	TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬
	//Tset.remove(143);
	//Tset.size() 갯수
	//Tset.first() -> 맨 앞의 자료 , Tset.last() -> 맨 나중 자료
	for(int i=0 ; i<n; i++) {
		for(int j = i+1; j< n; j++) {
			for(int l=j + 1; l<n; l++) {
				Tset.add(arr[i] + arr[j] + arr[l]);
			}
		}
	}
	int cnt = 0;
	for(int x : Tset) {
		cnt++;
		if(cnt == k) return x;
	}
	
	return -1;
	
}
	
}
