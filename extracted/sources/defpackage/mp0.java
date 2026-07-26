package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mp0 extends rh3 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final rh3[] f;

    public mp0(String str, boolean z, boolean z2, String[] strArr, rh3[] rh3VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = rh3VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mp0.class == obj.getClass()) {
            mp0 mp0Var = (mp0) obj;
            if (this.c == mp0Var.c && this.d == mp0Var.d && Objects.equals(this.b, mp0Var.b) && Arrays.equals(this.e, mp0Var.e) && Arrays.equals(this.f, mp0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
