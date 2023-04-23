package TNS;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		if (s=="a"||s=="e"||s=="i"||s=="o"||s=="u"){ 
			System.out.println("Its a vowel"+s);
			}
		else{
			System.out.println("It is a consonant");
		}
		sc.close();
	}
}
