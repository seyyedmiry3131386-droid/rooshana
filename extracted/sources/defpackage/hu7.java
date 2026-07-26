package defpackage;

import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class hu7 extends v2 {
    public long a;
    public om0 b;

    @Override // defpackage.v2
    public final boolean a(u2 u2Var) {
        i iVar = (i) u2Var;
        if (this.a >= 0) {
            return false;
        }
        long j = iVar.i;
        if (j < iVar.j) {
            iVar.j = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.v2
    public final g51[] b(u2 u2Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((i) u2Var).z(j);
    }
}
