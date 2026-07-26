package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class pv5 {
    public static final sl3 e = new sl3(12);
    public final Object a;
    public final ov5 b;
    public final String c;
    public volatile byte[] d;

    public pv5(String str, Object obj, ov5 ov5Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.a = obj;
        this.b = ov5Var;
    }

    public static pv5 a(Object obj, String str) {
        return new pv5(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pv5) {
            return this.c.equals(((pv5) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return dw1.s(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
