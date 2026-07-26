package defpackage;

import androidx.compose.ui.node.a;
import androidx.compose.ui.node.m;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l14 extends a {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l14(sd sdVar, int i) {
        super(sdVar);
        this.h = i;
    }

    @Override // androidx.compose.ui.node.a
    public final long b(m mVar, long j) {
        switch (this.h) {
            case 0:
                fy5 fy5Var = mVar.N;
                if (fy5Var != null) {
                    j = fy5Var.f(j, false);
                }
                return is3.D(j, mVar.B);
            default:
                ye4 ye4VarH0 = mVar.H0();
                js3.m(ye4VarH0);
                long j2 = ye4VarH0.q;
                return nr5.g((((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))), j);
        }
    }

    @Override // androidx.compose.ui.node.a
    public final Map c(m mVar) {
        switch (this.h) {
            case 0:
                return mVar.r0().c();
            default:
                ye4 ye4VarH0 = mVar.H0();
                js3.m(ye4VarH0);
                return ye4VarH0.r0().c();
        }
    }

    @Override // androidx.compose.ui.node.a
    public final int d(m mVar, rd rdVar) {
        switch (this.h) {
            case 0:
                return mVar.n0(rdVar);
            default:
                ye4 ye4VarH0 = mVar.H0();
                js3.m(ye4VarH0);
                return ye4VarH0.n0(rdVar);
        }
    }
}
