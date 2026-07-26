package defpackage;

import androidx.compose.animation.core.RepeatMode;

/* JADX INFO: loaded from: classes.dex */
public final class c47 implements sc2 {
    public final lt8 a;
    public final RepeatMode b;
    public final long c;

    public c47(lt8 lt8Var, RepeatMode repeatMode, long j) {
        this.a = lt8Var;
        this.b = repeatMode;
        this.c = j;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        z39 z39VarA = this.a.a(mt8Var);
        hg0 hg0Var = new hg0();
        hg0Var.c = z39VarA;
        hg0Var.d = this.b;
        hg0Var.a = ((long) (z39VarA.p() + z39VarA.k())) * 1000000;
        hg0Var.b = this.c * 1000000;
        return hg0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c47) {
            c47 c47Var = (c47) obj;
            if (c47Var.a.equals(this.a) && c47Var.b == this.b && c47Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 31) * 31)) * 31;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }
}
