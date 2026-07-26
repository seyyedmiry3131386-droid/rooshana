package defpackage;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;

/* JADX INFO: loaded from: classes.dex */
public final class e14 extends gx4 implements f14 {
    public rp2 o;

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        return (dl4) this.o.a(el4Var, yk4Var, new h31(j));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.o + ')';
    }
}
