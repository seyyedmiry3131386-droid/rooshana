package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p46 {
    public static final ArrayList d = new ArrayList();
    public Object a;
    public ha8 b;
    public p46 c;

    public static p46 a(ha8 ha8Var, Object obj) {
        ArrayList arrayList = d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    p46 p46Var = new p46();
                    p46Var.a = obj;
                    p46Var.b = ha8Var;
                    return p46Var;
                }
                p46 p46Var2 = (p46) arrayList.remove(size - 1);
                p46Var2.a = obj;
                p46Var2.b = ha8Var;
                p46Var2.c = null;
                return p46Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
