package TNS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		//		System.out.println(fruits);
//		for (int i =0;i<fruits.length;i++) { System.out.println(fruits[i]); }
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println(array);
		String[] bikes = {"Yedzi","Enfield","Ducati","Honda"};
		ArrayList<String> Bikes=new ArrayList<String>(Arrays.asList(bikes));
		System.out.println(Bikes);
		for(String bike:Bikes){
			System.out.println(bike);
		}
	}
}
