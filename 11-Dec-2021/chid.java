class base {
    void show(){
        System.out.println("Base show call");
    }
}
class child extends base {
    void show(){
        System.out.println("Child Class show");
    }
    public static void main(String...s){
        base b= new child();
        b.show();
    }
}