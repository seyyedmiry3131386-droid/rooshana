package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zq1 extends uj6 {
    public double[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            js3.o(dArrCopyOf, "copyOf(...)");
            this.a = dArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
