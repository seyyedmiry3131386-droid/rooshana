package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zh5 {
    public final int a;
    public lj5 b = null;
    public Bundle c = null;

    public zh5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh5)) {
            return false;
        }
        zh5 zh5Var = (zh5) obj;
        if (this.a != zh5Var.a || !js3.i(this.b, zh5Var.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = zh5Var.c;
        if (js3.i(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !a27.b(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        lj5 lj5Var = this.b;
        int iHashCode = i + (lj5Var != null ? lj5Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null) {
            return a27.c(bundle) + (iHashCode * 31);
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zh5.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
