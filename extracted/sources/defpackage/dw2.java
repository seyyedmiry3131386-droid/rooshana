package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dw2 {
    public static final byte[] e = {0, 0, 1};
    public int a = -1;
    public int b = -1;
    public boolean c = false;
    public Object d;

    public dw2(k... kVarArr) {
        this.d = kVarArr;
    }

    public void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.d, this.a, i3);
            this.a += i3;
        }
    }
}
