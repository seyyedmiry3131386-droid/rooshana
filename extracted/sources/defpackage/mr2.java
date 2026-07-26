package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class mr2 implements xr7 {
    public final rp2 a;

    public mr2(rp2 rp2Var) {
        this.a = rp2Var;
    }

    @Override // defpackage.xr7
    public final rq4 a(long j, LayoutDirection layoutDirection, qj1 qj1Var) {
        eh ehVarA = gh.a();
        this.a.a(ehVarA, new ey7(j), layoutDirection);
        ehVarA.a.close();
        return new vw5(ehVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        mr2 mr2Var = obj instanceof mr2 ? (mr2) obj : null;
        return (mr2Var != null ? mr2Var.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
