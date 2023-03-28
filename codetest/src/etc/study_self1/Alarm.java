package etc.study_self1;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt();
		int min = sc.nextInt();
		
		
		if(min <= 45) {
			
			if (hr > 0) {
			hr = hr - 1;
			min = 60 - (45 - min);
			System.out.print(hr + " ");
			System.out.print(min);
			}
			
			else if (hr == 0) {
				if (min < 45) {
					hr = 23;
					min = 60 - (45-min);
					System.out.print(hr + " ");
					System.out.print(min);
				}
				else if (min >= 45) {
					System.out.print(hr + " ");
					System.out.print(min-45);
				}
			}
		}
		else if (min > 45) {
			 System.out.print(hr + " ");
			 System.out.print(min-45);
		}
		
		sc.close();
			
	}

}
