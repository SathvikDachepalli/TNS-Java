package FinalPackage;
class Bike{
    final int x=10;
    final void run(){
        System.out.println("Bike is running");
    }
    void run(int a, int b){  //We can overload the method, but cannot override it.
        System.out.println("Running");
        //this.x=a; // Cannot change x because it is final.
    }
    void BikeId(int i){
        System.out.println("This is bike"+i);
    }
}
class KTM extends Bike{
    // void run(){ // wont work coz we declared final in super class
    //     System.out.println("This is KTM run method");
    // }
    void BikeId(int i){super.BikeId(i);}  // Can be overridden
}

final class Car{
    void run(){
        System.out.println("Car go BRR");
    }
}
// class RollsRoyce extends Car{  // Cannot get extend super class because it is final
//     void run(){
//         System.out.println("I go silent  BRR");
//     }
// }


