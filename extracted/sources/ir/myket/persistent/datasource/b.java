package ir.myket.persistent.datasource;

import defpackage.bj6;
import defpackage.bt2;
import defpackage.eb1;
import defpackage.js3;
import defpackage.kf1;
import defpackage.ox3;
import defpackage.ug1;
import defpackage.up1;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final eb1 a;
    public final bj6 b;
    public final Object c;

    public b(eb1 eb1Var, bj6 bj6Var, Object obj) {
        js3.p(eb1Var, "dataStore");
        js3.p(bj6Var, "key");
        this.a = eb1Var;
        this.b = bj6Var;
        this.c = obj;
    }

    public final Object a(Object obj, ox3 ox3Var) {
        js3.p(obj, "thisRef");
        js3.p(ox3Var, "property");
        ug1 ug1Var = up1.a;
        return bt2.Q(kf1.c, new MyketDataStoreDelegate$get$1(null, this.a, this.b, this.c));
    }

    public final void b(Object obj, ox3 ox3Var, Object obj2) {
        js3.p(obj, "thisRef");
        js3.p(ox3Var, "property");
        ug1 ug1Var = up1.a;
        bt2.Q(kf1.c, new MyketDataStoreDelegate$update$1(null, this.a, this.b, obj2));
    }
}
