/*
 * package study_221011;
 * 
 * import java.util.Scanner;
 * 
 * public class Sosu_Find { public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * int N = sc.nextInt();
 * 
 * for(int k=0;k<N;k++) { narr[k] = sc.nextInt(); }
 * 
 * int cnt = 0;
 * 
 * for(int i=0;i<N;i++) { // if (arr[i] == 1) { // break; // } //if( arr[i] ==
 * 2) { // cnt++; //}
 * 
 * int count = 0;
 * 
 * for(int j=2;j<N;j++) { if(N % j == 0) { count++; } if(count==2) { cnt++; }
 * 
 * } System.out.println(cnt);
 * 
 * } } }
 */