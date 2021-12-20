class Base{
    final void show(){
        System.out.println("Hello Show");
    }
}
class Child extends Base{
    void show(){
        System.out.println(" Show method override");
    }
    public static void main(String[] args) {
        Child c1=new Child();
        c1.show();
    }
}