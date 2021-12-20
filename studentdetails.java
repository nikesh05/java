class studentdetails{
    int sid;
    String sname,addr;
    void input(int sid,string sname,string addr){
        this.sid=sid;
        this.sname=sname;
        this.addr=addr;
    }
    // /// Use of defauilt constructor//////////////////////////////////////
    studentdetails(){
        sid=1;
        sname="ram";
        addr="delhi";
    }
    //////// Default constructor /////////////////////////////////////////////
     void disp(){
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(addr);
    }
    public static void main(String... s) {
        studentdetails s1=new studentdetails();
        s1.disp();
        s1.input(1, "ram", "patna");
    }
}