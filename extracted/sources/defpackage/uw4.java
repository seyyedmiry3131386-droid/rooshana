package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class uw4 {
    public final SecureFlagPolicy a;
    public final boolean b;
    public final boolean c;
    public final Boolean d;
    public final Boolean e;

    public uw4(boolean z, boolean z2) {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.a;
        this.b = true;
        this.c = true;
        this.a = secureFlagPolicy;
        this.d = Boolean.valueOf(z);
        this.e = Boolean.valueOf(z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw4)) {
            return false;
        }
        uw4 uw4Var = (uw4) obj;
        return this.a == uw4Var.a && js3.i(this.d, uw4Var.d) && js3.i(this.e, uw4Var.e) && this.c == uw4Var.c && this.b == uw4Var.b;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.e;
        return ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
    }
}
