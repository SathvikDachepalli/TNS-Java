package apr25;
class Add{
    int defaultVal=10;
    void add(){
        System.out.println(defaultVal+defaultVal);
    }
    void add(int a){
        System.out.println(a+defaultVal);
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class MethodOverLoad {
    public static void main(String[] args) {
        Add a = new Add();
        a.add();
        a.add(20);
        a.add(20, 30);
        a.add(40,50,60);
    }
}
