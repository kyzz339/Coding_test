package javaProject;

import java.util.HashMap;
import java.util.Scanner;

//아나그램 (해쉬)
public class Coding_32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_32 t = new Coding_32();
		
		String arr_1 = in.next();
		String arr_2 = in.next();
		
		
		System.out.println(t.solution(arr_1 , arr_2));

	}

public	String solution_mine(String arr_2 , String arr_1) {
	
	String answer = "";

	// map.containsKey('A'); -> 'A'가 있으면 true
	// map.size() -> 총 갯수 출력
	// map.remove('A') -> 'A'라는 특정 키를 삭제
	
	HashMap<Character, Integer> map_1 = new HashMap<Character, Integer>();
	HashMap<Character, Integer> map_2 = new HashMap<Character, Integer>();
	
	for(char x : arr_1.toCharArray()) {
		map_1.put(x, map_1.getOrDefault(x, 0) + 1);
	}
	
	for(char y : arr_2.toCharArray()) {
		map_2.put(y, map_2.getOrDefault(y, 0)+1);
	}
	
	for(char key : map_1.keySet()) {
		if(map_2.containsKey(key) && !answer.equals("NO")) {
		if(map_1.getOrDefault(key , 0) != map_2.getOrDefault(key , 0)) {
			answer = "NO";
		}else {
			answer = "YES";
		}
		}else {
			answer = "NO";
		}
	}
	
	return answer;
}

public String solution(String str1 , String str2) {
	
	String answer = "YES";
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	
	for(char x : str1.toCharArray()) {
		map.put(x, map.getOrDefault(x, 0) + 1);
	}
	
	for(char x : str2.toCharArray()) {
		if(!map.containsKey(x) || map.get(x) == 0) return "NO";
		
		map.put(x, map.get(x) -1);
		
	}
	
	return answer;
	
}
}
