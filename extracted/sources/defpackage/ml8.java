package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml8 implements pc7 {
    public final pc7 a;
    public final long b;

    public ml8(pc7 pc7Var, long j) {
        this.a = pc7Var;
        this.b = j;
    }

    @Override // defpackage.pc7
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.pc7
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.pc7
    public final int g(long j) {
        return this.a.g(j - this.b);
    }

    @Override // defpackage.pc7
    public final int h(hh2 hh2Var, fc1 fc1Var, int i) {
        int iH = this.a.h(hh2Var, fc1Var, i);
        if (iH == -4) {
            fc1Var.g += this.b;
        }
        return iH;
    }
}
