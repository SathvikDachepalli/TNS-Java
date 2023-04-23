package apr6;

public class StrMethods {
	public static void main(String[] args) {
		String s="Java is a programming";
		System.out.println(s);
		int len=s.length();
		System.out.println(len);
		String s2=" language";
		String addop=" add";
		String join=s+s2+addop;
		System.out.println(join);
		
		String con=" Concat";
		s= s.concat(s2);  // Does not take multiple args
		join=s.concat(con);
		System.out.println(join);
		
		//Convert string to lower case
		String Up="I AM SATHVIK! i am sathvik ";
		System.out.println(Up.toLowerCase());
		System.out.println(Up.toUpperCase());
		
		// Replace Characters in String
		s="RRR is the best mavie";
		s= s.replace("mavie", "Movie");
		System.out.println(s);
	}
}
