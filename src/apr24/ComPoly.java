package apr24;

public class ComPoly {
    void add(){
        System.out.println("Test arg");
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(float a, float b, float c, float d){
        System.out.println(a+b+c+d);
    }
    public static void main(String[] args) {
        ComPoly cp = new ComPoly();
        cp.add();
        cp.add(10, 20);
        cp.add(10, 20, 30);
        cp.add(10.5f, 20.5f, 30.5f, 40.5f);
    }
}
