package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xe8 implements kk {
    public final x39 a;
    public final mt8 b;
    public Object c;
    public Object d;
    public dl e;
    public dl f;
    public final dl g;
    public long h;
    public dl i;

    public xe8(sk skVar, mt8 mt8Var, Object obj, Object obj2, dl dlVar) {
        this.a = skVar.a(mt8Var);
        this.b = mt8Var;
        this.c = obj2;
        this.d = obj;
        this.e = (dl) mt8Var.b().invoke(obj);
        this.f = (dl) mt8Var.b().invoke(obj2);
        this.g = dlVar != null ? tv8.k(dlVar) : ((dl) mt8Var.b().invoke(obj)).c();
        this.h = -1L;
    }

    @Override // defpackage.kk
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.kk
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.s(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.kk
    public final mt8 c() {
        return this.b;
    }

    @Override // defpackage.kk
    public final dl d(long j) {
        if (!t61.a(this, j)) {
            return this.a.h(j, this.e, this.f, this.g);
        }
        dl dlVar = this.i;
        if (dlVar != null) {
            return dlVar;
        }
        dl dlVarR = this.a.r(this.e, this.f, this.g);
        this.i = dlVarR;
        return dlVarR;
    }

    @Override // defpackage.kk
    public final /* synthetic */ boolean e(long j) {
        return t61.a(this, j);
    }

    @Override // defpackage.kk
    public final Object f(long j) {
        if (t61.a(this, j)) {
            return this.c;
        }
        dl dlVarQ = this.a.q(j, this.e, this.f, this.g);
        int iB = dlVarQ.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(dlVarQ.a(i))) {
                yi6.b("AnimationVector cannot contain a NaN. " + dlVarQ + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.a().invoke(dlVarQ);
    }

    @Override // defpackage.kk
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (js3.i(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (dl) this.b.b().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (js3.i(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (dl) this.b.b().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
