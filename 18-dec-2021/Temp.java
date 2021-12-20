interface test{
    void show();
    default void display(){
        System.out.println("Interface body method in java 8");
    }
}
class Temp implements Test{
    public void show(){
        System.out.println("Show Method overriden");

    }
    public static void main(String[] args) {
        Temp t=new Temp();
        t.show();
        t.display();
    }
}