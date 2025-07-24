package MyAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number=8;
		int a=0;
		int b=1;
		
		System.out.println("Fibonacci series"+" "+number +" "+ "terms:");
		for (int i=1;i<=number;++i) {
		 	System.out.println(a + " ");
			
			int nextTerm=a+b;
			a=b;
			b=nextTerm;
		}
	}
}
