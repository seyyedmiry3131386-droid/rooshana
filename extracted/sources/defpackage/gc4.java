package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class gc4 extends ic4 {
    public final /* synthetic */ int d;
    public volatile long e;
    public c27 f;
    public c27 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc4(ReferenceQueue referenceQueue, Object obj, int i, c27 c27Var, int i2) {
        super(referenceQueue, obj, i, c27Var);
        this.d = i2;
    }

    @Override // defpackage.ic4, defpackage.c27
    public c27 e() {
        switch (this.d) {
            case 0:
                return this.g;
            default:
                return super.e();
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public long g() {
        switch (this.d) {
            case 1:
                return this.e;
            default:
                return super.g();
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void h(c27 c27Var) {
        switch (this.d) {
            case 1:
                this.g = c27Var;
                break;
            default:
                super.h(c27Var);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void i(c27 c27Var) {
        switch (this.d) {
            case 1:
                this.f = c27Var;
                break;
            default:
                super.i(c27Var);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void j(long j) {
        switch (this.d) {
            case 0:
                this.e = j;
                break;
            default:
                super.j(j);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void k(c27 c27Var) {
        switch (this.d) {
            case 0:
                this.g = c27Var;
                break;
            default:
                super.k(c27Var);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public c27 l() {
        switch (this.d) {
            case 1:
                return this.f;
            default:
                return super.l();
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public long m() {
        switch (this.d) {
            case 0:
                return this.e;
            default:
                return super.m();
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void n(long j) {
        switch (this.d) {
            case 1:
                this.e = j;
                break;
            default:
                super.n(j);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public c27 o() {
        switch (this.d) {
            case 0:
                return this.f;
            default:
                return super.o();
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public void p(c27 c27Var) {
        switch (this.d) {
            case 0:
                this.f = c27Var;
                break;
            default:
                super.p(c27Var);
                break;
        }
    }

    @Override // defpackage.ic4, defpackage.c27
    public c27 q() {
        switch (this.d) {
            case 1:
                return this.g;
            default:
                return super.q();
        }
    }
}
