package apr24;
class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        super.draw(); // To get the 
        System.out.println("Drawing Square");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
public class RunPoly {
    public static void main(String[] args) {
        
        Square s = new Square();
        s.draw();
        Circle x = new Circle();
        x.draw();
    }
}
