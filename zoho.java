public class zoho {
	public static void main(String args[]) {
		int c=1;
		for(int i=1;i<=5;i++)
		{
			int a=i+1,count=0,b=c;
			System.out.print(c+" ");
			for(int j=1;j<=4;j++)
			{
				if(i==5)
				{
					a-=1;
					b+=a;
					System.out.print(b+" ");
				}
				else
				{
					if(a<=5)
					{
						b+=a;
						System.out.print(b+" ");
						a+=1;
					}
					else
					{
						count+=1;
						a-=count;
						b+=a;
						System.out.print(b+" ");
						a+=count;
					}
				}
				
			}
			System.out.println();
			c+=i;
		}
	}
}