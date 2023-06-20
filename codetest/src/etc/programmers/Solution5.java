package etc.programmers;

import java.util.Scanner;

class Solution5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String code = sc.next();
    	
        char[] arr = new char[code.length()];
        
        for(int i=0;i<code.length();i++){
            arr[i] = code.charAt(i);
        }
        
        int mode = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            if (mode==0){
                if (arr[i]!=1&&(i%2==0)) sb.append(arr[i]);
                else if (arr[i]==1) mode=1;
            }
            if (mode==1){
                if (arr[i]!=1&&(i%2==1)) sb.append(arr[i]);
                else if (arr[i]==1) mode=0;
            }
                       
            
        }
        
        System.out.println(sb.toString());
        
	}
}