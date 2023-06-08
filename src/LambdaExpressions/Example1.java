package LambdaExpressions;

import LambdaExpressions.Drawable;
public class Example1 {
    public static void main(String[] args) {
        int width = 10;
 
         Drawable d = () -> {
             System.out.println("Drawing " + width);
         };
    }    
}

