package githubdemo1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =121;
		int org=a;
	int rev=0;
		while(a!=0)
	{
		rev=rev*10+a%10;
		a=a/10;
		
	}
		System.out.println("the reverse number is"+rev);
		if(rev==org)
		{
			System.out.println("THE NUMBER OS PALINDROM");
		}
		else
		{
			System.out.println("THE NUMBER OS not PALINDROM");
		}
		
		
		
	}

}
