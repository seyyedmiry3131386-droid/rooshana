package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dr9 {
    public final Context a;
    public final vb8 b;

    public dr9(Context context, vb8 vb8Var) {
        this.a = context;
        this.b = vb8Var;
    }

    public final boolean equals(Object obj) {
        vb8 vb8Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dr9) {
            dr9 dr9Var = (dr9) obj;
            vb8 vb8Var2 = dr9Var.b;
            if (this.a.equals(dr9Var.a) && ((vb8Var = this.b) != null ? vb8Var.equals(vb8Var2) : vb8Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        vb8 vb8Var = this.b;
        return (iHashCode * 1000003) ^ (vb8Var == null ? 0 : vb8Var.hashCode());
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        o40.I("FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf, sb);
        sb.append("}");
        return sb.toString();
    }
}
