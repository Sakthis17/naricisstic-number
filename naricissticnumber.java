

public class naricissticnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=Integer.toString(a);
		int c=b.length();
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum+=Math.pow(r, c);
			a/=10;
			
		} 
		System.out.print(sum);
		

	}

}
/*INPUT:
153

OUTPUT:
1**3+5**3+3**3=153    here  3 is the length of the integer.*/