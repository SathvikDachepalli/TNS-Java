package Questions;

public class swappng {
	public static void main(String[] args) {
		int first=23,second=66;
		System.out.println("-- Before swapping--");
		System.out.println(first);
		System.out.println(second);
		
		int temp=first;
		first=second;
		second=temp;
		
		System.out.println("-- After swapping--");
		System.out.println(first);
		System.out.println(second);
		
		first=first+second;
		second=first-second;
		first=first-second;
		
		System.out.println("-- No temp swapping / Reverse--");
		System.out.println(first);
		System.out.println(second);
		
	}
}
