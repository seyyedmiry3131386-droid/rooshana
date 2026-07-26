package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.internal.d;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.sync.a;

/* JADX INFO: loaded from: classes.dex */
public final class yu1 extends gx4 implements f14 {
    public d o;
    public qp2 p;
    public Orientation q;
    public boolean r;

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
        b96 b96VarT = yk4Var.t(j);
        if (!el4Var.Q() || !this.r) {
            Pair pair = (Pair) this.p.invoke(new zq3((((long) b96VarT.b) & 4294967295L) | (((long) b96VarT.a) << 32)), new h31(j));
            d dVar = this.o;
            dh4 dh4Var = (dh4) pair.a;
            Object obj = pair.b;
            if (!js3.i(dVar.d(), dh4Var)) {
                ((s08) dVar.l).setValue(dh4Var);
                a aVar = dVar.e.b;
                boolean zG = aVar.g();
                if (zG) {
                    try {
                        je jeVar = dVar.m;
                        float fD = dVar.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            jeVar.a(fD, 0.0f);
                            dVar.i(null);
                        }
                        dVar.h(obj);
                    } finally {
                        aVar.d(null);
                    }
                }
                if (!zG) {
                    dVar.i(obj);
                }
            }
        }
        this.r = el4Var.Q() || this.r;
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new vt(el4Var, this, b96VarT, 9));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.gx4
    public final void u0() {
        this.r = false;
    }
}
