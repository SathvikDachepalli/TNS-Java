package ENUMS;

enum Level{
    A, B, C;
}

public class EnumSwitch {
    public static void main(String[] args) {
        Level myVar = Level.B;
        switch(myVar){
            case A:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case C:
                System.out.println("C");
                break;
        }
    }
}
