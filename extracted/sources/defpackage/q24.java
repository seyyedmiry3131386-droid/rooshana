package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class q24 extends gx4 implements f14, ri1 {
    public static final o24 r = new o24();
    public r34 o;
    public qm5 p;
    public Orientation q;

    public final boolean C0(m24 m24Var, int i) {
        if (i == 5 || i == 6) {
            if (this.q == Orientation.b) {
                return false;
            }
        } else if (i == 3 || i == 4) {
            if (this.q == Orientation.a) {
                return false;
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (D0(i)) {
            if (m24Var.b >= this.o.a.g().n - 1) {
                return false;
            }
        } else if (m24Var.a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean D0(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = y40.H(this).B.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = y40.H(this).B.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

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
        return el4Var.D(b96VarT.a, b96VarT.b, b.I(), new q(b96VarT, 6));
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }
}
