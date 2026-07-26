package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public static volatile i72 a;
    public static final i72 b;

    static {
        i72 i72Var = new i72();
        Map map = Collections.EMPTY_MAP;
        b = i72Var;
    }

    public static i72 a() {
        i72 i72Var;
        hn6 hn6Var = hn6.c;
        i72 i72Var2 = a;
        if (i72Var2 != null) {
            return i72Var2;
        }
        synchronized (i72.class) {
            try {
                i72Var = a;
                if (i72Var == null) {
                    Class cls = f72.a;
                    i72 i72Var3 = null;
                    if (cls != null) {
                        try {
                            i72Var3 = (i72) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    i72Var = i72Var3 != null ? i72Var3 : b;
                    a = i72Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i72Var;
    }
}
