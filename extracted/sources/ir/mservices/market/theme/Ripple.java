package ir.mservices.market.theme;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Ripple implements Serializable {
    public final Integer a;
    public final int b;
    public final int c;

    public Ripple(Integer num, int i, int i2) {
        this.a = num;
        this.b = i;
        this.c = i2;
    }

    public static int a(Ripple ripple, int i) {
        Integer num = ripple.a;
        return num != null ? num.intValue() : Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{41, Integer.valueOf(i & 16777215)}, 2)));
    }
}
