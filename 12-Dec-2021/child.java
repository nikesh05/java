abstract class base{
    base(){
        System.out.println("Base class constroctor");
    }
    abstract void display();
}
class child extends base{
    void display(){
        System.out.println("Child class method ");
    }
    public static void main(String[] args) {
        base b=new child();
        b.display();
    }
}