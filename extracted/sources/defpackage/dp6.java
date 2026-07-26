package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dp6 extends bm8 {
    public static final dp6 g = new dp6(ImmutableList.q(), null);
    public static final Object h = new Object();
    public final ImmutableList e;
    public final cp6 f;

    public dp6(ImmutableList immutableList, cp6 cp6Var) {
        this.e = immutableList;
        this.f = cp6Var;
    }

    @Override // defpackage.bm8
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bm8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp6)) {
            return false;
        }
        dp6 dp6Var = (dp6) obj;
        return Objects.equals(this.e, dp6Var.e) && Objects.equals(this.f, dp6Var.f);
    }

    @Override // defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        cp6 cp6VarS = s(i);
        Long lValueOf = Long.valueOf(cp6VarS.b);
        long jV = j29.V(cp6VarS.c);
        yl8Var.getClass();
        yl8Var.i(lValueOf, null, i, jV, 0L, bb.f, false);
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final int h() {
        return o();
    }

    @Override // defpackage.bm8
    public final int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    @Override // defpackage.bm8
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        cp6 cp6VarS = s(i);
        am8Var.b(h, cp6VarS.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, j29.V(cp6VarS.c), i, i, 0L);
        return am8Var;
    }

    @Override // defpackage.bm8
    public final int o() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final dp6 q(int i, List list) {
        lj3 lj3Var = new lj3(4);
        ImmutableList immutableList = this.e;
        lj3Var.Q(immutableList.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            lj3Var.O(new cp6((jp4) list.get(i2), -1L, -9223372036854775807L));
        }
        lj3Var.Q(immutableList.subList(i, immutableList.size()));
        return new dp6(lj3Var.S(), this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i) {
        if (i < 0) {
            return -1L;
        }
        ImmutableList immutableList = this.e;
        if (i < immutableList.size()) {
            return ((cp6) immutableList.get(i)).b;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cp6 s(int i) {
        cp6 cp6Var;
        ImmutableList immutableList = this.e;
        return (i != immutableList.size() || (cp6Var = this.f) == null) ? (cp6) immutableList.get(i) : cp6Var;
    }
}
