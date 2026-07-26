package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class h72 {
    public static volatile h72 b;
    public static final h72 c = new h72();
    public final Map a = Collections.EMPTY_MAP;

    public static h72 b() {
        h72 h72Var;
        h72 h72Var2 = b;
        if (h72Var2 != null) {
            return h72Var2;
        }
        synchronized (h72.class) {
            try {
                h72Var = b;
                if (h72Var == null) {
                    Class cls = e72.a;
                    h72 h72Var3 = null;
                    if (cls != null) {
                        try {
                            h72Var3 = (h72) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    h72Var = h72Var3 != null ? h72Var3 : c;
                    b = h72Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h72Var;
    }

    public final ir2 a(int i, ev4 ev4Var) {
        return (ir2) this.a.get(new g72(i, ev4Var));
    }
}
