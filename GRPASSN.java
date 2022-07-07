import java.util.ArrayList;
import java.util.Scanner;


class CodeChefCC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x; 
        long arr[];
        while(t-- > 0){
		x = sc.nextInt();
		arr = new long[x];
		boolean approve = false;
		ArrayList<Long> arrli = new ArrayList<>();
		for(int i=0; i<x; i++){
			arr[i] = sc.nextLong();
		}
		for(int i =0; i<x;i++){
			if(arrli.contains(arr[i]) == false){
				arrli.add(arr[i]);
			}
		}
		long newarr[] = new long[arrli.size()];
		for(int i = 0; i<arrli.size(); i++){
			newarr[i] = 0;
			for(int j=0; j<x; j++){
				if(arrli.get(i) == arr[j]){
					newarr[i] += 1;
				}
			}
		}
		for(int i=0 ; i<arrli.size(); i++){
			if(newarr[i]%arrli.get(i) == 0){
				approve = true;
			}
			else {
				approve = false;
				break;
			}
		}
		if(approve == true) System.out.println("Yes");
		else System.out.println("No");
	    }
	        
    }         

}          
