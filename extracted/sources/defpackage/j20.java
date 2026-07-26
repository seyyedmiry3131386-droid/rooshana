package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j20 extends h71 {
    public final Context a;
    public final wt0 b;
    public final wt0 c;
    public final String d;

    public j20(Context context, wt0 wt0Var, wt0 wt0Var2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (wt0Var == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = wt0Var;
        if (wt0Var2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = wt0Var2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h71) {
            j20 j20Var = (j20) ((h71) obj);
            if (this.a.equals(j20Var.a) && this.b.equals(j20Var.b) && this.c.equals(j20Var.c) && this.d.equals(j20Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return dw1.s(sb, this.d, "}");
    }
}
