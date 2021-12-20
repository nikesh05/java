//we can define static method in interface using static keywords.
interface Test{
    void show();
    static int sum(){
        return 3+4;
    }
}
class Temp implements Test{
    public void show(){
        System.out.println("Show method overriden");
    }
    public static void main(String[] args) {
        Test t=new Temp();
        t.show();
        System.out.println(Test.sum());
    }
}