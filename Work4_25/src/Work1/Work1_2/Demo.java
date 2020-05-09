package Work1.Work1_2;

import java.util.Arrays;

import java.util.Arrays;

public class Demo {
    private byte [] by={};

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
}
