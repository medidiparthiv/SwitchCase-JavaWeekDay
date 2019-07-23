import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    System.out.print("Enter a Number between 1 and 7 : ");
	    int a = x.nextInt();
	    
		switch (a){
		    case(1):
		        System.out.println("The First Day of the Week is Sunday");
		        break;
		    case(2):
		        System.out.println("The Second Day of the Week is Monday");
		        break;
		    case(3):
		        System.out.println("The Third Day of the Week is Tuesday");
		        break;
		    case(4):
		        System.out.println("The Fourth Day of the Week is Wednesday");
		        break;
		    case(5):
		        System.out.print("The Fifth Day of the Week is Thursday");
		        break;
		    case(6):
		        System.out.println("The Sixth Day of the Week is Friday");
		        break;
		    case(7):
		        System.out.println("The Seventh Day of the Week is Saturday");
		}
	}
}