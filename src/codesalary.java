import java.util.*;
public class codesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=in.nextInt();
			float sal;
			if(a<1500)
			{
				sal=(float)(a+(0.10*a)+(0.90*a));
			}
			else
			{
				sal=(float)(a+500+(0.98*a));
			}
			System.out.println(sal);
		}

	}

}
