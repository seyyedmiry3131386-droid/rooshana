package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lp0 extends rh3 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final rh3[] g;

    public lp0(String str, int i, int i2, long j, long j2, rh3[] rh3VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = rh3VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lp0.class == obj.getClass()) {
            lp0 lp0Var = (lp0) obj;
            if (this.c == lp0Var.c && this.d == lp0Var.d && this.e == lp0Var.e && this.f == lp0Var.f && Objects.equals(this.b, lp0Var.b) && Arrays.equals(this.g, lp0Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
