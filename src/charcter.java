
class charcter {
	static void check(char ch)
	{if (ch>= 'A' && ch<= 'Z')
		System.out.println("\n"+ ch+ "is an uppercase character");
		else if(ch>='a' && ch<= 'Z')
			System.out.println("\n"+ ch+ "is an lowercase charcter");
	}
	public static void main(String [] args)
	{
		char ch;
		
		ch= 'A';
		
		ch= 'a';
		
		check(ch);
		
		ch= '0';
				
		check(ch);
	}
}
			

	


