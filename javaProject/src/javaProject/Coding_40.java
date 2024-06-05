package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Coding_40 {
	//카카오-인형뽑기
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Coding_40 t = new Coding_40();
			
			int number = in.nextInt();
			int [][] array = new int[number][number];
			
			
			for(int i=0;i<array.length; i++) {
				for(int j=0; j<array[i].length;j++) {
					array[i][j] = in.nextInt();
				}
			}
			
			int move_size = in.nextInt();
			int [] moves = new int [move_size];
			
			for(int i=0 ; i<moves.length; i++) {
				moves[i] = in.nextInt();
			}
			
			System.out.println(t.solution(array , moves));
		}

		public int solution_mine(int[][] array , int [] pick_number){
		
		int answer = 0;
		
		List<Stack> Stack_List = new ArrayList();
		
		for(int i = 0; i<array.length; i++) {
			Stack stack = new Stack();
			for(int j=0;j<array[i].length;j++) {
				if(array[array[i].length -1 - j][i] != 0) stack.add(array[array[i].length -1 - j][i]);
			}
			Stack_List.add(stack);
		}
		List moves = new ArrayList(); 
		for(int x : pick_number) {
			if(!Stack_List.get(x-1).isEmpty()) {
			moves.add(Stack_List.get(x-1).pop());
			}
		}
		int limit = 0;
		while(limit < moves.size() - 1) {
			if(moves.get(limit) == moves.get(limit + 1)) {
				answer = answer + 2;
				moves.remove(limit);
				moves.remove(limit);
				limit = -1;
			}
			limit++;
		}
		
		return answer;
		
		}
		
		public int solution(int[][]	board , int [] moves) {
			int answer = 0;
			//peek() Stack 최 상단에 있는 값 return ->pop 은 꺼내고 return
			Stack<Integer> stack = new Stack();
			
			for(int pos : moves) {
				for(int i=0; i<board.length; i++) {
					if(board[i][pos-1] != 0) {
						int tmp = board[i][pos-1];
						board[i][pos-1] = 0;
						if(!stack.isEmpty() && tmp == stack.peek()) {
							answer+=2;
							stack.pop();
						}else {
							stack.push(tmp);
							break;
						}
					}
				}
			}
			return answer;
		}
}
