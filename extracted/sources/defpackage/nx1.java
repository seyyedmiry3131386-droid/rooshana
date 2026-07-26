package defpackage;

import androidx.media3.common.b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 implements mz1 {
    public final h26 a;
    public final String c;
    public final int d;
    public String f;
    public cp8 g;
    public int i;
    public int j;
    public long k;
    public b l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public nx1(String str, int i, int i2) {
        this.a = new h26(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04bb  */
    @Override // defpackage.mz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.h26 r40) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx1.a(h26):void");
    }

    public final boolean b(h26 h26Var, byte[] bArr, int i) {
        int iMin = Math.min(h26Var.a(), i - this.i);
        h26Var.h(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.mz1
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.f = ft8Var.e;
        ft8Var.b();
        this.g = x72Var.o(ft8Var.d, 1);
    }

    public final void g(g gVar) {
        int i = gVar.b;
        String str = gVar.a;
        int i2 = gVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        b bVar = this.l;
        if (bVar != null && i2 == bVar.F && i == bVar.G && str.equals(bVar.n)) {
            return;
        }
        b bVar2 = this.l;
        rj2 rj2Var = bVar2 == null ? new rj2() : bVar2.a();
        rj2Var.a = this.f;
        rj2Var.l = tv4.m(this.e);
        rj2Var.m = tv4.m(str);
        rj2Var.E = i2;
        rj2Var.F = i;
        rj2Var.d = this.c;
        rj2Var.f = this.d;
        b bVar3 = new b(rj2Var);
        this.l = bVar3;
        this.g.f(bVar3);
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
    }
}
