package Work1.Work1_1;

import java.util.Arrays;

public class Demo {
    private byte [] by={65,67,68,97,98,101};

    public Demo() {
    }

    public Demo(byte[] by) {
        this.by = by;
    }

    public byte[] getBy() {
        return by;
    }

    public void setBy(byte[] by) {
        this.by = by;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "by=" + Arrays.toString(by) +
                '}';
    }

    public String toStringByNum(int num) {
        return "Demo{" +
                "by=" + Demo.toStringByNumber(by,num) +
                '}';
    }




    public static String toStringByNumber(byte[] a,int num) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = num-1; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
}
