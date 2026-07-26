package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class wo4 {
    public static final String b;
    public final Uri a;

    static {
        String str = j29.a;
        b = Integer.toString(0, 36);
    }

    public wo4(vo4 vo4Var) {
        this.a = (Uri) vo4Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo4) && this.a.equals(((wo4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
