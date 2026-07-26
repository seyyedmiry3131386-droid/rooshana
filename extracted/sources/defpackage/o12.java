package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o12 {
    public final u12 a;
    public final byte[] b;

    public o12(u12 u12Var, byte[] bArr) {
        if (u12Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = u12Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12)) {
            return false;
        }
        o12 o12Var = (o12) obj;
        if (this.a.equals(o12Var.a)) {
            return Arrays.equals(this.b, o12Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
