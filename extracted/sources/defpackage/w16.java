package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class w16 extends m91 {
    public final /* synthetic */ int n = 0;
    public final Method o;
    public final int p;
    public final l51 q;
    public final Object r;

    public w16(Method method, int i, l51 l51Var, String str) {
        this.o = method;
        this.p = i;
        this.q = l51Var;
        this.r = str;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        int i = this.n;
        l51 l51Var = this.q;
        Object obj2 = this.r;
        Method method = this.o;
        int i2 = this.p;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    e57Var.c((by2) obj2, (b57) l51Var.i(obj));
                    return;
                } catch (IOException e) {
                    throw rq4.K(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw rq4.K(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw rq4.K(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw rq4.K(method, i2, o40.y("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", o40.y("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    by2 by2Var = by2.b;
                    e57Var.c(wu8.E(strArr), (b57) l51Var.i(value));
                }
                return;
        }
    }

    public w16(Method method, int i, by2 by2Var, l51 l51Var) {
        this.o = method;
        this.p = i;
        this.r = by2Var;
        this.q = l51Var;
    }
}
