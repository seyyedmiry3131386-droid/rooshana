package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 extends f58 implements u48 {
    public final bp2 b;
    public final t08 c;
    public bk1 d = new bk1(g08.j().g());

    public ck1(bp2 bp2Var, t08 t08Var) {
        this.b = bp2Var;
        this.c = t08Var;
    }

    @Override // defpackage.e58
    public final g58 a() {
        return this.d;
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.d = (bk1) g58Var;
    }

    @Override // defpackage.u48
    public final Object getValue() {
        dp2 dp2VarE = g08.j().e();
        if (dp2VarE != null) {
            dp2VarE.invoke(this);
        }
        c08 c08VarJ = g08.j();
        return h((bk1) g08.i(this.d, c08VarJ), c08VarJ, true, this.b).f;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bk1 h(defpackage.bk1 r22, defpackage.c08 r23, boolean r24, defpackage.bp2 r25) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck1.h(bk1, c08, boolean, bp2):bk1");
    }

    public final bk1 i() {
        c08 c08VarJ = g08.j();
        return h((bk1) g08.i(this.d, c08VarJ), c08VarJ, false, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        bk1 bk1Var = (bk1) g08.h(this.d);
        sb.append(bk1Var.c(this, g08.j()) ? String.valueOf(bk1Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
