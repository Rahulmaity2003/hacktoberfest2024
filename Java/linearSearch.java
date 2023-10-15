//LINEAR SEARCH BY USER INPUT

 import java.util.*;
 public class searching{
 	public static void main(String[] args){
 	Scanner sc = new Scanner(System.in);
     int n,x;
 	System.out.println("enter the array size: ");
 	n=sc.nextInt();
 	System.out.println("enter the element of the array: ");
 		int arr[] = new int [n];
 		for(int i=0;i<n;i++){
 			arr[i]=sc.nextInt();
 		} 
 		System.out.println("enter the searched element: ");
 		x=sc.nextInt();
 		int index=-1;
 		for(int i=0;i<arr.length;i++){
 			if(arr[i]==x){
 				index = i;
 				break;
 			}
			
		}
 		if(index==-1){
 			System.out.println("num is not in array");
 		}else{
 			System.out.println("num is present in "+ index +"th index");
 		}
 	}
}
