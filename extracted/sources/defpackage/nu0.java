package defpackage;

import coil3.intercept.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class nu0 implements ir3 {
    public final vo a;

    public nu0(vo voVar) {
        this.a = voVar;
    }

    @Override // defpackage.ir3
    public final Object a(c cVar, g51 g51Var) {
        z72 z72Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String lowerCase = "Accept".toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        Object arrayList = linkedHashMap.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(lowerCase, arrayList);
        }
        ((List) arrayList).add("image/webp,image/*");
        rm5 rm5Var = new rm5(b.T(linkedHashMap));
        pi3 pi3Var = cVar.d;
        mi3 mi3VarA = pi3.a(pi3Var);
        mi3VarA.c = js8.k(b.M(new Pair(this.a.b.equalsIgnoreCase("tv") ? "myketTvVersion" : "myketVersion", String.valueOf(1028))), pi3Var.b.toString());
        zn5 zn5Var = ri3.a;
        Object obj = mi3VarA.p;
        if (obj instanceof z72) {
            z72Var = (z72) obj;
        } else {
            if (!(obj instanceof a82)) {
                throw new AssertionError();
            }
            z72 z72Var2 = new z72((a82) obj);
            mi3VarA.p = z72Var2;
            z72Var = z72Var2;
        }
        z72Var.a.put(ri3.b, rm5Var);
        pi3 pi3VarA = mi3VarA.a();
        int i = cVar.c;
        if (i > 0) {
            cVar.a(pi3VarA, (ir3) cVar.b.get(i - 1));
        }
        return c.b(cVar, 0, pi3VarA, 5).c((ContinuationImpl) g51Var);
    }
}
