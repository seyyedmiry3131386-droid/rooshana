package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bp8 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public bp8(byte[] bArr, int i, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bp8.class == obj.getClass()) {
            bp8 bp8Var = (bp8) obj;
            if (this.a == bp8Var.a && this.c == bp8Var.c && this.d == bp8Var.d && Arrays.equals(this.b, bp8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
