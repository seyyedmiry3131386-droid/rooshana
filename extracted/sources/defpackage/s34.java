package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class s34 extends b {
    public final pg a = new pg(12);

    public s34(dp2 dp2Var) {
        dp2Var.invoke(this);
    }

    public final void b(int i, dp2 dp2Var, dp2 dp2Var2, a aVar) {
        pa2 pa2Var = new pa2(dp2Var, dp2Var2, aVar, false, 10);
        pg pgVar = this.a;
        pgVar.getClass();
        if (i < 0) {
            un3.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        bs3 bs3Var = new bs3(pgVar.b, i, pa2Var);
        pgVar.b += i;
        ((zb5) pgVar.c).b(bs3Var);
    }
}
