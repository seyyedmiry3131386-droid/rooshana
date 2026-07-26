package defpackage;

import com.google.common.collect.ImmutableSet;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gh7 {
    public static final gh7 b;
    public final ImmutableSet a;

    static {
        hl5 hl5Var = new hl5(8, false);
        hl5Var.b = ImmutableSet.m(2, 1, 5);
        b = new gh7(hl5Var);
    }

    public gh7(hl5 hl5Var) {
        this.a = (ImmutableSet) hl5Var.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gh7) && this.a.equals(((gh7) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
