package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class oj implements dr8 {
    public final jr8 a;
    public qd b;
    public final wb5 c = g.h(new zq3(0));
    public final rb5 d;

    public oj(jr8 jr8Var, qd qdVar) {
        this.a = jr8Var;
        this.b = qdVar;
        long[] jArr = ce7.a;
        this.d = new rb5();
    }

    @Override // defpackage.dr8
    public final boolean a(Enum r2, Enum r3) {
        return r2.equals(b()) && r3.equals(c());
    }

    @Override // defpackage.dr8
    public final Object b() {
        return this.a.f().b();
    }

    @Override // defpackage.dr8
    public final Object c() {
        return this.a.f().c();
    }
}
