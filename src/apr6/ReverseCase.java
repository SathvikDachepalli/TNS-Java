package apr6;

public class ReverseCase {
	public static void main(String[] args) {
		String str1="Welcome to JAVA Progamming";
		String ans="";
		for(int i=0;i<str1.length();i++){
			char[] str1Array=str1.toCharArray();
			if(str1Array[i]>='A' && str1Array[i]<='Z'){
				str1Array[i]=(char)(str1Array[i]+32);
			}
			else if(str1Array[i]>='a' && str1Array[i]<='z'){
				str1Array[i]=(char)(str1Array[i]-32);
			}
			ans=ans+str1Array[i];
		}
		System.out.println(ans);
	}
}
