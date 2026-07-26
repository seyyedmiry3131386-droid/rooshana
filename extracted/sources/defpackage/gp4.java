package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gp4 {
    public static final gp4 d = new gp4(new pa2(16, false));
    public static final String e;
    public static final String f;
    public static final String g;
    public final Uri a;
    public final String b;
    public final Bundle c;

    static {
        String str = j29.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
    }

    public gp4(pa2 pa2Var) {
        this.a = (Uri) pa2Var.c;
        this.b = (String) pa2Var.b;
        this.c = (Bundle) pa2Var.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp4)) {
            return false;
        }
        gp4 gp4Var = (gp4) obj;
        if (Objects.equals(this.a, gp4Var.a) && Objects.equals(this.b, gp4Var.b)) {
            if ((this.c == null) == (gp4Var.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.c != null ? 1 : 0);
    }
}
