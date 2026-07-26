package defpackage;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class tc3 implements d14 {
    public final qh8 b;
    public final int c;
    public final tq8 d;
    public final bp2 e;

    public tc3(qh8 qh8Var, int i, tq8 tq8Var, bp2 bp2Var) {
        this.b = qh8Var;
        this.c = i;
        this.d = tq8Var;
        this.e = bp2Var;
    }

    @Override // defpackage.d14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.d14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        long j2;
        if (yk4Var.n(h31.g(j)) < h31.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = h31.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        b96 b96VarT = yk4Var.t(j);
        int iMin = Math.min(b96VarT.a, h31.h(j2));
        return el4Var.D(iMin, b96VarT.b, b.I(), new ak1(iMin, 1, this, el4Var, b96VarT));
    }

    @Override // defpackage.hx4
    public final /* synthetic */ hx4 d(hx4 hx4Var) {
        return bl4.g(this, hx4Var);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc3)) {
            return false;
        }
        tc3 tc3Var = (tc3) obj;
        return js3.i(this.b, tc3Var.b) && this.c == tc3Var.c && js3.i(this.d, tc3Var.d) && js3.i(this.e, tc3Var.e);
    }

    @Override // defpackage.d14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.hx4
    public final /* synthetic */ boolean g(dp2 dp2Var) {
        return bl4.a(this, dp2Var);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (((this.b.hashCode() * 31) + this.c) * 31)) * 31);
    }

    @Override // defpackage.hx4
    public final Object i(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(obj, this);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
