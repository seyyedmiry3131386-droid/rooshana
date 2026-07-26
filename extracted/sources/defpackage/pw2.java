package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class pw2 implements fi6 {
    public final qd a;
    public final tr5 b;
    public long c = 0;

    public pw2(qd qdVar, tr5 tr5Var) {
        this.a = qdVar;
        this.b = tr5Var;
    }

    @Override // defpackage.fi6
    public final long a(vq3 vq3Var, long j, LayoutDirection layoutDirection, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return rq3.c(rq3.c(vq3Var.b(), is3.I(jA)), this.a.a(j2, 0L, layoutDirection));
    }
}
