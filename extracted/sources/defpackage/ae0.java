package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ae0 extends uj6 {
    public boolean[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            js3.o(zArrCopyOf, "copyOf(...)");
            this.a = zArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
