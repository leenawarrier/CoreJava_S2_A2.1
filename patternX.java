import java.util.Scanner;

public class patternX {
	public static void main(String[] args) {
		//Input the no of rows, if even entered, the next odd no is taken to compute the height of the pattern X
		Scanner size = new Scanner(System.in);
		System.out.println("Enter the height(no of rows, below 50 would be optimal) of star pattern");
		int s = size.nextInt();
		//minimum size to be 3 for proper pattern
		if (s < 3) {
			s = 3;    
		}
		int p = s/2;
		//if height is even, increment by 1 to make it odd number for proper pattern of X
		if (s%2 == 0) {     
			s++;
		}
		drawPatternX(s);
	}

//Method to draw the pattern
//(0,0) (0,6) ... ((1,1) (1,5) ... (2,2) (2,4) ... (3,3) ...(4,2) (4,4)... (5,1) (5,5) ... (6,0) (6,6)
public static void drawPatternX(int row) {
		int startCur = 0; 
		int endCur = row-1; 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) { 
				if (startCur == endCur && j == i) 
					System.out.print('*'); 
				else if (startCur == j || endCur == j) 
					System.out.print('*'); 
				else 
					System.out.print(' '); 
			} 
			startCur++; 
			endCur--; 
			System.out.println(); 
		} 
	}
}
