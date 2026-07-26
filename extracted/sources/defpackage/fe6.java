package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fe6 {
    public static final fe6 c = new fe6(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = j29.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public fe6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe6)) {
            return false;
        }
        fe6 fe6Var = (fe6) obj;
        return this.a == fe6Var.a && this.b == fe6Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
