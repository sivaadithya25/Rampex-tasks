 1. No Parameters, No Return (NP, NR)
class NpNr{
    void show() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        NpNr obj = new NpNr();
        obj.show();
    }
}
  2. No Parameters, Return (NP, R)
class NpR {
    int getValue() {
        return 10;
    }

    public static void main(String[] args) {
        NpR obj = new NpR();
        System.out.println(obj.getValue());
    }
}
3. Parameters, Return (P, R)
class PR {
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        PR obj = new PR();
        System.out.println(obj.multiply(4, 5));
    }
}
