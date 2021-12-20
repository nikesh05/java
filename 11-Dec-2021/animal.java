abstract class animal{
    abstract void fly();
    ///////
   final  void nonfly(){
        System.out.println("non fly method");

    }
}
class bird extends animal{
    void fly(){
        System.out.println("Bird fly call");
    }
      void nonfly(){
        System.out.println("non bird class method");

    }
    public static void main(String...s){
        bird b= new bird();
        b.fly();
        b.nonfly();
    }
}
