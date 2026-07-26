package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class np0 extends uj6 {
    public char[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            js3.o(cArrCopyOf, "copyOf(...)");
            this.a = cArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
