package defpackage;

import androidx.media3.common.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pu4 implements p62 {
    public final p62 a;
    public final yo8 b;

    public pu4(p62 p62Var, yo8 yo8Var) {
        this.a = p62Var;
        this.b = yo8Var;
    }

    @Override // defpackage.p62
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // defpackage.p62
    public final void b(long j, long j2, long j3, List list, mm4[] mm4VarArr) {
        this.a.b(j, j2, j3, list, mm4VarArr);
    }

    @Override // defpackage.p62
    public final yo8 c() {
        return this.b;
    }

    @Override // defpackage.p62
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.p62
    public final boolean e(long j, cr0 cr0Var, List list) {
        return this.a.e(j, cr0Var, list);
    }

    public final boolean equals(Object obj) {
        if (u(obj) && (obj instanceof pu4)) {
            return this.b.equals(((pu4) obj).b);
        }
        return false;
    }

    @Override // defpackage.p62
    public final void f(boolean z) {
        this.a.f(z);
    }

    @Override // defpackage.p62
    public final b g(int i) {
        return this.b.d[this.a.i(i)];
    }

    @Override // defpackage.p62
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.p62
    public final int i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.p62
    public final int j(long j, List list) {
        return this.a.j(j, list);
    }

    @Override // defpackage.p62
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.p62
    public final int l() {
        return this.a.l();
    }

    @Override // defpackage.p62
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.p62
    public final b m() {
        return this.b.d[this.a.l()];
    }

    @Override // defpackage.p62
    public final int n() {
        return this.a.n();
    }

    @Override // defpackage.p62
    public final boolean o(int i, long j) {
        return this.a.o(i, j);
    }

    @Override // defpackage.p62
    public final void p(float f) {
        this.a.p(f);
    }

    @Override // defpackage.p62
    public final Object q() {
        return this.a.q();
    }

    @Override // defpackage.p62
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.p62
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.p62
    public final int t(int i) {
        return this.a.t(i);
    }

    public final boolean u(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pu4) {
            return this.a.equals(((pu4) obj).a);
        }
        return false;
    }
}
