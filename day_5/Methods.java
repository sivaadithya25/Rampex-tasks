public class Methods {
    int value = 5;
    public int square(int n) {
        return value * n * n;
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        String s = "Hello";
        System.out.println(s);
        int res=m.square(2);
        System.out.println(res);
    }
}
