import java.util.Scanner;
public class profit
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.print("enter cost price of the article: ");
double cp=in.nextDouble();
System.out.print("enter selling price of the article:");
double sp=in.nextDouble();
double p1=sp-cp;
double percent=Math.abs(p1)/cp*100;
if(p1>0) {
	System.out.println("profit= "+p1);
	System.out.println("profit%="+ percent);
}
else if(p1<0) {
	System.out.println("Loss="+Math.abs(p1));
	System.out.println("Loss%="+percent);
}
else {
	System.out.println("Neither profit nor loss");
}
}
}