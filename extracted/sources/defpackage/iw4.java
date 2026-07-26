package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iw4 extends rh3 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public iw4(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iw4.class == obj.getClass()) {
            iw4 iw4Var = (iw4) obj;
            if (this.b == iw4Var.b && this.c == iw4Var.c && this.d == iw4Var.d && Arrays.equals(this.e, iw4Var.e) && Arrays.equals(this.f, iw4Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
