package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ce2 extends uj6 {
    public float[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            js3.o(fArrCopyOf, "copyOf(...)");
            this.a = fArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
