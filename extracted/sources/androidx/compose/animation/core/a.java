package androidx.compose.animation.core;

import defpackage.al;
import defpackage.bl;
import defpackage.dl;
import defpackage.dt2;
import defpackage.g51;
import defpackage.js3;
import defpackage.mt8;
import defpackage.o38;
import defpackage.ok4;
import defpackage.s08;
import defpackage.sf9;
import defpackage.sk;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.xe8;
import defpackage.xk;
import defpackage.zk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final mt8 a;
    public final Object b;
    public final xk c;
    public final wb5 d;
    public final wb5 e;
    public Object f;
    public Object g;
    public final d h;
    public final o38 i;
    public final dl j;
    public final dl k;
    public dl l;
    public dl m;

    public a(Object obj, mt8 mt8Var, Object obj2) {
        this.a = mt8Var;
        this.b = obj2;
        xk xkVar = new xk(mt8Var, obj, null, 60);
        this.c = xkVar;
        this.d = androidx.compose.runtime.g.h(Boolean.FALSE);
        this.e = androidx.compose.runtime.g.h(obj);
        this.h = new d();
        this.i = new o38(obj2);
        dl dlVar = xkVar.c;
        boolean z = dlVar instanceof zk;
        dl dlVar2 = z ? dt2.e : dlVar instanceof al ? dt2.f : dlVar instanceof bl ? dt2.g : dt2.h;
        this.j = dlVar2;
        dl dlVar3 = z ? dt2.a : dlVar instanceof al ? dt2.b : dlVar instanceof bl ? dt2.c : dt2.d;
        this.k = dlVar3;
        this.l = dlVar2;
        this.m = dlVar3;
    }

    public static final void a(a aVar) {
        xk xkVar = aVar.c;
        xkVar.c.d();
        xkVar.d = Long.MIN_VALUE;
        ((s08) aVar.d).setValue(Boolean.FALSE);
    }

    public static Object b(a aVar, Object obj, sk skVar, Object obj2, sf9 sf9Var, g51 g51Var, int i) {
        if ((i & 2) != 0) {
            skVar = aVar.i;
        }
        sk skVar2 = skVar;
        if ((i & 4) != 0) {
            obj2 = aVar.a.a().invoke(aVar.c.c);
        }
        if ((i & 8) != 0) {
            sf9Var = null;
        }
        Object objD = aVar.d();
        mt8 mt8Var = aVar.a;
        return d.a(aVar.h, new Animatable$runAnimation$2(aVar, obj2, new xe8(skVar2, mt8Var, objD, obj, (dl) mt8Var.b().invoke(obj2)), aVar.c.d, sf9Var, null), g51Var);
    }

    public final Object c(Object obj) {
        if (js3.i(this.l, this.j) && js3.i(this.m, this.k)) {
            return obj;
        }
        mt8 mt8Var = this.a;
        dl dlVar = (dl) mt8Var.b().invoke(obj);
        int iB = dlVar.b();
        boolean z = false;
        for (int i = 0; i < iB; i++) {
            if (dlVar.a(i) < this.l.a(i) || dlVar.a(i) > this.m.a(i)) {
                dlVar.e(i, ok4.s(dlVar.a(i), this.l.a(i), this.m.a(i)));
                z = true;
            }
        }
        return z ? mt8Var.a().invoke(dlVar) : obj;
    }

    public final Object d() {
        return ((s08) this.c.b).getValue();
    }

    public final Object e(g51 g51Var, Object obj) {
        Object objA = d.a(this.h, new Animatable$snapTo$2(this, obj, null), g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }

    public /* synthetic */ a(Object obj, mt8 mt8Var, Object obj2, int i) {
        this(obj, mt8Var, (i & 4) != 0 ? null : obj2);
    }
}
