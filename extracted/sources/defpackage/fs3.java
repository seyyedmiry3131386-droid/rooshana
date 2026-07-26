package defpackage;

import androidx.compose.ui.node.j;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class fs3 extends gx4 implements f14 {
    public final /* synthetic */ int o;

    public abstract long C0(yk4 yk4Var, long j);

    public abstract boolean D0();

    @Override // defpackage.f14
    public int a(j jVar, yk4 yk4Var, int i) {
        switch (this.o) {
        }
        return yk4Var.l(i);
    }

    public int b(j jVar, yk4 yk4Var, int i) {
        switch (this.o) {
        }
        return yk4Var.P(i);
    }

    public dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        long jC0 = C0(yk4Var, j);
        if (D0()) {
            jC0 = j31.e(j, jC0);
        }
        b96 b96VarT = yk4Var.t(jC0);
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 5));
    }

    @Override // defpackage.f14
    public int e(j jVar, yk4 yk4Var, int i) {
        switch (this.o) {
        }
        return yk4Var.n(i);
    }

    public int f(j jVar, yk4 yk4Var, int i) {
        switch (this.o) {
        }
        return yk4Var.a(i);
    }
}
