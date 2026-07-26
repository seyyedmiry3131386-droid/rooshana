package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class rt0 implements pc7 {
    public final pc7 a;
    public boolean b;
    public final /* synthetic */ st0 c;

    public rt0(st0 st0Var, pc7 pc7Var) {
        this.c = st0Var;
        this.a = pc7Var;
    }

    @Override // defpackage.pc7
    public final boolean b() {
        return !this.c.b() && this.a.b();
    }

    @Override // defpackage.pc7
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.pc7
    public final int g(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.g(j);
    }

    @Override // defpackage.pc7
    public final int h(hh2 hh2Var, fc1 fc1Var, int i) {
        st0 st0Var = this.c;
        if (st0Var.b()) {
            return -3;
        }
        if (this.b) {
            fc1Var.b = 4;
            return -4;
        }
        long jQ = st0Var.q();
        int iH = this.a.h(hh2Var, fc1Var, i);
        if (iH != -5) {
            long j = st0Var.f;
            if (j == Long.MIN_VALUE || ((iH != -4 || fc1Var.g < j) && !(iH == -3 && jQ == Long.MIN_VALUE && !fc1Var.f))) {
                return iH;
            }
            fc1Var.f();
            fc1Var.b = 4;
            this.b = true;
            return -4;
        }
        b bVar = (b) hh2Var.c;
        bVar.getClass();
        int i2 = bVar.J;
        int i3 = bVar.I;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (st0Var.e != 0) {
            i3 = 0;
        }
        if (st0Var.f != Long.MIN_VALUE) {
            i2 = 0;
        }
        rj2 rj2VarA = bVar.a();
        rj2VarA.H = i3;
        rj2VarA.I = i2;
        hh2Var.c = new b(rj2VarA);
        return -5;
    }
}
