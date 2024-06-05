package javaProject;

	import java.util.HashMap;
	import java.util.Scanner;

//학급회장 (해쉬)
	public class Coding_31 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_31 t = new Coding_31();
			
			int c = in.nextInt();  
			
			String arr_1 = in.next();
			
			
			System.out.println(t.solution(c , arr_1));

		}

	public char solution_mine(int n , String arr_1) {
		
		char answer = ' ';
		HashMap<Character, Integer> result =  new HashMap<Character, Integer>();
		Integer max = 0;
		
		for(char x : arr_1.toCharArray()) {
			
			if(result.get(x) == null) {
				result.put(x, 1);
			}else {
				result.put(x, result.get(x) + 1);
			}
			
			if(max < result.get(x)) {
				max = result.get(x);
				answer = x;
			}
			
		}
		
		return answer;
	}

	public char solution(int n , String arr_1) {
		
		char answer = ' ';
		HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		
		for(char x : arr_1.toCharArray()) {
			
			map.put(x, map.getOrDefault(x, 0) + 1); //map.getOrDefault map에 키가 없다면 0이 나오게 설정
			
		}
		// map.containsKey('A'); -> 'A'가 있으면 true
		// map.size() -> 총 갯수 출력
		// map.remove('A') -> 'A'라는 특정 키를 삭제
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}



	}
