class Test{
    int sid=1;
    String sname="Ram";
    void show(){
        System.out.println(sid);
        System.out.println(sname);
    }
    public static void main(String[] args) {
        new Test().show();
        // /////////////// Hash code
        Test s1=new Test();
        s1.show();
        System.out.println(s1.hashCode());
    }
}