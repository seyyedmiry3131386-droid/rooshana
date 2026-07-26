package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.ui.semantics.c;

/* JADX INFO: loaded from: classes.dex */
public final class ff {
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;

    public ff(int i, tf2 tf2Var, long j, int i2, int i3, int i4) {
        this.a = i;
        this.f = tf2Var;
        this.b = j;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public dy3 a(of2 of2Var, boolean z, int i, int i2, int i3, int i4) {
        if (!of2Var.b) {
            return null;
        }
        ((tf2) this.f).getClass();
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
        return null;
    }

    public of2 b(boolean z, int i, long j, lq3 lq3Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        tf2 tf2Var = (tf2) this.f;
        int i5 = i3 + i4;
        if (lq3Var == null) {
            return new of2(true, true);
        }
        long j2 = lq3Var.a;
        tf2Var.getClass();
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.a;
        if (i2 >= this.c || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new of2(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new of2(true, true) : new of2(true, b(z, 0, lq3.a(h31.h(this.b), (((int) (j & 4294967295L)) - this.e) - i4), new lq3(lq3.a(((int) (j2 >> 32)) - this.d, (int) (4294967295L & j2))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new of2(false, false);
    }

    public ff(c cVar, int i, int i2, int i3, int i4, long j) {
        this.f = cVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.b = j;
    }
}
