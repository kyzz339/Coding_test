package javaProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Coding_33 {

	//매출액의 종류
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_33 t = new Coding_33();
			
			int arr_1 = in.nextInt();
			int arr_2 = in.nextInt();
			
			int [] number= new int [arr_1]; 
			
			for(int i=0; i<number.length;i++) {
				number[i] = in.nextInt();
			}
			
			
			for(int x : t.solution(arr_1, arr_2, number)) {
				System.out.print(x + " ");
			}

		}

	public List<Integer> solution_mine(int number1 , int number2 , int[] number) {
		
		List<Integer> answer = new ArrayList();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i<number.length - number2 +1; i++) {
			if( i ==0 ) {
				for(int j=0 ; j<number2;j++) {
					map.put(number[i+j], map.getOrDefault(number[i+j], 0) + 1);
				}
				answer.add(map.size());
			}else {
				
				map.put(number[i-1], map.get(number[i-1]) - 1);
				if(map.get(number[i-1]) == 0) map.remove(number[i-1]);
				map.put(number[i + number2-1], map.getOrDefault(number[i+number2-1], 0)+1);
				answer.add(map.size());
			}
		}

		return answer;
	}

	public ArrayList<Integer> solution(int n , int k , int[] arr){
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> HM = new HashMap();
		for(int i=0; i<k-1;i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt=k ;rt<n;rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt]) -1);
			if(HM.get(arr[lt]) == 0)HM.remove(arr[lt]);
			lt++;
		}
		
		return answer;
		
	}

}
