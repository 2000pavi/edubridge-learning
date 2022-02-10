import java.util.*;
public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("who are the youngest among three freinds");
		int youngestperson,persononeage,persontwoage,personthreeage;
		Scanner in = new
				Scanner(System.in);
		System.out.println("enter persononeage");
		persononeage=in.nextInt();
		System.out.println("enter twopersonage");
		persontwoage=in.nextInt();
		System.out.println("enter threepersonage");
		personthreeage=in.nextInt();
		if((persononeage<persontwoage) && (persononeage<personthreeage))
			System.out.println("person one is the youngest person");
		else if((persontwoage<persononeage) &&(persontwoage<personthreeage));
		System.out.println("person two is the youngest person");
		 if((personthreeage<persononeage)&&(personthreeage<persontwoage));
		System.out.println("person three is the youngest person");

	}

}
