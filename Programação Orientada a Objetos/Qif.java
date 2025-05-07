class Qif {
    static int g(int a, int b)
    {
        int r = 0;
        if (a < b){
            r = a - b;
        }else{
            r = a + b;
        }
        return r;
    }
    static int f(int m, int n){
        int x = m - n * 3;
        System.out.println(x);
        int y = 3 * m - n;
        System.out.println(y);
        return g(x, y);
    }
    public static void main(String[] args) {
        int z = f(-4, 6);
        System.out.println(z);
    }
}