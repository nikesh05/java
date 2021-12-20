class employee {
    float sal=1000;
}
class programmer extends employee {
    int bonous=5000;
    public static void main(String...s) {
        programmer p=new programmer();
        System.out.println(p.sal + p.bonous);
    }
}