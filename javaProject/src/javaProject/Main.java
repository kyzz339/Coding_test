package javaProject;

import java.util.*;

public class Main {
//이분검색
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main t = new Main();
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int [] array = new int[N]; 
		
		for(int i = 0 ; i<array.length; i++) {
			
			array[i] = in.nextInt();
		
		}
		
		//for(Coordinate x : t.solution(N, array)) System.out.println(x.x + " " + x.y);;
		System.out.println(t.solution(N , M ,array));
	}
	
	public int solution(int n , int m ,int[] arr) {
		
		int answer = 0;
		Arrays.sort(arr);
		
		int first = 0;
		int last = arr.length - 1;
		int mid = (last - first)/ 2;
		
		
		while(arr[mid] != m) {
			if(arr[mid] < m) {
				
				first = mid;
				mid =  mid + (last - first) / 2 ;
				
			}else if(arr[mid] > m) {
				
				last = mid;
				mid = mid - (last - first) / 2;
				
			}
			
		}
		answer = mid + 1;
		return answer;
	}
}
