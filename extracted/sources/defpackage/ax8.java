package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ax8 extends uj6 {
    public short[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(sArrCopyOf, "copyOf(...)");
        return new zw8(sArrCopyOf);
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            js3.o(sArrCopyOf, "copyOf(...)");
            this.a = sArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
