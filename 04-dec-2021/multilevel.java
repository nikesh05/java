class dadaji{
    void show(){
        System.out.println( "Dadaji" );
    }
}
class papaji extends dadaji{
    void print(){
        System.out.println("Papaji");
    }
}
class child extends papaji{
    void disp(){
        System.out.println("child");
    }
    public static void main(String...s) {
        child c=new child();
        c.show();
        c.print();
        c.disp();
    }
}