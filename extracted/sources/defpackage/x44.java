package defpackage;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class x44 {
    public final wb5 A;
    public final wb5 B;
    public tg8 a;
    public final my6 b;
    public final h18 c;
    public final do3 d;
    public ji8 e;
    public final wb5 f;
    public final wb5 g;
    public v04 h;
    public final wb5 i;
    public ll j;
    public final wb5 k;
    public final wb5 l;
    public final wb5 m;
    public final wb5 n;
    public final wb5 o;
    public boolean p;
    public final wb5 q;
    public final pa2 r;
    public final wb5 s;
    public final wb5 t;
    public dp2 u;
    public final x51 v;
    public final x51 w;
    public final x51 x;
    public final jx9 y;
    public long z;

    public x44(tg8 tg8Var, my6 my6Var, h18 h18Var) {
        this.a = tg8Var;
        this.b = my6Var;
        this.c = h18Var;
        do3 do3Var = new do3();
        ll llVar = ml.a;
        long j = zi8.b;
        zh8 zh8Var = new zh8(llVar, j, (zi8) null);
        do3Var.a = zh8Var;
        do3Var.b = new jg0(llVar, zh8Var.b);
        this.d = do3Var;
        Boolean bool = Boolean.FALSE;
        this.f = g.h(bool);
        this.g = g.h(new au1(0));
        this.i = g.h(null);
        this.k = g.h(HandleState.a);
        this.l = g.h(bool);
        this.m = g.h(bool);
        this.n = g.h(bool);
        this.o = g.h(bool);
        this.p = true;
        this.q = g.h(Boolean.TRUE);
        this.r = new pa2(h18Var);
        this.s = g.h(bool);
        this.t = g.h(bool);
        this.u = new us3(7);
        this.v = new x51(this, 2);
        this.w = new x51(this, 3);
        this.x = new x51(this, 4);
        this.y = dt2.c();
        this.z = zu0.h;
        this.A = g.h(new zi8(j));
        this.B = g.h(new zi8(j));
    }

    public final HandleState a() {
        return (HandleState) ((s08) this.k).getValue();
    }

    public final boolean b() {
        return ((Boolean) ((s08) this.f).getValue()).booleanValue();
    }

    public final v04 c() {
        v04 v04Var = this.h;
        if (v04Var == null || !v04Var.h()) {
            return null;
        }
        return v04Var;
    }

    public final si8 d() {
        return (si8) ((s08) this.i).getValue();
    }

    public final void e(long j) {
        ((s08) this.B).setValue(new zi8(j));
    }

    public final void f(long j) {
        ((s08) this.A).setValue(new zi8(j));
    }
}
