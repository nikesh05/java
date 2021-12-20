interface My{
    void show();
}
interface My1 extends My{
    void display();
}
class child implements My1{
    
    public void show(){
        System.out.println("My interface methods");
    } 
    public void display(){
        System.out.println("My1 interface methods");
    }
    public static void main(String[] args) {
        My1 m =new child();
        m.show();
        m.display();
    }
} 