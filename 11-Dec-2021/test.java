abstract class shape{
    abstract void drow();
}
class Rectange extends shape{
    void drow(){
        System.out.println("Drowing ractangel");
    }
}
class Circle extends shape{
    void drow(){
        System.out.println("Drowing Circle");
    }
}
class test{
    public static void main(String[] args) {
        shape sr=new Rectange();
        sr.drow();
        shape c=new Circle();
        c.drow();

    }
}