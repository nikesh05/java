class emp{
    int eid;
    String ename,post;
    emp(int eid,String ename,String post){
        this.eid=eid;
        this.ename=ename;
        this.post=post;
    }
    void disp(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(post);
}
public static void main(String ...s) {
    emp e1=new emp(1,"ram","prog");
    e1.disp();
    emp e2=new emp(2,"Mohan","prog");
    e2.disp();
}
}