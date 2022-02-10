
public class GFG {
public static int valid(int a,int b,int c)
{
	if(a+b+c==180 && a!=0 && b!=0 && c!=0)
		return 1;
	else
		return 0;
}
public static void main(String args[])
{
	int a=60,b=40,c=80;
	if((valid(a, b, c)) == 1)
		System.out.print("valid");
	
	else
		
		System.out.print("not valid");
	
		 
}
}
