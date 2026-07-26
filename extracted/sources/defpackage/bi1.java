package defpackage;

import com.google.common.collect.p1;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bi1 extends ai1 {
    public final boolean e;
    public final vh1 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final int v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bi1(int r7, defpackage.yo8 r8, int r9, defpackage.vh1 r10, int r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi1.<init>(int, yo8, int, vh1, int, java.lang.String, int, boolean):void");
    }

    public static int c(bi1 bi1Var, bi1 bi1Var2) {
        dx0 dx0VarC = dx0.a.d(bi1Var.h, bi1Var2.h).c(Integer.valueOf(bi1Var.m), Integer.valueOf(bi1Var2.m), p1.c().h()).a(bi1Var.n, bi1Var2.n).a(bi1Var.o, bi1Var2.o).d(bi1Var.p, bi1Var2.p).a(bi1Var.q, bi1Var2.q).d(bi1Var.i, bi1Var2.i).d(bi1Var.e, bi1Var2.e).d(bi1Var.g, bi1Var2.g).c(Integer.valueOf(bi1Var.l), Integer.valueOf(bi1Var2.l), p1.c().h());
        boolean z = bi1Var.t;
        dx0 dx0VarD = dx0VarC.d(z, bi1Var2.t);
        boolean z2 = bi1Var.u;
        dx0 dx0VarD2 = dx0VarD.d(z2, bi1Var2.u);
        if (z && z2) {
            dx0VarD2 = dx0VarD2.a(bi1Var.v, bi1Var2.v);
        }
        return dx0VarD2.f();
    }

    @Override // defpackage.ai1
    public final int a() {
        return this.s;
    }

    @Override // defpackage.ai1
    public final boolean b(ai1 ai1Var) {
        bi1 bi1Var = (bi1) ai1Var;
        if (!this.r && !Objects.equals(this.d.n, bi1Var.d.n)) {
            return false;
        }
        this.f.getClass();
        return this.t == bi1Var.t && this.u == bi1Var.u;
    }
}
