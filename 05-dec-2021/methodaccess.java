class base{
    public static  void show(){
        System.out.println("Base show call");
    }
}
class child extends base{
   public  void show(){
        System.out.println("child show class");
        super.show();
    }
    public static void main(String[] args) {
        child c=new child();
        c.show();
    }
}