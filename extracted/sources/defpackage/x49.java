package defpackage;

import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class x49 implements d14 {
    public final qh8 b;
    public final int c;
    public final tq8 d;
    public final bp2 e;

    public x49(qh8 qh8Var, int i, tq8 tq8Var, bp2 bp2Var) {
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
        b96 b96VarT = yk4Var.t(h31.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(b96VarT.b, h31.g(j));
        return el4Var.D(b96VarT.a, iMin, b.I(), new c80(this, b96VarT, iMin, 6));
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
        if (!(obj instanceof x49)) {
            return false;
        }
        x49 x49Var = (x49) obj;
        return js3.i(this.b, x49Var.b) && this.c == x49Var.c && js3.i(this.d, x49Var.d) && js3.i(this.e, x49Var.e);
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
