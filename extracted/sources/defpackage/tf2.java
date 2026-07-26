package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.foundation.layout.LayoutOrientation;

/* JADX INFO: loaded from: classes.dex */
public final class tf2 {
    public final void a(yk4 yk4Var, yk4 yk4Var2, long j) {
        long jG = dt2.g(j, LayoutOrientation.a);
        if (yk4Var != null) {
            int iL = yk4Var.l(h31.g(jG));
            new lq3(lq3.a(iL, yk4Var.P(iL)));
        }
        if (yk4Var2 != null) {
            int iL2 = yk4Var2.l(h31.g(jG));
            new lq3(lq3.a(iL2, yk4Var2.P(iL2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2)) {
            return false;
        }
        FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.a;
        return true;
    }

    public final int hashCode() {
        return FlowLayoutOverflow$OverflowType.a.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + FlowLayoutOverflow$OverflowType.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
