class copycon{
    int x,y;
    copycon(int x,int y){
        this.x=x;
        this.y=y;

    }
    copycon(copycon z){
        this.x=z.x;
        this.y=z.y;
    }
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String...s) {
        copycon c1=new copycon(10,20);
        c1.show();
        copycon c2=new copycon(c1);
        c2.show();
    }
}