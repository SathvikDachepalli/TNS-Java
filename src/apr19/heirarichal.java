package apr19;

class Super{
    String name = "Sathvik";
}
class sub1 extends Super{
    void getName(){
        System.out.println("Name : "+name);
    }
    void College(String college){
        System.out.println("College is "+college);
    }
}

class sub2 extends Super{
    void setName(String name){
        super.name=name;
    }
}

public class heirarichal {
    public static void main(String[] args) {
        sub2 obj=new sub2();
        obj.setName("Varun");
    }
}
