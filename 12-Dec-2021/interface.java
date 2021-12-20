interface My{
    void show();

}
class child implements My{
    public void show(){
        System.out.println("Child class override interface");
    }
    public static void main(String[] args) {
        My m=new child();
        m.show();
    }
}