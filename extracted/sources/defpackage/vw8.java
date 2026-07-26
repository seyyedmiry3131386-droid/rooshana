package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vw8 extends uj6 {
    public long[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(jArrCopyOf, "copyOf(...)");
        return new uw8(jArrCopyOf);
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            js3.o(jArrCopyOf, "copyOf(...)");
            this.a = jArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
