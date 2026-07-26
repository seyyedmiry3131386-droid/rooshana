package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends rh3 {
    public final byte[] b;

    public gb0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gb0.class == obj.getClass()) {
            gb0 gb0Var = (gb0) obj;
            if (this.a.equals(gb0Var.a) && Arrays.equals(this.b, gb0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + rm7.k(this.a, 527, 31);
    }
}
