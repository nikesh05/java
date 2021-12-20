class poly{
  /*  void sum(int x,int y){
        System.out.println(x+y);

    }
    void sum(int x,int y,int z){
        System.out.println(x+y+z);
        */ 
  //  }
 /* static  void sum(int x,int y){
        System.out.println(x+y);

    }
  static  void sum(int x,int y,int z){
        System.out.println(x+y+z);
        
    }
    public static void main(String...s){
       /// poly p1=new poly();  
       // p1.sum(10,20);
       // p1.sum(10,20);
       sum(10,20); /// use static keyword no need to create object
       sum(10,20,30);
    } */

///// Call by datatype differ
/*
static  void sum(int x,int y){
    System.out.println(x+y);

}
static  void sum(Float x,Float y){
    System.out.println(x+y+z);
    
}
public static void main(String...s){
   /// poly p1=new poly();  
   // p1.sum(10,20);
   // p1.sum(10,20);
   sum(10,20); /// use static keyword no need to create object
   sum(10.4f,20.5f);
}
*/
  int sum(int x,char a){
    return(x+a);

}
  double sum(int x,int y){
    return(x+y);
    
}
public static void main(String...s){
    poly p1=new poly();  
   System.out.println(p1.sum(10, 'a'));
   System.out.println(p1.sum(10.5f, 20.4f));

}
}