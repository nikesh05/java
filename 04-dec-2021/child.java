class base{
    //private int x=10;
    protected int x=10;
}
class base2 extends base{
    int z=10;
}
class child extends base2{
    int y=20;
    void show(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String...s) {
        child c=new child();
        c.show();
        
    }
}