package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b61 implements cl4 {
    public final /* synthetic */ x44 a;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ zh8 c;
    public final /* synthetic */ rr5 d;
    public final /* synthetic */ qj1 e;
    public final /* synthetic */ int f;

    public b61(x44 x44Var, dp2 dp2Var, zh8 zh8Var, rr5 rr5Var, qj1 qj1Var, int i) {
        this.a = x44Var;
        this.b = dp2Var;
        this.c = zh8Var;
        this.d = rr5Var;
        this.e = qj1Var;
        this.f = i;
    }

    @Override // defpackage.cl4
    public final int b(es3 es3Var, List list, int i) {
        x44 x44Var = this.a;
        x44Var.a.a(es3Var.getLayoutDirection());
        rb4 rb4Var = x44Var.a.j;
        if (rb4Var != null) {
            return d77.a(rb4Var.d());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    @Override // defpackage.cl4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dl4 d(defpackage.el4 r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b61.d(el4, java.util.List, long):dl4");
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int e(es3 es3Var, List list, int i) {
        return bl4.e(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int g(es3 es3Var, List list, int i) {
        return bl4.b(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int i(es3 es3Var, List list, int i) {
        return bl4.d(this, es3Var, list, i);
    }
}
