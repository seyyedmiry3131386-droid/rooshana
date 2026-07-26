package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class u16 extends m91 {
    public final /* synthetic */ int n;
    public final Method o;
    public final int p;
    public final boolean q;

    public /* synthetic */ u16(Method method, int i, boolean z, int i2) {
        this.n = i2;
        this.o = method;
        this.p = i;
        this.q = z;
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        switch (this.n) {
            case 0:
                Map map = (Map) obj;
                int i = this.p;
                Method method = this.o;
                if (map == null) {
                    throw rq4.K(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw rq4.K(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw rq4.K(method, i, o40.y("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw rq4.K(method, i, "Field map value '" + value + "' converted to null by " + th0.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    e57Var.a(str, string, this.q);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i2 = this.p;
                Method method2 = this.o;
                if (map2 == null) {
                    throw rq4.K(method2, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw rq4.K(method2, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw rq4.K(method2, i2, o40.y("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    e57Var.b(str2, value2.toString(), this.q);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i3 = this.p;
                Method method3 = this.o;
                if (map3 == null) {
                    throw rq4.K(method3, i3, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw rq4.K(method3, i3, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw rq4.K(method3, i3, o40.y("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw rq4.K(method3, i3, "Query map value '" + value3 + "' converted to null by " + th0.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    e57Var.d(str3, string2, this.q);
                }
                return;
        }
    }
}
