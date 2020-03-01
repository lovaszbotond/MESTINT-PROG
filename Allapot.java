public class Allapot {
    int[] a = new int[4];

    public Allapot() { // kezdő állapot
        a[1] = 5;
        a[2] = 0;
        a[3] = 0;
    }

    boolean isCel() { // célfeltétel
        return a[1] == 4;
    }

    @Override
    public String toString() {
        return "(" + a[1] + "," + a[2] + "," + a[3] + ")";
    }

    // equals , hashCode

    public static void main(String[] args) {
        Allapot a = new Allapot();
        Operator o = new Operator(2, 3); // itt tudom alakítani a parametereimet
        System.out.println(o.isAlkalmazhato(a)); //
    }
}