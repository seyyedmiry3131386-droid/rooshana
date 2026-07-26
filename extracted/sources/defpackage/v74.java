package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class v74 extends p {
    public final px3 a;
    public final px3 b;
    public final u74 c;

    public v74(px3 px3Var, px3 px3Var2) {
        js3.p(px3Var, "kSerializer");
        js3.p(px3Var2, "vSerializer");
        this.a = px3Var;
        this.b = px3Var2;
        this.c = new u74(px3Var.getDescriptor(), px3Var2.getDescriptor());
    }

    @Override // defpackage.p
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        js3.p(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.p
    public final Iterator c(Object obj) {
        Map map = (Map) obj;
        js3.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // defpackage.p
    public final int d(Object obj) {
        Map map = (Map) obj;
        js3.p(map, "<this>");
        return map.size();
    }

    @Override // defpackage.p
    public final void f(tz0 tz0Var, int i, Object obj) {
        Map map = (Map) obj;
        js3.p(map, "builder");
        px3 px3Var = this.a;
        u74 u74Var = this.c;
        Object objS = tz0Var.s(u74Var, i, px3Var, null);
        int i2 = tz0Var.i(u74Var);
        if (i2 != i + 1) {
            throw new IllegalArgumentException(dw1.j(i, i2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = map.containsKey(objS);
        px3 px3Var2 = this.b;
        map.put(objS, (!zContainsKey || (px3Var2.getDescriptor().getKind() instanceof yj6)) ? tz0Var.s(u74Var, i2, px3Var2, null) : tz0Var.s(u74Var, i2, px3Var2, b.J(map, objS)));
    }

    @Override // defpackage.p
    public final Object g(Object obj) {
        js3.p(null, "<this>");
        return new LinkedHashMap((Map) null);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.c;
    }

    @Override // defpackage.p
    public final Object h(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        js3.p(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        int iD = d(obj);
        u74 u74Var = this.c;
        uz0 uz0VarD = q12Var.D(u74Var, iD);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            uz0VarD.o(u74Var, i, this.a, key);
            i += 2;
            uz0VarD.o(u74Var, i2, this.b, value);
        }
        uz0VarD.a(u74Var);
    }
}
