package MyAssignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num=17;
		int temp=0;
		for(int i=2;i<=num;i++)
			if(num%i==0)
			{
				temp=temp+1;
			}
	
	if(temp==0) {
	System.out.println(num+ " " + "is Prime");
	}
 else 
 {
	System.out.println(num+" " +"is not Prime");
}
	}
	}



