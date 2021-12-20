class testclass{
    static int x;
    
    public static void main(String...s) {
        System.out.println("Main Block");
    }
    static{
        x=10;
        System.out.println("Static Block "+x);
    }
}