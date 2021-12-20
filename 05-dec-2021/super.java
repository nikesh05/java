class Base {
    int x=200;
}
class Child extends Base {
    int x=400;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Child c= new Child();
        c.show();
    }
}