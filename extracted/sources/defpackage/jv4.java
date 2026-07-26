package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jv4 {
    public final iv4[] a;
    public final long b;

    public jv4(iv4... iv4VarArr) {
        this(-9223372036854775807L, iv4VarArr);
    }

    public final jv4 a(iv4... iv4VarArr) {
        if (iv4VarArr.length == 0) {
            return this;
        }
        String str = j29.a;
        iv4[] iv4VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(iv4VarArr2, iv4VarArr2.length + iv4VarArr.length);
        System.arraycopy(iv4VarArr, 0, objArrCopyOf, iv4VarArr2.length, iv4VarArr.length);
        return new jv4(this.b, (iv4[]) objArrCopyOf);
    }

    public final jv4 b(jv4 jv4Var) {
        return jv4Var == null ? this : a(jv4Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jv4.class == obj.getClass()) {
            jv4 jv4Var = (jv4) obj;
            if (Arrays.equals(this.a, jv4Var.a) && this.b == jv4Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tv8.u(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public jv4(long j, iv4... iv4VarArr) {
        this.b = j;
        this.a = iv4VarArr;
    }

    public jv4(List list) {
        this((iv4[]) list.toArray(new iv4[0]));
    }
}
