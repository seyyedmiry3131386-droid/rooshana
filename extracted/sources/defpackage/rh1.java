package defpackage;

import android.text.TextUtils;
import androidx.media3.common.b;
import com.google.common.collect.p1;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends ai1 implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final vh1 h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rh1(int r8, defpackage.yo8 r9, int r10, defpackage.vh1 r11, int r12, boolean r13, defpackage.qh1 r14, int r15) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh1.<init>(int, yo8, int, vh1, int, boolean, qh1, int):void");
    }

    @Override // defpackage.ai1
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ai1
    public final boolean b(ai1 ai1Var) {
        int i;
        String str;
        rh1 rh1Var = (rh1) ai1Var;
        b bVar = rh1Var.d;
        this.h.getClass();
        b bVar2 = this.d;
        int i2 = bVar2.F;
        if (i2 == -1 || i2 != bVar.F) {
            return false;
        }
        return (this.m || ((str = bVar2.n) != null && TextUtils.equals(str, bVar.n))) && (i = bVar2.G) != -1 && i == bVar.G && this.v == rh1Var.v && this.w == rh1Var.w;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(rh1 rh1Var) {
        boolean z = this.i;
        boolean z2 = this.f;
        p1 p1VarH = (z2 && z) ? ci1.l : ci1.l.h();
        boolean z3 = rh1Var.i;
        int i = rh1Var.t;
        dx0 dx0VarC = dx0.a.d(z, z3).c(Integer.valueOf(this.k), Integer.valueOf(rh1Var.k), p1.c().h()).a(this.j, rh1Var.j).a(this.l, rh1Var.l).d(this.q, rh1Var.q).d(this.n, rh1Var.n).c(Integer.valueOf(this.o), Integer.valueOf(rh1Var.o), p1.c().h()).a(this.p, rh1Var.p).d(z2, rh1Var.f).c(Integer.valueOf(this.u), Integer.valueOf(rh1Var.u), p1.c().h());
        boolean z4 = this.h.B;
        int i2 = this.t;
        if (z4) {
            dx0VarC = dx0VarC.c(Integer.valueOf(i2), Integer.valueOf(i), ci1.l.h());
        }
        dx0 dx0VarC2 = dx0VarC.d(this.v, rh1Var.v).d(this.w, rh1Var.w).d(this.x, rh1Var.x).c(Integer.valueOf(this.r), Integer.valueOf(rh1Var.r), p1VarH).c(Integer.valueOf(this.s), Integer.valueOf(rh1Var.s), p1VarH);
        if (Objects.equals(this.g, rh1Var.g)) {
            dx0VarC2 = dx0VarC2.c(Integer.valueOf(i2), Integer.valueOf(i), p1VarH);
        }
        return dx0VarC2.f();
    }
}
