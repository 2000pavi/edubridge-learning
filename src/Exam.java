import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[]=new int[5];
		int i;
		float sum=0,avg;
		Scanner scan= new Scanner(System.in);
		System.out.print("enter marks obtained in 5 subjects:");
		for(i=0;i<5;i++)
		{
			mark[i]=scan.nextInt();
			sum=sum+mark[i];
		}
		avg=sum/5;
		if(avg>=60)
		{
			System.out.print("1 division");
		}
		else if(avg>=50)
		{
			System.out.print("2 division");
		}
		else if(avg>=40)
		{
			System.out.print("3 division");
		}
		else
		{
			System.out.print("legends born with success");
		}

	}

}
