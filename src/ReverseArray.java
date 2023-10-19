//using an extra array 
//public class ReverseArray {
//	
//	public static void printArray(int nn[], int n) {
//		System.out.println("Reversed Array");
//		for( int i=0; i<n;i++) {
//			System.out.print(nn[i]+" ");
//		}
//	}
//
//	public static void reverseArray(int n2[], int n) {
//		int [] nn= new int [n];
//		for(int i=n-1; i>=0;i--) {
//			nn[n-i-1]=n2[i];
//		}
//		printArray(nn,n);
//	}
//	public static void main(String[] args) {
//		int n=5;
//		int nn[]= {5,4,3,2,1};
//		printArray(nn,n);
//		int n2[]= {5,4,3,2,1};
//		reverseArray(n2,n);
//
//	}
//
//}

//using space-optimized iterative method 

public class ReverseArray {
	
	public static void printArray(int nn[], int n) {
		System.out.println("Reversed Array");
		for( int i=0; i<n;i++) {
			System.out.print(nn[i]+" ");
		}
	}

	public static void reverseArray(int nn[], int n) {
		int p1=0,p2=n-1;
		while(p1<p2) {
			int tmp= nn[p1];
			nn[p1]=nn[p2];
			nn[p2]=tmp;
			p1++;
			p2--;

		}
		printArray(nn,n);
	}
	public static void main(String[] args) {
		int n=5;
		int nn[]= {5,4,3,2,1};
		printArray(nn,n);
		reverseArray(nn,n);

	}

}
