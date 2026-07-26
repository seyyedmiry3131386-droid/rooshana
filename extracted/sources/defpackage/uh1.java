package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 extends gp8 {
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;

    public uh1(vh1 vh1Var) {
        e(vh1Var);
        this.F = vh1Var.o0;
        this.G = vh1Var.p0;
        this.H = vh1Var.q0;
        this.I = vh1Var.r0;
        this.J = vh1Var.s0;
        this.K = vh1Var.t0;
        this.L = vh1Var.u0;
        SparseArray sparseArray = vh1Var.v0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.M = sparseArray2;
        this.N = vh1Var.w0.clone();
    }

    @Override // defpackage.gp8
    public final void a(ep8 ep8Var) {
        this.D.put(ep8Var.a, ep8Var);
    }

    @Override // defpackage.gp8
    public final hp8 b() {
        return new vh1(this);
    }

    @Override // defpackage.gp8
    public final gp8 c() {
        super.c();
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 d(int i) {
        super.d(i);
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 g() {
        this.y = -3;
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 h(ep8 ep8Var) {
        super.h(ep8Var);
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 i(String[] strArr) {
        super.i(strArr);
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 j(String str) {
        super.j(str);
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 k(String[] strArr) {
        super.k(strArr);
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 l() {
        super.l();
        return this;
    }

    @Override // defpackage.gp8
    public final gp8 m(int i, boolean z) {
        super.m(i, z);
        return this;
    }

    public final void n(Set set) {
        this.E.clear();
        this.E.addAll(set);
    }

    public uh1() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
    }
}
