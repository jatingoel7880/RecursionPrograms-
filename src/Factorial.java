import java.util.*;
//iterative way 

//public class Factorial {
//  public static void main(String[] args) {
//     int n=5;
//     int result= func(n);
//     System.out.print(result);
//  }
//
//  public static int func(int n) {
//      int fact=1;
//    for(int i=1; i<=n;i++){
//       fact=fact*i;
//    }
//    return fact;
//    
//  }
//}

//Recursion way 
public class Factorial {
	  public static void main(String[] args) {
	     int n=5;
	     System.out.print(func(n));
	  }

	  public static int func(int n) {
		  if(n==0) {
			  return 1;
	    }
	    return n* func(n-1);
	    
	  }
	}
