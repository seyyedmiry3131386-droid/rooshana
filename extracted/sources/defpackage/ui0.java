package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ui0 extends uj6 {
    public byte[] a;
    public int b;

    @Override // defpackage.uj6
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.b);
        js3.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // defpackage.uj6
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            js3.o(bArrCopyOf, "copyOf(...)");
            this.a = bArrCopyOf;
        }
    }

    @Override // defpackage.uj6
    public final int d() {
        return this.b;
    }
}
