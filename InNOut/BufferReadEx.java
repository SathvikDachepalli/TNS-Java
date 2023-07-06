package InNOut;
import java.io.*;

public class BufferReadEx {
    public static void main(String[] args) throws IOException{
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(r);
        System.out.println("Enter your name: ");
        String name = br.readLine();

        // or you can create using it like this.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your roll number: ");
        String roll= reader.readLine();

        System.out.println("Your name is: "+name+"\n"+"Your roll number is: "+roll);
    }
}
