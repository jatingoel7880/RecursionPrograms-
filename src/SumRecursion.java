// parameterized recursion
//public class SumRecursion {
//
//	public static void main(String[] args) {
//		int n=5;
//		func(n,0);
//
//	}
//	
//		public static void func(int i, int sum) {
//			if(i<1) {
//				 System.out.println(sum);
//				 return;
//		}
//			func(i-1,sum+i);
//	}
//
//}


//functional way 
public class SumRecursion {

	public static void main(String[] args) {
		int n=5;
		System.out.println(func(n));

	}
	
		public static int func(int n) {
			if(n==0) {
				 return 0;
		}
			return n+func(n-1);
	}

}
