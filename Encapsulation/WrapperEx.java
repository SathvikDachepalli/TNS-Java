package Encapsulation;

public class WrapperEx {
    public static void main(String[] args) {
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0f;
        double d=60.0;
        char c='a';
        boolean bl=true;

        Byte ByteObj=b;
        Short ShortObj=s;
        Integer IntegerObj=i;
        Long LongObj=l;
        Float FloatObj=f;
        Double DoubleObj=d;
        Character CharacterObj=c;
        Boolean BooleanObj=bl;

        System.out.println("ByteObj: "+ByteObj);
        System.out.println("ShortObj: "+ShortObj);
        System.out.println("IntegerObj: "+IntegerObj);
        System.out.println("LongObj: "+LongObj);
        System.out.println("FloatObj: "+FloatObj);
        System.out.println("DoubleObj: "+DoubleObj);
        System.out.println("CharacterObj: "+CharacterObj);
        System.out.println("BooleanObj: "+BooleanObj);

        System.out.println();
        System.out.println("ByteObj: "+ByteObj.byteValue());
        System.out.println("ShortObj: "+ShortObj.shortValue());
        System.out.println("IntegerObj: "+IntegerObj.intValue());
        System.out.println("LongObj: "+LongObj.longValue());
        System.out.println("FloatObj: "+FloatObj.floatValue());
        System.out.println("DoubleObj: "+DoubleObj.doubleValue());
        System.out.println("CharacterObj: "+CharacterObj.charValue());
        System.out.println("BooleanObj: "+BooleanObj.booleanValue());
        System.out.println();

        System.out.println("ByteObj: "+ByteObj.getClass().getName());
        System.out.println("ShortObj: "+ShortObj.getClass().getName());
        System.out.println("IntegerObj: "+IntegerObj.getClass().getName());
        System.out.println("LongObj: "+LongObj.getClass().getName());
        System.out.println("FloatObj: "+FloatObj.getClass().getName());
        System.out.println("DoubleObj: "+DoubleObj.getClass().getName());
        System.out.println("CharacterObj: "+CharacterObj.getClass().getName());
        System.out.println("BooleanObj: "+BooleanObj.getClass().getName());

        
    }
}