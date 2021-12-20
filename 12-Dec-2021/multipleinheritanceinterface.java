interface Test{
    void get();
}
interface Test1{
    void msg();
}
class child implements Test,Test1{
    public void get(){
        System.out.println("Test class method");

    }
    public void msg(){
        System.out.println("Test1 class method");

    }
    public static void main(String[] args) {
        Test t=new child();
        Test1 t1=new child();
        t.get();
        t1.msg();
    }
}