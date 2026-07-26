package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class yi3 {
    public final Resources.Theme a;
    public final int b;

    public yi3(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi3)) {
            return false;
        }
        yi3 yi3Var = (yi3) obj;
        return js3.i(this.a, yi3Var.a) && this.b == yi3Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return dw1.q(sb, this.b, ')');
    }
}
