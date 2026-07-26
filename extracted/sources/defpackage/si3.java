package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class si3 {
    public static final zn5 a = new zn5(ar8.a);
    public static final zn5 b = new zn5(s29.b);
    public static final zn5 c = new zn5(null);
    public static final zn5 d;
    public static final zn5 e;
    public static final zn5 f;
    public static final zn5 g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new zn5(bool);
        e = new zn5(null);
        f = new zn5(bool);
        g = new zn5(Boolean.FALSE);
    }

    public static final Bitmap.Config a(uv5 uv5Var) {
        return (Bitmap.Config) gu9.r(uv5Var, b);
    }
}
