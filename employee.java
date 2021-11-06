/*
With Static Keyword
class employee{
    int eid;
    String ename;
    static String cname="TCS";
    void input(int ei,String en){
        eid=ei;
        ename=en;
       

    }
    void disp(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(cname);

            }
            public static void main(String... s){
                employee e1=new employee();
                e1.input(1,"sita");
                e1.disp();
                employee e2=new employee();
                e2.input(2,"Ram");
                e2.disp();
            }
} */
class employee{
    int eid;
    String ename;
    static String cname="TCS";
    void input(int ei,String en){
        eid=ei;
        ename=en;
       

    }
    void disp(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(cname);

            }
            public static void main(String... s){
                employee e1=new employee();
                e1.input(1,"sita");
                e1.disp();
                employee e2=new employee();
                e2.input(2,"Ram");
                e2.disp();
            }
}