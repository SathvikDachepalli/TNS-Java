package Beginning;
import java.util.Scanner;
public class ATestFile {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Want to play? Press any key other than 0");
		int x=sc.nextInt();
		while(x<=4 && x>=1){
			System.out.println("Enter accordingly:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nOther: Exit");
			int c=sc.nextInt();
			switch (c) {
			case 1:
				System.out.println(sc.nextInt()+sc.nextInt());
				break;
			case 2:
				System.out.println(sc.nextInt()-sc.nextInt());
				break;
			case 3:
				System.out.println(sc.nextInt()*sc.nextInt());
				break;
			case 4:
				System.out.println(sc.nextInt()/sc.nextInt());
				break;
			default:
				x=c;
				break;
			}
		}
		if(x>=4 && x<=1){System.out.println("Looks like you pressed"+ x +" want to exit. Done :D");
		}
		sc.close();
	}
}
