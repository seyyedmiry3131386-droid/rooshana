package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gq3 extends uj6 {
    public int[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
