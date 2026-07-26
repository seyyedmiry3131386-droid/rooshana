package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class zn1 {
    public final boolean a;
    public final boolean b;
    public final SecureFlagPolicy c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public zn1(boolean z, boolean z2, int i) {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.a;
        this.a = true;
        this.b = true;
        this.c = secureFlagPolicy;
        this.d = z;
        this.e = z2;
        this.f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1)) {
            return false;
        }
        zn1 zn1Var = (zn1) obj;
        return this.a == zn1Var.a && this.b == zn1Var.b && this.c == zn1Var.c && this.d == zn1Var.d && this.e == zn1Var.e;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }
}
