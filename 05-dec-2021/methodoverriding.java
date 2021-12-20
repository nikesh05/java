class Base {
    void show(){
        System.out.println("Base class constructor");
    }
}
class Child extends Base{
    void show(){
        System.out.println("Child Class constructor");
        super.show();
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
    }
}