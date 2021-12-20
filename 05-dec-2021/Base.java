class Base {
    Base(){
        System.out.println("Base Class Constructor");
    }
    Base(int x){
        System.out.println(x);
    }

}
class Child extends Base{
    Child(){
        super(200);
        System.out.println("Child Class Constructor");
    }
     public static void main(String...s) {
        Child c1=new Child();
       
    }
}