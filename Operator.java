import java.util.*;

public class Operator {
    int i, j;

    public Operator(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static final Set<Operator> Operators = new HashSet<>();

    static {
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                Operators.add(new Operator(i, j));
    }
    static final int[] maxH = { 0, 5, 3, 2 };// a nulla azert van ott , mert a 0. indexu elemet nem fogom használni

    boolean isAlkalmazhato(Allapot allapot) {
        int a[] = allapot.a;
        return a[i] > 0 && a[j] > maxH[j];
    }

    Allapot alkalmaz(Allapot allapot) {
        Allapot uj = new Allapot();
        int a[] = allapot.a;
        int b[] = uj.a;
        int m = Math.min(a[i], maxH[j] - a[j]);

        for (int k : new int[] { 1, 2, 3 }) {
            if (k == j)
                b[k] = a[k] + m;
            else if (k == 1)
                b[k] = a[k] - m;
            else
                b[k] = a[k];
        }

        return uj;
    }
}