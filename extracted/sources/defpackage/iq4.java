package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iq4 {
    public final ImmutableList a;
    public final int b;
    public final long c;

    public iq4(List list, int i, long j) {
        this.a = ImmutableList.n(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq4)) {
            return false;
        }
        iq4 iq4Var = (iq4) obj;
        return this.a.equals(iq4Var.a) && this.b == iq4Var.b && this.c == iq4Var.c;
    }

    public final int hashCode() {
        return tv8.u(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
