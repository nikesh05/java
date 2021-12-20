abstract class bank{
    abstract int getRateofInterest();
}
class sbi extends bank{
    int getRateofInterest(){
        return 7;
    }
}
class pnb extends bank{
    int getRateofInterest(){
        return 8;
    }
}
class test{
    public static void main(String[] args) {
        bank b=new sbi();
        System.out.println("Rate of insteret is :"+b.getRateofInterest()+"%");
        bank b1=new pnb();
        System.out.println("Rate of insteret is :"+b1.getRateofInterest()+"%");
    }
}