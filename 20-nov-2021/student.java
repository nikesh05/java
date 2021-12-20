class student{
    int sid;
    String sname,stype;
    int age;
    student(int sid,String sname){
        this.sid=sid;
        this.sname=sname;

    }
    student(int sid,String sname,String stype){
        this.sid=sid;
        this.sname=sname;
        this.stype=stype;
        
    }
    student(int sid,String sname,String stype,int age){
        this.sid=sid;
        this.sname=sname;
        this.stype=stype;
        this.age=age;
        
    }
    void disp(){
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(stype);
        System.out.println(age);
    }
    public static void main(String...s) {
        student s1=new student(1,"ram");
        s1.disp();
        student s2=new student(1,"sita","two");
        s2.disp();
        student s3=new student(1,"ram","three",34);
        s3.disp();

    }
    
}