package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hq4 {
    public final jr4 a;
    public final int b;
    public final int c;
    public final gq4 d;
    public final Bundle e;

    public hq4(jr4 jr4Var, int i, int i2, boolean z, gq4 gq4Var, Bundle bundle) {
        this.a = jr4Var;
        this.b = i;
        this.c = i2;
        this.d = gq4Var;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hq4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        hq4 hq4Var = (hq4) obj;
        gq4 gq4Var = hq4Var.d;
        gq4 gq4Var2 = this.d;
        return (gq4Var2 == null && gq4Var == null) ? this.a.equals(hq4Var.a) : Objects.equals(gq4Var2, gq4Var);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        jr4 jr4Var = this.a;
        sb.append(jr4Var.a.a);
        sb.append(", uid=");
        return dw1.k(jr4Var.a.c, "}", sb);
    }
}
