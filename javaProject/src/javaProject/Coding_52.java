package javaProject;

import java.util.Scanner;

class Coordinate{
	int x;
	int y;
	
	public Coordinate(int x , int y) {
		this.x = x;
		this.y = y;
		}
}

public class Coding_52 {
//좌표정렬
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Coding_52 t = new Coding_52();
		
		int N = in.nextInt();
		
		Coordinate [] array = new Coordinate[N];
		
		for(int i = 0 ; i<array.length; i++) {
			
			int x = in.nextInt();
			int y = in.nextInt();
			
			Coordinate coordinate = new Coordinate(x, y);
			array[i] = coordinate;
		}
		
		for(Coordinate x : t.solution(N, array)) System.out.println(x.x + " " + x.y);;
		//System.out.println(t.solution(N , array));
	}
	
	public Coordinate[] solution(int n , Coordinate[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
		    for (int j = 0; j < arr.length - 1 - i; j++) {
		        if (arr[j].x > arr[j + 1].x) {
		            Coordinate tmp_x = arr[j + 1];
		            arr[j + 1] = arr[j];
		            arr[j] = tmp_x;
		        }
		    }
		}
		for(int i=0; i<arr.length - 1; i++) {
					for(int j=0 ; j<arr.length - 1 -i; j++) {
						if(arr[j].x == arr[j+1].x) {
							if(arr[j].y > arr[j+1].y) {
							Coordinate tmp_y = arr[j+1];
							arr[j+1] = arr[j];
							arr[j] = tmp_y;
							}
						}
					}
				}
		
		
	
		return arr;
	}
}
