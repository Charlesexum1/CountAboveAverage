import java.util.Scanner;

public class CountAboveAverage {
	
	private int[] count = new int[10];
	private int total = 0;
	private int inputAA = 0;
	
	public void countAbove() {
				
		Scanner keys = new Scanner(System.in);
				
		for (int x = 0; x < count.length; x++) {
			count[x] = keys.nextInt();
			total += count[x];
			}
		
		for (int y = 0; y < count.length; y++) {
			if (count[y] > (total / count.length)) {
				inputAA++;
				}
			}
		System.out.println();
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + (total / count.length));
		System.out.println("Total inputs above average: " + inputAA);	
				
		}
		
	public static void main(String[] args) {
		CountAboveAverage demo = new CountAboveAverage();
		demo.countAbove();		
		}
	
	}
