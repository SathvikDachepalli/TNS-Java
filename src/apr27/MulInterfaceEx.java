package apr27;

interface PersonEat{
    void eat();
}

interface PersonTravel {
    void travel();
}



public class MulInterfaceEx implements PersonEat, PersonTravel{
    public void eat(){
        System.out.println("Eating");
    }
    public void travel(){
        System.out.println("Person Travelling");
    }
    public static void main(String[] args) {
        MulInterfaceEx d= new MulInterfaceEx();
        d.eat();
        d.travel();
    }

}
