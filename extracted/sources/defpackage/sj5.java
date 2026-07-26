package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class sj5 {
    public static final yd0 b = new yd0(2, false);
    public static final yd0 c = new yd0(4, false);
    public static final xd0 d = new xd0(4, true);
    public static final xd0 e = new xd0(5, true);
    public static final yd0 f = new yd0(3, false);
    public static final xd0 g = new xd0(6, true);
    public static final xd0 h = new xd0(7, true);
    public static final yd0 i = new yd0(1, false);
    public static final xd0 j = new xd0(2, true);
    public static final xd0 k = new xd0(3, true);
    public static final yd0 l = new yd0(0, false);
    public static final xd0 m = new xd0(0, true);
    public static final xd0 n = new xd0(1, true);
    public static final yd0 o = new yd0(5, true);
    public static final xd0 p = new xd0(8, true);
    public static final xd0 q = new xd0(9, true);
    public final boolean a;

    public sj5(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
