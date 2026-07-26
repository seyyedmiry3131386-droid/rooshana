package defpackage;

import androidx.compose.animation.core.RepeatMode;

/* JADX INFO: loaded from: classes.dex */
public final class in3 implements sk {
    public final rx1 a;
    public final long b;

    public in3(rx1 rx1Var, long j) {
        RepeatMode repeatMode = RepeatMode.a;
        this.a = rx1Var;
        this.b = j;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        z39 z39VarA = this.a.a(mt8Var);
        RepeatMode repeatMode = RepeatMode.a;
        RepeatMode repeatMode2 = RepeatMode.a;
        nd1 nd1Var = new nd1();
        nd1Var.c = z39VarA;
        nd1Var.a = ((long) (z39VarA.p() + z39VarA.k())) * 1000000;
        nd1Var.b = this.b * 1000000;
        return nd1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof in3) {
            in3 in3Var = (in3) obj;
            if (in3Var.a.equals(this.a)) {
                RepeatMode repeatMode = RepeatMode.a;
                if (in3Var.b == this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (RepeatMode.a.hashCode() + (this.a.hashCode() * 31)) * 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }
}
