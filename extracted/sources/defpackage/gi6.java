package defpackage;

import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.d;

/* JADX INFO: loaded from: classes.dex */
public final class gi6 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public gi6(int i, boolean z) {
        this((i & 1) != 0 ? false : z, SecureFlagPolicy.a, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi6)) {
            return false;
        }
        gi6 gi6Var = (gi6) obj;
        return this.a == gi6Var.a && this.b == gi6Var.b && this.c == gi6Var.c && this.d == gi6Var.d && this.e == gi6Var.e;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + 1237;
    }

    public gi6(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        s01 s01Var = d.a;
        int i = !z ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.b ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = secureFlagPolicy == SecureFlagPolicy.a;
        this.a = i;
        this.b = z3;
        this.c = true;
        this.d = true;
        this.e = true;
    }
}
