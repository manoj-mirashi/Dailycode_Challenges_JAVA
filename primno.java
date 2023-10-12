class primno 
{
	public static void main(String[] args) 
	{
		int i=0,m=0;
		int n=3;
		m=n/2;
		if(n==0||n==1){
			System.out.println(n+"i not prime number");
		}else{
			for(i=2;i<=m;i++){
				if(n%i==0){
					System.out.println(n+"is not prime number");
					m=1;
					break;
				}
			}
			if(m==0){
				System.out.println(n+"is prime number");}
		}
	}
}
