import java.util.Scanner;
public class SwitchADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int i=scanner.nextInt();
		switch(i)
		{
		case 1:System.out.println("Pressed 1");
		case 2:System.out.println("Pressed 2");
		case 3:System.out.println("Pressed 3");
		case 4:System.out.println("Pressed 4");
		}
	}
}
	


