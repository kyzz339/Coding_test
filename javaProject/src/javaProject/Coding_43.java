package javaProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Coding_43 {
	//공주 구하기
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_43 t = new Coding_43();
			
			int N = in.nextInt();
			int K = in.nextInt();
			System.out.println(t.solution(N , K));
		}

		public int solution_mine(int N , int K){
			
			int answer = 0 , index = 0;
			int cnt = 0;
			List<Integer> prince_list = new ArrayList();
			
			for(int i=0; i<N; i++) {
				prince_list.add(i+1);
			}
			
			while( prince_list.size()!=1) {
				
				cnt ++;
				if(cnt % K == 0) {
					prince_list.remove(index);
					index --;
					}
				index ++;
				if(index >= prince_list.size()) index = 0;
			}
			answer = prince_list.get(0);
			
			return answer;
			
		}
		
		public int solution(int n , int k) {
			int answer = 0;
			Queue<Integer> Q = new LinkedList<Integer>();
		
			for(int i=0 ; i<=n ; i++) Q.offer(i);
			while(!Q.isEmpty()) {
				for(int i= 1 ; i<k ; i++) Q.offer(Q.poll());
				Q.poll();
				if(Q.size() == 1) answer = Q.poll();
			}
				
			return answer;
		}
}
