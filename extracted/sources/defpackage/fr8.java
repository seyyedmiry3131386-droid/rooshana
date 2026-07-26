package defpackage;

import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* JADX INFO: loaded from: classes.dex */
public final class fr8 implements u48 {
    public final mt8 a;
    public final wb5 b;
    public final wb5 c;
    public final wb5 d;
    public ql7 e;
    public xe8 f;
    public final wb5 g;
    public final l08 h;
    public boolean i;
    public final wb5 j;
    public dl k;
    public final p08 l;
    public boolean m;
    public final o38 n;
    public final /* synthetic */ jr8 o;

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.Map] */
    public fr8(jr8 jr8Var, Object obj, dl dlVar, mt8 mt8Var) {
        this.o = jr8Var;
        this.a = mt8Var;
        wb5 wb5VarH = g.h(obj);
        this.b = wb5VarH;
        Object objInvoke = null;
        wb5 wb5VarH2 = g.h(y97.c0(0.0f, 0.0f, null, 7));
        this.c = wb5VarH2;
        this.d = g.h(new xe8((sc2) ((s08) wb5VarH2).getValue(), mt8Var, obj, ((s08) wb5VarH).getValue(), dlVar));
        this.g = g.h(Boolean.TRUE);
        this.h = g.d(-1.0f);
        this.j = g.h(obj);
        this.k = dlVar;
        this.l = g.f(a().b());
        Float f = (Float) va9.a.get(mt8Var);
        if (f != null) {
            float fFloatValue = f.floatValue();
            dl dlVar2 = (dl) mt8Var.b().invoke(obj);
            int iB = dlVar2.b();
            for (int i = 0; i < iB; i++) {
                dlVar2.e(i, fFloatValue);
            }
            objInvoke = this.a.a().invoke(dlVar2);
        }
        this.n = y97.c0(0.0f, 0.0f, objInvoke, 3);
    }

    public final xe8 a() {
        return (xe8) ((s08) this.d).getValue();
    }

    public final float c() {
        return this.h.h();
    }

    public final void d(long j) {
        if (c() == -1.0f) {
            this.m = true;
            if (js3.i(a().c, a().d)) {
                f(a().c);
            } else {
                f(a().f(j));
                this.k = a().d(j);
            }
        }
    }

    public final void f(Object obj) {
        ((s08) this.j).setValue(obj);
    }

    public final void g(Object obj, boolean z) {
        xe8 xe8Var = this.f;
        Object obj2 = xe8Var != null ? xe8Var.c : null;
        s08 s08Var = (s08) this.b;
        boolean zI = js3.i(obj2, s08Var.getValue());
        p08 p08Var = this.l;
        wb5 wb5Var = this.d;
        sc2 sc2Var = this.n;
        if (zI) {
            ((s08) wb5Var).setValue(new xe8(sc2Var, this.a, obj, obj, this.k.c()));
            this.i = true;
            p08Var.i(a().b());
            return;
        }
        wb5 wb5Var2 = this.c;
        if (!z || this.m || (((sc2) ((s08) wb5Var2).getValue()) instanceof o38)) {
            sc2Var = (sc2) ((s08) wb5Var2).getValue();
        }
        jr8 jr8Var = this.o;
        long jE = jr8Var.e();
        wb5 wb5Var3 = jr8Var.h;
        ((s08) wb5Var).setValue(new xe8(jE <= 0 ? sc2Var : new q48(sc2Var, jr8Var.e()), this.a, obj, s08Var.getValue(), this.k));
        p08Var.i(a().b());
        this.i = false;
        ((s08) wb5Var3).setValue(Boolean.TRUE);
        if (jr8Var.h()) {
            SnapshotStateList snapshotStateList = jr8Var.i;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                fr8 fr8Var = (fr8) snapshotStateList.get(i);
                jMax = Math.max(jMax, fr8Var.l.h());
                fr8Var.d(0L);
            }
            ((s08) wb5Var3).setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.u48
    public final Object getValue() {
        return ((s08) this.j).getValue();
    }

    public final void h(Object obj, Object obj2, sc2 sc2Var) {
        ((s08) this.b).setValue(obj2);
        ((s08) this.c).setValue(sc2Var);
        if (js3.i(a().d, obj) && js3.i(a().c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final void i(Object obj, sc2 sc2Var) {
        if (this.i) {
            xe8 xe8Var = this.f;
            if (js3.i(obj, xe8Var != null ? xe8Var.c : null)) {
                return;
            }
        }
        wb5 wb5Var = this.b;
        if (js3.i(((s08) wb5Var).getValue(), obj) && c() == -1.0f) {
            return;
        }
        ((s08) wb5Var).setValue(obj);
        ((s08) this.c).setValue(sc2Var);
        Object value = c() == -3.0f ? obj : ((s08) this.j).getValue();
        wb5 wb5Var2 = this.g;
        g(value, !((Boolean) ((s08) wb5Var2).getValue()).booleanValue());
        ((s08) wb5Var2).setValue(Boolean.valueOf(c() == -3.0f));
        if (c() >= 0.0f) {
            f(a().f((long) (c() * a().b())));
        } else if (c() == -3.0f) {
            f(obj);
        }
        this.i = false;
        this.h.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + ((s08) this.j).getValue() + ", target: " + ((s08) this.b).getValue() + ", spec: " + ((sc2) ((s08) this.c).getValue());
    }
}
