class base {
    void show(){
        System.out.println("Base show call");
    }
}
class child extends base {
    void show(){
        System.out.println("Child Class show");
        super.show(); //// access parent class show method
    }
    void disp(){
        System.out.println("Child disp show");
        super.show(); //// access parent class show method
    }
    public static void main(String...s){
        base b= new child(); //////upcasting
        b.show();
        ////We can't access parent class refferance to child class .
        child c=(child)b; //// Downcasting 
        c.disp();
    }
}