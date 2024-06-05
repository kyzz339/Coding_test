package javaProject;

import java.util.HashMap;
import java.util.Scanner;

public class Coding_34 {
	//모든 아나그램 찾기
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_34 t = new Coding_34();
			
			String S = in.next();
			String T = in.next();	
			
			System.out.println(t.solution(S, T));
		}

	public int solution(String s , String t ){
		
		int answer = 0;
		
		char [] sToChar = s.toCharArray();
		char [] tToChar = t.toCharArray();
		
		HashMap<Character, Integer> t_Map = new HashMap<Character, Integer>();
		HashMap<Character, Integer>s_Map = new HashMap<Character, Integer>();
		
		for(char x : tToChar) {
			t_Map.put( x , t_Map.getOrDefault(x, 0) + 1);
		}
		
		for(int i=0 ; i<sToChar.length - tToChar.length + 1; i++) {
		
			if( i == 0) {
				for(int k = 0 ; k<tToChar.length; k++) {
					s_Map.put(sToChar[i+k], s_Map.getOrDefault(sToChar[i+k], 0) + 1);
				}
			}else {
				s_Map.put(sToChar[i-1], s_Map.getOrDefault(sToChar[i-1], 0) -1);
				if(s_Map.get(sToChar[i-1]) == 0) s_Map.remove(sToChar[i-1]);
				s_Map.put(sToChar[i + tToChar.length - 1], s_Map.getOrDefault(sToChar[i + tToChar.length - 1], 0) +1 );
			}
			
			if(s_Map.equals(t_Map)) answer ++;
		}
		
		
		return answer;
		
	}

	public int solution1(String a , String b) {
		
		int answer = 0;
		
		HashMap<Character, Integer> am = new HashMap<Character, Integer>();
		HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0) + 1);
		int L = b.length() -1;
		for(int i=0 ; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		int lt = 0;
		for (int rt = L ; rt < a.length(); rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			if(am.equals(bm)) answer ++;
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			if(am.get(a.charAt(lt)) == 0) am.remove(a.charAt(lt));
			lt ++;
		}
			
		
		return answer;
		
	}
}
