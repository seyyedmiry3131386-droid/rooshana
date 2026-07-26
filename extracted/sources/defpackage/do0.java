package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class do0 extends gc1 implements ta8 {
    public ta8 e;
    public long f;
    public final /* synthetic */ int g = 0;
    public Object h;

    public /* synthetic */ do0() {
    }

    @Override // defpackage.ta8
    public final int a(long j) {
        ta8 ta8Var = this.e;
        ta8Var.getClass();
        return ta8Var.a(j - this.f);
    }

    @Override // defpackage.ta8
    public final long e(int i) {
        ta8 ta8Var = this.e;
        ta8Var.getClass();
        return ta8Var.e(i) + this.f;
    }

    @Override // defpackage.gc1
    public final void f() {
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.e = null;
    }

    @Override // defpackage.gc1
    public final void g() {
        switch (this.g) {
            case 0:
                eo0 eo0Var = (eo0) ((v4) this.h).b;
                eo0Var.getClass();
                f();
                eo0Var.b.add(this);
                break;
            default:
                ((dj1) this.h).o(this);
                break;
        }
    }

    @Override // defpackage.ta8
    public final List h(long j) {
        ta8 ta8Var = this.e;
        ta8Var.getClass();
        return ta8Var.h(j - this.f);
    }

    @Override // defpackage.ta8
    public final int k() {
        ta8 ta8Var = this.e;
        ta8Var.getClass();
        return ta8Var.k();
    }

    public do0(dj1 dj1Var) {
        this.h = dj1Var;
    }
}
